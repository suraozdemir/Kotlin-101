package com.example.kotlin101.StandardProgrammingConstructs

import java.util.Scanner

fun main (){
    val girdi = Scanner(System.`in`)

    while (true) {

        println("Sayı giriniz")

        val sayi = girdi.nextInt()
        val sonuc = sayi % 2

        if (sonuc == 0) {
            println("Çift sayıdır")
        }

        if (sonuc == 1){
            println("Tek sayıdır")
        }

        println("Çıkmak için (1) - Devam emek için diğer sayılar")

        val cikis = girdi.nextInt()

        if (cikis == 1) {
            println("Çıkış yapıldı")
            break
        }
    }

}
/*
Konsoldan girilen sayının tek mi
çift olduğunu bulan programı yazınız
 */