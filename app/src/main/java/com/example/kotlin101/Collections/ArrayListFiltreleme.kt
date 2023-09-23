package com.example.kotlin101.Collections

fun main (){
    val o1 = Ogrenci (1, "ahmet", "11F")
    val o2 = Ogrenci (2, "zeynep", "10R")
    val o3 = Ogrenci (3, "ceyda", "12A")
    val o4 = Ogrenci(4, "mehmet", "9Z")
    val o5 = Ogrenci(5, "yasin", "11F")

    val ogrenciler = ArrayList<Ogrenci> ()

    ogrenciler.add(o1)
    ogrenciler.add(o2)
    ogrenciler.add(o3)
    ogrenciler.add(o4)
    ogrenciler.add(o5)

    val sonucListe = ogrenciler.filter {(it.ad) . contains("a")}

    for (o in sonucListe) {
        println("*****************")
        println("Öğrenci No : ${o.no}")
        println("Öğrenci Ad : ${o.ad}")
        println("Öğrenci Sınıf : ${o.sinif}")

    }
}