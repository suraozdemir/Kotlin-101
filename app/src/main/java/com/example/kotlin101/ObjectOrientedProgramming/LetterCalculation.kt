package com.example.kotlin101.ObjectOrientedProgramming

class LetterCalculation {
    fun kelimeAdeti (kelime:String, harf:Char) {

        var sonuc = 0

        for (k in kelime){
            if (k == harf){
                sonuc = sonuc + 1
            }
        }
        println("Harf Adet : $sonuc")
    }
}