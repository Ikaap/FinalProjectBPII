package com.ikapurwanti.finalproject.view

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ikapurwanti.finalproject.*
import com.ikapurwanti.finalproject.adapters.BannerCoffeAdapter
import com.ikapurwanti.finalproject.adapters.FragmentDashAdapter
import com.ikapurwanti.finalproject.adapters.PoppularCoffeAdapter
import com.ikapurwanti.finalproject.data.Banner
import com.ikapurwanti.finalproject.data.Popular

class DashboardActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        // intent ke profile
        val btnprofile = findViewById<ImageView>(R.id.iv_profile)

        btnprofile.setOnClickListener(){
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        val tvall = findViewById<TextView>(R.id.tv_all)
        tvall.setOnClickListener(){
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }

        // data coffe
        val listCoffe = arrayListOf(
            Banner(R.drawable.coffe1,"Cappucino","Espresso, Steamed milk","Rp. 25.000-,"),
            Banner(R.drawable.coffe2,"Es Latte","Espresso, Steamed milk","Rp. 20.000-,"),
            Banner(R.drawable.coffe3,"Flat Whiite","Espresso, Foam","Rp. 15.000-,"),
            Banner(R.drawable.coffe4,"Ice Americano","Espresso, Cold Water","Rp. 40.000-,"),
            Banner(R.drawable.coffe5,"Doppio","2 Oz Espresso","Rp. 35.000-,"),
            Banner(R.drawable.coffe6,"Lungo","Long Pulled Espresso","Rp. 25.000-,"),
            )

        // data coffe popular
        val listPopular = arrayListOf(
            Popular(R.drawable.coffe5,"Doppio","2 Oz Espresso"),
            Popular(R.drawable.coffe6,"Lungo","Long Pulled Espresso"),
            Popular(R.drawable.coffe7,"Machiato","Espresso Shot, Foam"),
            Popular(R.drawable.coffe8,"Milk Coffee","Hot and Ice Water"),
            Popular(R.drawable.coffe9,"Black","Just Coffee"),
        )

        val rvBannerCoffe = findViewById<RecyclerView>(R.id.rv_banner)
        rvBannerCoffe.adapter = BannerCoffeAdapter(listCoffe)
        rvBannerCoffe.layoutManager=
            LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)

        val rvPopularCoffe = findViewById<RecyclerView>(R.id.rv_popular)
        rvPopularCoffe.adapter = PoppularCoffeAdapter(listPopular)
        rvPopularCoffe.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)


        // fragment
        val fragmentdrink = FragmentDrink()
        val fragmentfood = FragmentFood()

        val tvdrink = findViewById<TextView>(R.id.tv_drink)
        val tvfood = findViewById<TextView>(R.id.tv_food)

        tvdrink.setOnClickListener(){
            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frame_layout,fragmentdrink)
            fragmentTransaction.commit()
        }

        tvfood.setOnClickListener(){
            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frame_layout,fragmentfood)
            fragmentTransaction.commit()
        }
    }

}