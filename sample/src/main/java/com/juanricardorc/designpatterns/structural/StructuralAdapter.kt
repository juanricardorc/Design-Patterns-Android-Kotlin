package com.juanricardorc.designpatterns.structural

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.juanricardorc.designpatterns.R
import com.juanricardorc.designpatterns.model.DesignPatternModel

class StructuralAdapter(
    private var models: List<DesignPatternModel>,
    var context: Context,
    var resource: Int
) : RecyclerView.Adapter<StructuralAdapter.ItemHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val itemView = LayoutInflater.from(context)
            .inflate(resource, parent, false)
        return ItemHolder(itemView)
    }

    override fun getItemCount(): Int {
        return models.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.bind(holder, models[position])
    }

    class ItemHolder(view: View) : RecyclerView.ViewHolder(view) {
        var iconImageView: ImageView = view.findViewById(R.id.iconImageView) as ImageView
        var nameTextView: TextView = view.findViewById(R.id.nameTextView) as TextView

        fun bind(holder: ItemHolder, model: DesignPatternModel) {
            holder.iconImageView.setImageDrawable(model.icon)
            holder.nameTextView.text = model.name
        }
    }
}