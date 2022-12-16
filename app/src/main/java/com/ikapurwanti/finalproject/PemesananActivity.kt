package com.ikapurwanti.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.ikapurwanti.finalproject.view.DashboardActivity

class PemesananActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pemesanan)

        var kembali = findViewById(R.id.iv_back_profile) as ImageView

        kembali.setOnClickListener(){
            val intent = Intent(PemesananActivity@this, ProfileActivity::class.java)
            startActivity(intent)
        }

    }
}