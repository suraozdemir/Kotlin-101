package com.example.kotlin101.ObjectOrientedProgramming

class SalaryCount {
    fun maasHesapla(gün:Int):Int{
        val calismaSaati = gün * 8
        println("Çalışma saati : $calismaSaati")

        var maas = 0

        if (calismaSaati >= 160){
            val mesaiFazlasi = calismaSaati -160
            maas = 160 * 10 + mesaiFazlasi * 20
        }else {
            maas =calismaSaati*10
        }

        return maas

    }
}