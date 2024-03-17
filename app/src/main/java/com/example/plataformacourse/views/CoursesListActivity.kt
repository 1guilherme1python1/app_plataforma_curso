package com.example.plataformacourse.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.plataformacourse.R
import com.example.plataformacourse.model.Couser
import com.example.plataformacourse.views.adapters.CoursesAdapter

class CoursesListActivity : AppCompatActivity() {

    private lateinit var adapterCoursesAdapter: CoursesAdapter

    private lateinit var recyclerViewCourse : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)

        initRecyclerView()

        val constraintLayout = findViewById<ConstraintLayout>(R.id.btnBackHome)

        constraintLayout.setOnClickListener {
            val intent = Intent(this, IntroActivity::class.java)
            startActivity(intent)
        }

    }

    private fun initRecyclerView() {
        val listCouses = listOf<Couser>(
            Couser("Certificado avancado de inteligencia antificial", "120", R.drawable.ic_1),
            Couser("Google Cloud Plataform Architecture", "200", R.drawable.ic_2),
            Couser("Fundamento em programacao Java", "100", R.drawable.ic_3),
            Couser("Introducao em UI design", "150", R.drawable.ic_4),
            Couser("Certificado avancado em Database", "180", R.drawable.ic_5),
            Couser("Certificado avancado em Database", "180", R.drawable.ic_5),
            Couser("Certificado avancado em Database", "180", R.drawable.ic_5),
            Couser("Certificado avancado em Database", "180", R.drawable.ic_5)
        )

        recyclerViewCourse = findViewById(R.id.rv_lista_courses)

        recyclerViewCourse.adapter = CoursesAdapter(listCouses)

        recyclerViewCourse.layoutManager = LinearLayoutManager(this)

    }
}