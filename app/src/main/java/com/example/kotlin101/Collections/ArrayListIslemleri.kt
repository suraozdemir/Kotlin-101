package com.example.kotlin101.Collections

fun main () {
    val meyveler = ArrayList<String> ()

    meyveler.add("çilek")
    meyveler.add("muz")
    meyveler.add("elma")
    meyveler.add("kivi")
    meyveler.add("kiraz")

    println(meyveler.isEmpty())
    println(meyveler.count())
    println(meyveler.size)
    println(meyveler.first())
    println(meyveler.last())
    println(meyveler.contains("Kira"))
    println(meyveler.max())
    println(meyveler.min())

    meyveler.sort()
    println(meyveler.toString())

    meyveler.reverse()
    println(meyveler.toString())

    meyveler.removeAt(3)
    println(meyveler.toString())

    meyveler.remove("kivi")
    println(meyveler.toString())

    meyveler.clear()
    println(meyveler.toString())
}