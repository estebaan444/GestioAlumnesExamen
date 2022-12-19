package com.estebi.examenandroid

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.estebi.examenandroid.databinding.ItemAlumnesBinding

class AlumneViewHolder(view:View):RecyclerView.ViewHolder(view){

    val binding = ItemAlumnesBinding.bind(view)


    fun render(alumneModel: Alumne, onClickListener: (Alumne)->Unit){
        binding.nom.text = alumneModel.nom
        binding.EdadRc.text = "Edat: " + alumneModel.edad.toString()

        itemView.setOnClickListener { onClickListener(alumneModel) }
    }
}