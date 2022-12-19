package com.estebi.examenandroid.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.estebi.examenandroid.R

class AlumneAdapter(private val alumneList: List<Alumne>, private val onClickListener: (Alumne)->Unit) : RecyclerView.Adapter<AlumneViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlumneViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return AlumneViewHolder(layoutInflater.inflate(R.layout.item_alumnes, parent, false))
    }

    override fun onBindViewHolder(holder: AlumneViewHolder, position: Int) {
        val item = alumneList[position]
        holder.render(item, onClickListener)
    }

    override fun getItemCount(): Int {
        return alumneList.size
    }
}