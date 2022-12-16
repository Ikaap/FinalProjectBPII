package com.ikapurwanti.finalproject.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ikapurwanti.finalproject.R
import com.ikapurwanti.finalproject.data.Banner
import com.ikapurwanti.finalproject.data.Popular

class PoppularCoffeAdapter (var popularList : ArrayList<Popular>): RecyclerView.Adapter<PoppularCoffeAdapter.ViewHolder>() {

    class ViewHolder(view : View): RecyclerView.ViewHolder(view){
        var fotoCoffePop = view.findViewById<ImageView>(R.id.ivPopular)
        var titleCoffePop = view.findViewById<TextView>(R.id.tvTitlePopular)
        var descCoffePop = view.findViewById<TextView>(R.id.tvDescPopular)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_popular,parent,false)
        return PoppularCoffeAdapter.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.fotoCoffePop.setImageResource(popularList[position].image)
//        holder.titleCoffe.text = popularList[position].title
//        holder.hargaCoffe.text = bannerList[position].price.toString()
        holder.titleCoffePop.text = popularList[position].title
        holder.descCoffePop.text = popularList[position].desc
        //price.toString()

    }

    override fun getItemCount(): Int {
        return popularList.size
    }
}