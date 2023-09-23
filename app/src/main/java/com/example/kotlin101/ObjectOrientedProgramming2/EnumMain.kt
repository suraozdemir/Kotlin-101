package com.example.kotlin101.ObjectOrientedProgramming2

fun main () {
    fun ucrteAl(boyut: KonserveBoyut){
        when (boyut){
            KonserveBoyut.Kucuk -> println(20*30)
            KonserveBoyut.Orta -> println(30*30)
            KonserveBoyut.Buyuk -> println(40*30)
        }
    }
    ucrteAl(KonserveBoyut.Buyuk)
}