package com.example.kotlin101.Collections

fun main (){
    val Liste = ArrayList<String> ()

    val Liste2 : ArrayList<Int> = ArrayList<Int> ()

    val meyveler = ArrayList<String>()

    meyveler.add("çilek")
    meyveler.add("muz")
    meyveler.add("elma")
    meyveler.add("kivi")
    meyveler.add("kiraz")

    println(meyveler.toString())

    val str1 = meyveler.get(2)
    println(str1)

    meyveler[2] = "ananas"
    println(meyveler.toString())
    meyveler.add(3, "potakal")
    println(meyveler.toString())



}