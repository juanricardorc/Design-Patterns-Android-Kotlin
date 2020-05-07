package com.juanricardorc.designpatterns.creational

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.juanricardorc.designpatterns.R
import com.juanricardorc.designpatterns.model.DesignPatternModel
import java.util.*

class CreationalFragment : Fragment() {

    private lateinit var creationalViewModel: CreationalViewModel
    private lateinit var creationalRecyclerView: RecyclerView

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
                resource = R.layout.item_card_view
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
                "Factory Method"
            )
        )

        behavioralModel.add(
            DesignPatternModel(
                "10002",
                resources.getDrawable(R.drawable.ic_healthcare),
                "Builder"
            )
        )

        behavioralModel.add(
            DesignPatternModel(
                "10003",
                resources.getDrawable(R.drawable.ic_shapes),
                "Abstract Factory"
            )
        )

        behavioralModel.add(
            DesignPatternModel(
                "10004",
                resources.getDrawable(R.drawable.ic_edit_tools),
                "Prototype"
            )
        )

        behavioralModel.add(
            DesignPatternModel(
                "10005",
                resources.getDrawable(R.drawable.ic_square),
                "Singleton"
            )
        )

        return behavioralModel
    }
}
