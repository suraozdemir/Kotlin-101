package com.example.kotlin101
//Kullanıcıdan veri alma Konsala boşluk bırakmadan veri yaz
import java.util.Scanner

fun main () {
    println("Adınızı Girniz")

    val girdi = Scanner(System.`in`)

   // val ad = girdi.next()

    val sayi = girdi.nextInt()


    println("Adınız: $sayi")
}