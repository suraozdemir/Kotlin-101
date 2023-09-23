package com.example.kotlin101.Collections

fun main () {
    val o1 = Ogrenci(1, "ahmet", "11F")
    val o2 = Ogrenci(2, "ayse","10R")
    val o3 = Ogrenci(3, "ceyda", "9G")
    val o4 = Ogrenci(4, "Ece", "12A")

    val ogrenciler = HashSet<Ogrenci>()
    ogrenciler.add(o1)
    ogrenciler.add(o2)
    ogrenciler.add(o3)
    ogrenciler.add(o4)

    for (o in ogrenciler){
        println("*************")
        println("Öğrenci no : ${o.no}")
        println("Öğrenci ad : ${o.ad}")
        println("Öğrenci sınıf : ${o.sinif}")
    }
}