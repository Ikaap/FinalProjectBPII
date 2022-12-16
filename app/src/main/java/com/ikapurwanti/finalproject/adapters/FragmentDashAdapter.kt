package com.ikapurwanti.finalproject.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ikapurwanti.finalproject.R
import com.ikapurwanti.finalproject.ViewHolder
import com.ikapurwanti.finalproject.data.datafragment

class FragmentDashAdapter (var fragmentlist: ArrayList<datafragment>):
    RecyclerView.Adapter<FragmentDashAdapter.ViewHolder>(){
    class ViewHolder (view : View): RecyclerView.ViewHolder(view){
        var ivGambar = view.findViewById<ImageView>(R.id.iv_gambar)
        var tvMenu = view.findViewById<TextView>(R.id.tv_menu)
        var tvDeskripsi = view.findViewById<TextView>(R.id.tv_deskripsi)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_fragment_template,parent,false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.ivGambar.setImageResource(fragmentlist[position].ivGambar)
        holder.tvMenu.text=fragmentlist[position].tvMenu
        holder.tvDeskripsi.text=fragmentlist[position].tvDeskripsi
    }
    override fun getItemCount(): Int {
        return fragmentlist.size
    }
}