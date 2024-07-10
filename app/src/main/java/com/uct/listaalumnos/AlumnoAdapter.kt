package com.uct.listaalumnos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AlumnoAdapter(private val alumnos: List<Alumno>) :
    RecyclerView.Adapter<AlumnoAdapter.AlumnoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlumnoViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_alumno, parent, false)
        return AlumnoViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: AlumnoViewHolder, position: Int) {
        val alumno = alumnos[position]
        holder.nombreAlumno.text = alumno.nombre
        holder.edadAlumno.text = "Edad: ${alumno.edad}"
        holder.fotoAlumno.setImageResource(alumno.fotoResId)
    }

    override fun getItemCount() = alumnos.size

    class AlumnoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nombreAlumno: TextView = itemView.findViewById(R.id.nombreAlumno)
        val edadAlumno: TextView = itemView.findViewById(R.id.edadAlumno)
        val fotoAlumno: ImageView = itemView.findViewById(R.id.fotoAlumno)
    }
}
