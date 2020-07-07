package com.itis.summertemplate

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_city.view.*

class CityItem(
    view: View,
    private val action: (Int) -> Unit
) : RecyclerView.ViewHolder(view) {

    fun bind(city: City) {
//        with(itemView) {  alternative using
//            itemView.tv_city.text = city.name
//            tv_country.text = city.country
//        }
        itemView.tv_city.text = city.name
        itemView.tv_country.text = city.country

        itemView.setOnClickListener { action(city.id) }
    }

    companion object {

        fun create(parent: ViewGroup, action: (Int) -> Unit): CityItem = CityItem(
            LayoutInflater.from(parent.context).inflate(R.layout.item_city, parent, false),
            action
        )
    }
}
