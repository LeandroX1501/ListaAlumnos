package com.uct.listaalumnos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var alumnoAdapter: AlumnoAdapter
    private lateinit var alumnos: List<Alumno>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerViewAlumnos)
        recyclerView.layoutManager = LinearLayoutManager(this)


        alumnos = listOf(
            Alumno("Leandro Javier", 50, R.drawable.goku),
            Alumno("Noe Florian", 80, R.drawable.messi),
            Alumno("Diego Gutierrez", 26, R.drawable.messibarcelona)
            //
        )


        alumnoAdapter = AlumnoAdapter(alumnos)
        recyclerView.adapter = alumnoAdapter
    }
}
