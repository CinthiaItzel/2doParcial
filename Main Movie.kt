package com.example.comppanionclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import  Clases.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun main() {
	val scaryMovie = Movie(name: "Scary movie", gender: "Comedia", duration:66.77)
	//println(scaryMovie)
	//println(scaryMovie.name)
	scaryMovie. createAt = "2000"
	//println("fcha de creación: ${scaryMovie.createAt}")
	//println(scaryMovie.component2())
	val (namedeS,genderdeS, durationdeS) = scaryMovie
	println("Duración: $durationdeS Name: $namedeS Genero: ${scaryMovie.gender}")
	val scaryMovie2= scaryMovie.copy(name"Scary movie 2", duration=83.0)
	println("""
	Scary movie: $sacryMovie
	Scary movie 2: $scaryMovie2
""".	triaIndement())
)
}
