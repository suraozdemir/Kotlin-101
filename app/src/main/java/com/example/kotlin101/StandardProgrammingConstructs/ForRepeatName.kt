package com.example.kotlin101.StandardProgrammingConstructs

import java.util.Scanner

fun main () {
    val girdi = Scanner(System.`in`)
    println("İsim giriniz")

    val isim = girdi.next()

    println("Tekrar sayısını giriniz")

    val tekrar = girdi.nextInt()

    for (i in 1..tekrar){
        println("$i . $isim")
    }
}
/* konsolden girilen adınızı
konsolden girdiğiniz tekrar sayısı kadar
yazdıran programı yazdırınız.
*/