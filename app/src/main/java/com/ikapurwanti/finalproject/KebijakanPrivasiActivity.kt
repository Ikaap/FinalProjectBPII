package com.ikapurwanti.finalproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class KebijakanPrivasiActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kebijakan_privasi)

        var ivbackkp = findViewById<ImageView>(R.id.iv_back_kp)
        ivbackkp.setOnClickListener(){
            val intent=Intent(KebijakanPrivasiActivity@this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}