package com.example.kotlin101.StandardProgrammingConstructs

import java.util.Scanner

fun main (){

    val girdi = Scanner(System.`in`)
    println("Toplama")
    println("Çıkarma")
    println("Çarpma")
    println("Bölme")

    val tercih = girdi.nextInt()

    println("Birinci sayıyı giriniz")
    val sayi1= girdi.nextInt()

    println("İkinci sayıyı giriniz")
    val sayi2= girdi.nextInt()

    if (tercih == 1){
        println("Toplam : ${sayi1 + sayi2}")
    }else if (tercih == 2){
        println("Toplam : ${sayi1 - sayi2}")
    } else if (tercih == 3){
        println ("Toplam : ${sayi1 * sayi2}")
    } else if (tercih == 4){
        println ("Toplam : ${sayi1 / sayi2}")
    }
}