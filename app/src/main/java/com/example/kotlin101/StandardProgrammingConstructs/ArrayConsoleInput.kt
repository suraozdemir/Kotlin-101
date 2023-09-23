package com.example.kotlin101.StandardProgrammingConstructs

import java.util.Scanner

fun main (){
    val girdi = Scanner(System.`in`)

    val isimler = Array<String>(size = 5){""}

    for (i in 0 until isimler.count()) {
        println("${i+1}. isim giriniz")
        val isim = girdi.next()
        isimler[i] = isim
    }

    for ((indeks, isim) in isimler.withIndex()) {
        println("${indeks + 1}. isim : $isim")

    }

}