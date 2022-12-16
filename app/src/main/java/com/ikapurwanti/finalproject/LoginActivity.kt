package com.ikapurwanti.finalproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.ikapurwanti.finalproject.view.DashboardActivity

class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var iv_back_login = findViewById(R.id.iv_back_login) as ImageView

        iv_back_login.setOnClickListener(){
            val intent = Intent(LoginActivity@this,ProfileActivity::class.java)
            startActivity(intent)
        }

        var btn_login = findViewById(R.id.btn_login) as Button

        btn_login.setOnClickListener(){
            val intent = Intent(LoginActivity@this,DashboardActivity::class.java)
            startActivity(intent)
        }

        var tv_regis = findViewById(R.id.tv_regis) as TextView

        tv_regis.setOnClickListener(){
            val intent = Intent(LoginActivity@this,RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}