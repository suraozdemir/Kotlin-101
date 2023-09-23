package com.example.kotlin101.StandardProgrammingConstructs

fun main (){
    val meyveler = arrayOf("Çilek", "Muz", "Elma", "Kivi", "Kiraz")

    for (meyve in meyveler) {
        println("sonuc : $meyve ")

    }
    for ((indeks, meyve) in meyveler.withIndex()){
        println("sonuc : $indeks : $meyve")
    }
}