package com.ikapurwanti.finalproject

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.ikapurwanti.finalproject.view.DashboardActivity

class ProfileActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        var iv_back_profile = findViewById(R.id.iv_back_profile) as ImageView

        iv_back_profile.setOnClickListener(){
            val intent = Intent(ProfileActivity@this,DashboardActivity::class.java)
            startActivity(intent)
        }

        var btn_login_profile = findViewById(R.id.btn_login_profile) as Button

        btn_login_profile.setOnClickListener(){
            val intent = Intent(ProfileActivity@this,LoginActivity::class.java)
            startActivity(intent)
        }

        var ivpesan = findViewById(R.id.iv_to_pesanan) as ImageView

        ivpesan.setOnClickListener(){
            val intent = Intent(ProfileActivity@this,PemesananActivity::class.java)
            startActivity(intent)
        }

        var ivmb = findViewById(R.id.iv_to_metode_bayar) as ImageView
        ivmb.setOnClickListener(){
            val intent = Intent(ProfileActivity@this, MetodeBayarActivity::class.java)
            startActivity(intent)
        }

        var ivab = findViewById(R.id.iv_to_atur_bahasa) as ImageView
        ivab.setOnClickListener(){
            val intent = Intent(ProfileActivity@this, PengaturanBahasaActivity::class.java)
            startActivity(intent)
        }

        var ivprofilemap = findViewById(R.id.iv_to_profile_map) as ImageView
        ivprofilemap.setOnClickListener(){
            val intent = Intent(ProfileActivity@this, LokasiActivity::class.java)
            startActivity(intent)
        }

        var ivkp = findViewById(R.id.iv_to_kp) as ImageView
        ivkp.setOnClickListener(){
            val intent = Intent(ProfileActivity@this, KebijakanPrivasiActivity::class.java)
            startActivity(intent)
        }
    }
}