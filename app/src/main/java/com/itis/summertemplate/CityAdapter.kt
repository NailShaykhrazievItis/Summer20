package com.itis.summertemplate

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CityAdapter(
    private val list: List<City>,
    private val action: (Int) -> Unit
) : RecyclerView.Adapter<CityItem>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityItem =
        CityItem.create(parent, action)

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: CityItem, position: Int) {
        holder.bind(list[position])
    }
}
