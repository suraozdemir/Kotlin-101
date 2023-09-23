package com.example.kotlin101.ObjectOrientedProgramming2

fun main (){
    val k1 = Kategoriler (1, "Drama")
    val k2 = Kategoriler (2,"Romantik")

    val y1 =Yonetmenler (1, "Nuri Bilge Ceylan")
    val y2 = Yonetmenler(2, "Mahusn Kırmizigül")

    val f1 = Filmler(1,"dJANGO",2013,k1,y2)

    println("Film  ıd :${f1.filmId}")
    println("Film ad : ${f1.filmAdi}")
    println("Film yıl : ${f1.filmYil}")
    println("Film kategori : ${f1.kategori.kategoriAd}")
    println("Film yönetmen : ${f1.yonetmenler.yonetmenAd}")
}