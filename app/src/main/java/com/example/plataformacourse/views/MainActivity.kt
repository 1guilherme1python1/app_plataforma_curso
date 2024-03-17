package com.example.plataformacourse.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.plataformacourse.R
import com.example.plataformacourse.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val btnIntroActivity = findViewById<ImageView>(binding.btnIntroActivity.id)

        btnIntroActivity.setOnClickListener {
            val intent = Intent(this, IntroActivity::class.java)
            startActivity(intent)
        }

    }

}