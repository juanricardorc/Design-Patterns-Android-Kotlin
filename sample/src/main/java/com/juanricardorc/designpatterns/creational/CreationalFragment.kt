package com.juanricardorc.designpatterns.creational

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.juanricardorc.abstract_factory.AbstractFactoryActivity
import com.juanricardorc.designpatterns.R
import com.juanricardorc.designpatterns.listener.ItemClickListener
import com.juanricardorc.designpatterns.model.DesignPatternModel
import com.juanricardorc.factory_method.FactoryMethodActivity
import java.util.*

class CreationalFragment : Fragment(),
    ItemClickListener {

    private lateinit var creationalViewModel: CreationalViewModel
    private lateinit var creationalRecyclerView: RecyclerView
    private var models =
        listOf("Factory Method", "Builder", "Abstract Factory", "Prototype", "Singleton")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        creationalViewModel = ViewModelProvider(this).get(CreationalViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_creational, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        creationalRecyclerView = root.findViewById(R.id.creationalRecyclerView)
        creationalViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onResume() {
        super.onResume()

        var behavioralAdapter: CreationalAdapter =
            CreationalAdapter(
                getCreationals(),
                context = requireContext(),
                resource = R.layout.item_card_view,
                itemClickListener = this
            )
        creationalRecyclerView.layoutManager = LinearLayoutManager(context)
        creationalRecyclerView.adapter = behavioralAdapter
    }

    fun getCreationals(): List<DesignPatternModel> {

        var behavioralModel = LinkedList<DesignPatternModel>()

        behavioralModel.add(
            DesignPatternModel(
                "10001",
                resources.getDrawable(R.drawable.ic_miscellaneous),
                models[0]
            )
        )

        behavioralModel.add(
            DesignPatternModel(
                "10002",
                resources.getDrawable(R.drawable.ic_healthcare),
                models[1]
            )
        )

        behavioralModel.add(
            DesignPatternModel(
                "10003",
                resources.getDrawable(R.drawable.ic_shapes),
                models[2]
            )
        )

        behavioralModel.add(
            DesignPatternModel(
                "10004",
                resources.getDrawable(R.drawable.ic_edit_tools),
                models[3]
            )
        )

        behavioralModel.add(
            DesignPatternModel(
                "10005",
                resources.getDrawable(R.drawable.ic_square),
                models[4]
            )
        )

        return behavioralModel
    }

    override fun onClick(value: Any) {
        var designPatternModel: DesignPatternModel = value as DesignPatternModel
        Toast.makeText(
            context,
            designPatternModel.id + " " + designPatternModel.name,
            Toast.LENGTH_SHORT
        ).show()

        goActivity(designPatternModel.name)
    }

    private fun goActivity(name: String) {
        when (name) {
            models[0] -> {
                var intent = Intent(requireActivity().baseContext, FactoryMethodActivity::class.java)
                activity?.startActivity(intent)
            }
            models[1] -> {

            }
            models[2] -> {
                var intent = Intent(requireActivity().baseContext, AbstractFactoryActivity::class.java)
                activity?.startActivity(intent)
            }
        }

    }
}
