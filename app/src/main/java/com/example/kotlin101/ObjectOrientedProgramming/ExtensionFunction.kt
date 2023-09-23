package com.example.kotlin101.ObjectOrientedProgramming

fun main () {
    /*fun Int.carpi(sayi:Int):Int {
        return this * sayi

    }
    val sonuc = 5.carpi(2)
    println(sonuc)
}
  */
    infix fun Int.carpi(sayi: Int): Int {
        return this * sayi

    }

    val sonuc = 5 carpi 2
    println(sonuc)
}