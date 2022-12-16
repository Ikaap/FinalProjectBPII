package com.ikapurwanti.finalproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        var btn_regis = findViewById(R.id.btn_regis) as Button

        btn_regis.setOnClickListener(){
            val intent = Intent(RegisterActivity@this,LoginActivity::class.java)
            startActivity(intent)
        }



    }

}