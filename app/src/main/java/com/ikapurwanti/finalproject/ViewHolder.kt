package com.ikapurwanti.finalproject

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
// import com.ikapurwanti.finalproject.data.Fragment

class ViewHolder (inflater: LayoutInflater, parent:
ViewGroup):

    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_fragment_template, parent, false)){
    private var ivGambar: ImageView? = null
    private var tvMenu: TextView? = null
    private var tvDeskripsi: TextView? = null
    init {
        ivGambar = itemView.findViewById(R.id.iv_gambar)
        tvMenu = itemView.findViewById(R.id.tv_menu)
        tvDeskripsi = itemView.findViewById(R.id.tv_deskripsi)
    }
//    fun tampilData(data: Fragment){
//        ivGambar?.setImageResource(data.ivGambar)
//        tvMenu?.text = data.tvMenu
//        tvDeskripsi?.text = data.tvDeskripsi
//    }
}