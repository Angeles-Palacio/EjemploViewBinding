package com.example.ejemploviewbinding

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ejemploviewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)
            textoHolaMundo.text = "Menu Principal"
        }
        enableEdgeToEdge()
        setContentView(binding.root)


        }


    fun cambiarPeliculaRapidosyFuriosos(view:View){
        val intent = Intent(this, DetailActivity::class.java).apply {
            putExtra("TITULO","Rapidos y Furiosos")
            putExtra("DESCRIPCION","Fast & Furious es una franquicia de medios estadounidense centrada en una serie de películas de acción que se ocupan en gran medida de automóviles. La saga también incluye cortometrajes, una serie de televisión, espectáculos en vivo, videojuegos y atracciones de parques temáticos.")
        }
        startActivity(intent)
    }
    fun cambiarPeliculaTerminator(view:View){
        val intent = Intent(this, DetailActivity::class.java).apply {
            putExtra("TITULO","Terminator")
            putExtra("DESCRIPCION","La franquicia Terminator es un universo de ficción creado por James Cameron, que engloba películas, series de televisión, libros, cómics y videojuegos. La saga trata sobre la batalla futura entre el programa de inteligencia artificial Skynet y la humanidad, liderada por John Connor. Los productos más conocidos de Skynet en sus objetivos genocidas son los diferentes modelos de Terminator, tales como el T-101, Terminator T-800, T-1000 y T-3000.")
        }
        startActivity(intent)
    }
}
