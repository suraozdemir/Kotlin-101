package com.example.kotlin101.Collections

fun main (){
    val sayilar = ArrayList<Int>()

    sayilar.add(1)
    sayilar.add(23)
    sayilar.add(32)
    sayilar.add(47)
    sayilar.add(59)
    sayilar.add(100)
    sayilar.add(18)
    sayilar.add(18)
    sayilar.add(54)

    val tekler = ArrayList<Int>()
    val ciftler = ArrayList <Int>()

    for (s in sayilar){

        val sonuc = s % 2

        if (sonuc == 0){
            ciftler.add(s)
        }
        if (sonuc == 1){
            tekler.add(s)
        }
    }
    println("Tekler")
    for (t in tekler){
        println(t)
    }
    println("Çiftler")
    for (c in ciftler){
        println(c)
    }
}