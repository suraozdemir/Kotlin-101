package com.example.kotlin101.Collections

fun main () {
    val k1 = Kisiler(1, "ahmet")
    val k2 = Kisiler(2, "zeynep")
    val k3 = Kisiler (3, "berna")

    val kisilerArrayList = ArrayList<Kisiler>()

    kisilerArrayList.add(k1)
    kisilerArrayList.add(k2)
    kisilerArrayList.add(k3)

    println("Önce")

    for( k in kisilerArrayList) {
        println("${k.kisinO} - ${k.kisiAd}")
    }

    println("Sayısal olarak sıralama")

    val siralamaArrayList = kisilerArrayList.sortedWith(compareBy {it.kisinO})

    for (k in siralamaArrayList) {
        println("${k.kisinO} - ${k.kisiAd}")
    }

    println("Küçükten büyüğe sıralama")
    val siralamaArraylist2 = kisilerArrayList.sortedWith(compareBy { it.kisinO})
    for (k in siralamaArraylist2){
        println("${k.kisinO} - ${k.kisiAd}")
    }
    println("Harfsel büyükten küçüğe")

    val siralamaArrayList3 = kisilerArrayList.sortedWith(compareByDescending {it.kisiAd })

    for (k in siralamaArrayList3){
        println("${k.kisinO} - ${k.kisiAd}")
    }


}