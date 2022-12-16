package com.ikapurwanti.finalproject

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Switch
import android.widget.Toast

class PengaturanBahasaActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "UseSwitchCompatOrMaterialCode")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengaturan_bahasa)

        val ivbackaturbahasa = findViewById<ImageView>(R.id.iv_back_atur_bahasa)
        ivbackaturbahasa.setOnClickListener(){
            val intent = Intent(PengaturanBahasaActivity@this, ProfileActivity::class.java)
            startActivity(intent)
        }

        val switcheng = findViewById<Switch>(R.id.switch_eng)
        switcheng.setOnCheckedChangeListener{ compoundButton, onSwitch ->
            if (onSwitch){
                Toast.makeText(applicationContext,"Bahasa : Indonesia -> English", Toast.LENGTH_SHORT).show()
                switcheng.setTextColor(Color.BLACK)
            }
            else {
                switcheng.setTextColor(Color.DKGRAY)
            }
        }
    }

}