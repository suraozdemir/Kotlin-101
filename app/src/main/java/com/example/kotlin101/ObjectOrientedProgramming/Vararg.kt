package com.example.kotlin101.ObjectOrientedProgramming

fun main () {
    fun toplam(vararg sayılar:Int):Int {

        var sonuc =0

        for (s in sayılar){
            sonuc = sonuc + s

        }
        return sonuc
    }

    val t1 =toplam(1, 2, 3, 4, 5)
    println("t1 : $t1")
}