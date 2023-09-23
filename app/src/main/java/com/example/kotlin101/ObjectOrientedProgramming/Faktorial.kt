package com.example.kotlin101.ObjectOrientedProgramming

class Faktorial {
    fun faktoriyelHesaplama (sayi:Int):Int {
        var sonuc = 1

        for (i in 1..sayi) {
            sonuc = sonuc * i
        }
        return sonuc
    }

}