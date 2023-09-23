package com.example.kotlin101.Collections

fun main () {
    val meyveler = ArrayList<String> ()

    meyveler.add("çilek")
    meyveler.add("muz")
    meyveler.add("elma")
    meyveler.add("kivi")
    meyveler.add("kiraz")

    for (meyve in meyveler) {
        println("sonuç : $meyve")
    }

    for ((indeks, meyve) in meyveler.withIndex()) {
        println("sonuç : $indeks : $meyve")

    }
}