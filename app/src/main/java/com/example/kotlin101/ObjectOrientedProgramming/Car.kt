package com.example.kotlin101.ObjectOrientedProgramming

class Car (var renk:String, var hiz:Int, var calisiyormu:Boolean) {



    fun calistir () {
        calisiyormu = true
    }

    fun durdur () {
        calisiyormu = false
        hiz = 0
    }

    fun hizlan(kacKn:Int){
        hiz = hiz + kacKn
    }

    fun yavasla (kacKn: Int){
        hiz = hiz - kacKn
    }

    fun bilgiAl () {
        println("renk : $renk")
        println("hız : $hiz")
        println("çalışıyor mu : $calisiyormu")

    }

}