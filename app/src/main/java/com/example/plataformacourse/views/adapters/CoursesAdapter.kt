package com.example.plataformacourse.views.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.plataformacourse.R
import com.example.plataformacourse.model.Couser

class CoursesAdapter(private val lista: List<Couser>) : Adapter<CoursesAdapter.CourseViewHolder>() {

    inner class CourseViewHolder(
        val itemView: View
    ) : ViewHolder(itemView) {
        var textTitle: TextView = itemView.findViewById(R.id.text_title)
        var imgCourse: ImageView = itemView.findViewById(R.id.img_curso)
        var textPriceCourse: TextView = itemView.findViewById(R.id.text_price)
        var layout: ConstraintLayout = itemView.findViewById(R.id.item_layout)
        var backgroundImage: ImageView = itemView.findViewById(R.id.bg_img)


        // Método para configurar os dados do item
        fun bind(item: Couser) {
            textTitle.text = item.title
            textPriceCourse.text = "R$${item.price}"

            // Carregar imagem com Glide
            val context = itemView.context
            val drawableResourceId = context.resources.getIdentifier(item.img.toString(), "drawable", context.packageName)
            Glide.with(context)
                .load(drawableResourceId)
                .into(imgCourse)

            // Definir o background com base na posição
            when (adapterPosition) {
                0 -> {
                    backgroundImage.setImageResource(R.drawable.bg_1)
                    layout.setBackgroundResource(R.drawable.list_background_1)
                }
                1 -> {
                    backgroundImage.setImageResource(R.drawable.bg_2)
                    layout.setBackgroundResource(R.drawable.list_background_2)
                }
                2 -> {
                    backgroundImage.setImageResource(R.drawable.bg_3)
                    layout.setBackgroundResource(R.drawable.list_background_3)
                }
                3 -> {
                    backgroundImage.setImageResource(R.drawable.bg_4)
                    layout.setBackgroundResource(R.drawable.list_background_4)
                }
                4 -> {
                    backgroundImage.setImageResource(R.drawable.bg_5)
                    layout.setBackgroundResource(R.drawable.list_background_5)
                }
                else -> {
                    // Limpar o background e a imagem de plano de fundo se não houver correspondência
                    backgroundImage.setImageDrawable(null)
                    layout.background = null
                }
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        val itemView = layoutInflater.inflate(
            R.layout.item_lista_cursos,
            parent,
            false
        )

        return CourseViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return lista.size
    }


    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        val item = lista[position]

        holder.bind(item)

    }

}