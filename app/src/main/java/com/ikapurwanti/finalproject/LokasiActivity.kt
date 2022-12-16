package com.ikapurwanti.finalproject

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class LokasiActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lokasi)

        var ivbacklokasi = findViewById<ImageView>(R.id.iv_back_lokasi)
        ivbacklokasi.setOnClickListener(){
            val intent=Intent(LokasiActivity@this, ProfileActivity::class.java)
            startActivity(intent)
        }

        val iv_map = findViewById<ImageView>(R.id.iv_map)
        iv_map.setOnClickListener(){
           val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.id/maps/place/Universitas+Amikom+Yogyakarta/@-7.7599146,110.408133,17.81z/data=!4m5!3m4!1s0x2e7a599bd3bdc4ef:0x6f1714b0c4544586!8m2!3d-7.7599052!4d110.4090464"))
           startActivity(intent)
       }
    }
}