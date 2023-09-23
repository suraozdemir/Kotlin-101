package com.example.kotlin101.Collections

fun main () {
    val u1 = Urun(1, "saat", 150.0)
    val u2 = Urun (2, "tv", 1750.0)
    val u3 = Urun (3, "bilgisayar", 960.0)

    val urunler = ArrayList<Urun> ()

    urunler.add(u1)
    urunler.add(u2)
    urunler.add(u3)

    for (urun in urunler){
        println("******")
        println("ürün no :${urun.urunNo}")
        println("ürün ad : ${urun.urunAd}")
        println("ürün fiyat : ${urun.urunFiyat}")
    }


}