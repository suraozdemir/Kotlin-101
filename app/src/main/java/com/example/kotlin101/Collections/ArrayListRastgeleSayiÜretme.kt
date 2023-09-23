package com.example.kotlin101.Collections

import kotlin.random.Random

fun main (){

    val sayilar = ArrayList<Int>()

    for (i in 1..100){
        val rastgelesayi = Random.nextInt(0, 101)
        sayilar.add(rastgelesayi)

    }
    sayilar.sort()

    for (s in sayilar){
        println(s)

    }
}