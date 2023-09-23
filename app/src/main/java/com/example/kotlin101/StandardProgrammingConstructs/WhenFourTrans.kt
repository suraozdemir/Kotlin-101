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
    val sayi1 = girdi.nextInt()

    println("İkinci sayıyı giriniz")
    val sayi2 = girdi.nextInt()

    when (tercih){
        1-> println("Toploma : ${sayi1 + sayi2}")
        2-> println("Çıkarma : ${sayi1 - sayi2}")
        3-> println("Çarpma : ${sayi1 * sayi2}")
        4-> println("Bölme  : ${sayi1 / sayi2}")
        else-> println("Böyle bir işlem yok")
    }

}