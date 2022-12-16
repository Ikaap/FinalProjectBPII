package com.ikapurwanti.finalproject.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet.Constraint
import androidx.recyclerview.widget.RecyclerView
import com.ikapurwanti.finalproject.R
import com.ikapurwanti.finalproject.data.Banner

class BannerCoffeAdapter (var bannerList : ArrayList<Banner>):RecyclerView.Adapter<BannerCoffeAdapter.ViewHolder>() {

    class ViewHolder(view : View): RecyclerView.ViewHolder(view) {
        var fotoCoffe = view.findViewById<ImageView>(R.id.img_content)
        var judulCoffe = view.findViewById<TextView>(R.id.tv_judul)
        var deskripsiCoffe = view.findViewById<TextView>(R.id.tv_deskripsi)
        var hargaCoffe = view.findViewById<TextView>(R.id.tv_harga)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_banner,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.fotoCoffe.setImageResource(bannerList[position].image)
        holder.judulCoffe.text = bannerList[position].title
        holder.deskripsiCoffe.text = bannerList[position].desc
        holder.hargaCoffe.text = bannerList[position].price


    }

    override fun getItemCount(): Int {
        return bannerList.size
    }
}