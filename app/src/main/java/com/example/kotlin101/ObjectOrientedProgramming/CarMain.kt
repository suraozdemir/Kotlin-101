package com.example.kotlin101.ObjectOrientedProgramming

fun main() {
    val bmw = Car(renk = "kırmızı", hiz = 10, calisiyormu = false )

    println(bmw.renk)
    println(bmw.hiz)
    println(bmw.calisiyormu)

    bmw.hiz = 900
    bmw.calisiyormu = true
    bmw.renk ="beyaz"

    bmw.bilgiAl()

    bmw.durdur()
    bmw.bilgiAl()

    bmw.calistir()
    bmw.bilgiAl()

    bmw.hizlan(100)
    bmw.hizlan(30)
    bmw.bilgiAl()

    bmw.yavasla(50)
    bmw.bilgiAl()

    val sahin = Car (renk = "sarı", hiz = 100, calisiyormu = true)

    sahin.bilgiAl()
    sahin.hizlan(100)
    sahin.bilgiAl()

    sahin.durdur()
    sahin.bilgiAl()


}