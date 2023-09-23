package com.example.kotlin101.Collections

fun main () {
    val o1 = Ogrenci2(1, "ahmet", "11F")
    val o2 = Ogrenci2(2, "ayse","10R")
    val o3 = Ogrenci2(3, "ceyda", "9G")

    val ogrenciler = HashMap<Int, Ogrenci2>()

    ogrenciler.put(o1.no, o1)
    ogrenciler.put(o2.no, o2)
    ogrenciler.put(o3.no, o3)

    for ((ogrenciNo, nesne) in ogrenciler){
        println("**********")
        println("Öğrenci no: $ogrenciNo")
        println("Öğrenci ad : ${nesne.ad}")
        println("Öğrenci sınıf: ${nesne.sinif}")

    }

}