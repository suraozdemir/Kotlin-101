package com.example.kotlin101.StandardProgrammingConstructs

import java.util.Scanner

fun main () {

    val dersler = Array<String>(size = 5) {""}
    val notlar = Array<Int>(size = 5){0} //varsayılan elaman olarak 0 yazıldı

    val girdi = Scanner(System.`in`)

    for (i in 0 until dersler.count()){
        println("${i+1}. dersi giriniz")
        val ders = girdi.next()
        dersler [i] =ders
        println("${i+1}. notu giriniz")
        val not = girdi.nextInt()
        notlar [i] = not
    }

    var toplam = 0

    for (i in 0 until notlar.count() ){
        println("${dersler[i]} : ${notlar[i]}")

        toplam = toplam + notlar[i]
    }

    val ortalama = toplam / notlar.count()

    println("Ortalama : $ortalama")

    if (ortalama >= 50){
        println("GEÇTİ")
    }else {
        println("KALDI")
    }

}