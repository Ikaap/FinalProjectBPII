package com.ikapurwanti.finalproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ikapurwanti.finalproject.view.DashboardActivity

class SplashScreenActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        // pertama atur di activity yang akan di proses (atur asal activitynya dulu)

        var btn_getstarted = findViewById(R.id.btn_getstarted) as Button

        btn_getstarted.setOnClickListener(){
            val intent = Intent(SplashScreenActivity@this,DashboardActivity::class.java)
            startActivity(intent)
        }

    }
}
