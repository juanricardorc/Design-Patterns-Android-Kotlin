package com.juanricardorc.designpatterns.structural

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
import com.juanricardorc.designpatterns.R
import com.juanricardorc.designpatterns.creational.CreationalAdapter
import com.juanricardorc.designpatterns.listener.ItemClickListener
import com.juanricardorc.designpatterns.model.DesignPatternModel
import java.util.*

class StructuralFragment : Fragment(),
    ItemClickListener {

    private lateinit var structuralViewModel: StructuralViewModel
    private lateinit var structuralRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        structuralViewModel = ViewModelProvider(this).get(StructuralViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_structural, container, false)
        val textView: TextView = root.findViewById(R.id.text_notifications)
        structuralRecyclerView = root.findViewById(R.id.structuralRecyclerView)
        structuralViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onResume() {
        super.onResume()

        var behavioralAdapter =
            CreationalAdapter(
                getStructurals(),
                context = requireContext(),
                resource = R.layout.item_card_view,
                itemClickListener = this
            )
        structuralRecyclerView.layoutManager = LinearLayoutManager(context)
        structuralRecyclerView.adapter = behavioralAdapter
    }

    fun getStructurals(): List<DesignPatternModel> {

        var behavioralModel = LinkedList<DesignPatternModel>()

        behavioralModel.add(
            DesignPatternModel(
                "10001",
                resources.getDrawable(R.drawable.ic_square),
                "Adapter"
            )
        )

        behavioralModel.add(
            DesignPatternModel(
                "10002",
                resources.getDrawable(R.drawable.ic_edit_tools),
                "Bridge"
            )
        )

        behavioralModel.add(
            DesignPatternModel(
                "10003",
                resources.getDrawable(R.drawable.ic_cube),
                "Composite"
            )
        )

        behavioralModel.add(
            DesignPatternModel(
                "10004",
                resources.getDrawable(R.drawable.ic_food),
                "Decorator"
            )
        )

        behavioralModel.add(
            DesignPatternModel(
                "10005",
                resources.getDrawable(R.drawable.ic_shapes),
                "Facade"
            )
        )

        behavioralModel.add(
            DesignPatternModel(
                "10006",
                resources.getDrawable(R.drawable.ic_square),
                "Flyweight"
            )
        )

        behavioralModel.add(
            DesignPatternModel(
                "10007",
                resources.getDrawable(R.drawable.ic_tool),
                "Proxy"
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
    }
}
