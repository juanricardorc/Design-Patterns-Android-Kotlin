package com.juanricardorc.designpatterns.behavioral

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.juanricardorc.designpatterns.R
import com.juanricardorc.designpatterns.model.DesignPatternModel

class BehavioralAdapter(
    private var behavioralModels: List<DesignPatternModel>,
    var context: Context,
    var resource: Int
) :
    RecyclerView.Adapter<BehavioralAdapter.ItemHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val itemView = LayoutInflater.from(context)
            .inflate(resource, parent, false)
        return ItemHolder(itemView)
    }

    override fun getItemCount(): Int {
        return behavioralModels.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        var behavioralModel = behavioralModels[position]
        holder.iconImageView.setImageDrawable(behavioralModel.icon)
        holder.nameTextView.text = behavioralModel.name
    }

    class ItemHolder(view: View) : RecyclerView.ViewHolder(view) {
        var iconImageView: ImageView = view.findViewById(R.id.iconImageView) as ImageView
        var nameTextView: TextView = view.findViewById(R.id.nameTextView) as TextView
    }
}