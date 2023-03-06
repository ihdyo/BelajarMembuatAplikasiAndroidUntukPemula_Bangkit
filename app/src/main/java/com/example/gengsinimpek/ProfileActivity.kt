package com.example.gengsinimpek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val back: ImageView = findViewById(R.id.btn_back)
        back.setOnClickListener {
            finish()
        }
    }
}