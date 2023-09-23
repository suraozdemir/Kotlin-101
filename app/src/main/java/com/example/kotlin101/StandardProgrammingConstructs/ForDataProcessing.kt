package com.example.kotlin101.StandardProgrammingConstructs

import java.util.Scanner

fun main (){
    val girdi = Scanner(System.`in`)

    println("İşlenecek veri miktarı")

    var veri = girdi.nextInt()

    while (veri > 0){
        println("$veri. veri")
        veri -= 1
    }
}
/*
Konsoldan girilen işlenecek veri
sayısını işleyerek ekrana yazdırınız
 */