package com.example.kotlin101.Collections

import java.util.Scanner

fun main (){
    val girdi = Scanner(System.`in`)

    var sayac = 1

    val ogrenciler = ArrayList<Ogrenci>()

    while (true) {

        println("Öğrenci adını giriniz")
        val ad = girdi.next()

        println("Öğrenci sınıfı giriniz")
        val sinif = girdi.next()

        val yeniOgrenci = Ogrenci (sayac, ad, sinif)
        sayac = sayac + 1

        ogrenciler.add(yeniOgrenci)

        println("Çıkmak İçin (1) - Devam etmek için diğer sayılar")
        val cikis = girdi.nextInt()

        if (cikis == 1) {

            for (ogrenci in ogrenciler){
                println("************")
                println("Öğrenci no : ${ogrenci.no}")
                println("Öğrenci ad : ${ogrenci.ad}")
                println("Öğrenci sınıf : ${ogrenci.sinif}")
            }
            println("Çıkış yapıldı")
            break
        }
    }

}