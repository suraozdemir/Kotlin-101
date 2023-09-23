package com.example.kotlin101.StandardProgrammingConstructs

import java.util.Scanner

fun main (){
    val girdi = Scanner(System.`in`)
    println("Dikdörtgen Alanı")
    println("Çember Alanı")

    val secim = girdi.nextInt()

    println("Seçimiz : $secim")
    if (secim == 1) {
        println("kısa kenar giriniz")
        val kisaKenar = girdi.nextInt()

        println("Uzun kenar giriniz")
        val uzunKenar = girdi.nextInt()

        println("Dikdötgen Alanı")
        val dikdörgenAlani = kisaKenar * uzunKenar
        println("Sonuc $dikdörgenAlani")
    }
    if (secim == 2){
        println("Yarı çap giriniz")
        var yariCap = girdi.nextInt()

        println("Çember Alanı")
        val cemberAlani = 3.14 * yariCap
        println("Sonuç $cemberAlani")
    }
}