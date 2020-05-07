package com.juanricardorc.designpatterns.behavioral

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

class BehavioralFragment : Fragment() {

    private lateinit var behavioralViewModel: BehavioralViewModel
    private lateinit var behavioralRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        behavioralViewModel = ViewModelProvider(this).get(BehavioralViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_behavioral, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        behavioralRecyclerView = root.findViewById(R.id.behavioralRecyclerView)
        behavioralViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onResume() {
        super.onResume()

        var behavioralAdapter: BehavioralAdapter =
            BehavioralAdapter(
                getBehaviorals(),
                context = requireContext(),
                resource = R.layout.item_card_view
            )
        behavioralRecyclerView.layoutManager = LinearLayoutManager(context)
        behavioralRecyclerView.adapter = behavioralAdapter
    }

    fun getBehaviorals(): List<DesignPatternModel> {

        var behavioralModel = LinkedList<DesignPatternModel>()

        behavioralModel.add(
            DesignPatternModel(
                "10001",
                resources.getDrawable(R.drawable.ic_food),
                "Chain of Responsibility"
            )
        )

        behavioralModel.add(
            DesignPatternModel(
                "10002",
                resources.getDrawable(R.drawable.ic_miscellaneous),
                "Command"
            )
        )

        behavioralModel.add(
            DesignPatternModel(
                "10003",
                resources.getDrawable(R.drawable.ic_cube),
                "Iterator"
            )
        )

        behavioralModel.add(
            DesignPatternModel(
                "10004",
                resources.getDrawable(R.drawable.ic_edit_tools),
                "Mediator"
            )
        )

        behavioralModel.add(
            DesignPatternModel(
                "10005",
                resources.getDrawable(R.drawable.ic_shapes),
                "Memento"
            )
        )

        behavioralModel.add(
            DesignPatternModel(
                "10006",
                resources.getDrawable(R.drawable.ic_square),
                "Observer"
            )
        )

        behavioralModel.add(
            DesignPatternModel(
                "10007",
                resources.getDrawable(R.drawable.ic_tool),
                "State"
            )
        )

        behavioralModel.add(
            DesignPatternModel(
                "10008",
                resources.getDrawable(R.drawable.ic_healthcare),
                "Strategy"
            )
        )

        behavioralModel.add(
            DesignPatternModel(
                "10009",
                resources.getDrawable(R.drawable.ic_square),
                "Template Method"
            )
        )

        behavioralModel.add(
            DesignPatternModel(
                "100010",
                resources.getDrawable(R.drawable.ic_edit_tools),
                "Visitor"
            )
        )

        return behavioralModel
    }
}
