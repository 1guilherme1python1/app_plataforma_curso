package com.example.plataformacourse.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.plataformacourse.R

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        val btnMainActivity = findViewById<TextView>(R.id.btnSeeAll)

        btnMainActivity.setOnClickListener {
            val intent = Intent(this, CoursesListActivity::class.java)
            startActivity(intent)
        }

    }



}