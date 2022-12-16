package com.ikapurwanti.finalproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView


class MetodeBayarActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_metode_bayar)

        val ivmetodebayar = findViewById<ImageView>(R.id.iv_back_metode_bayar)
        ivmetodebayar.setOnClickListener(){
            val intent= Intent(MetodeBayarActivity@this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}