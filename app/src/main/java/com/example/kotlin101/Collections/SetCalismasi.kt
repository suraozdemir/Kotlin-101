package com.example.kotlin101.Collections

fun main (){
    val meyveler = setOf<String>("çilek", "muz", "elma")

    val iller = mutableSetOf<String>("istanbul", "ankara", "mersin", "izmir")

    val sayilar = HashSet<Int>()

    sayilar.add(10)
    sayilar.add(20)
    sayilar.add(30)

    println(sayilar.toString())

    sayilar.add(21)
    println(sayilar.toString())

    println(sayilar.elementAt(1))
    println(sayilar.count())
    println(sayilar.isEmpty())
    println(sayilar.contains(20))
    println(sayilar.contains(25))

    for (s in sayilar){
        println(s)
    }

    for ((i,s) in sayilar.withIndex()) {
        println("$i.->$s")
    }

    sayilar.remove(10)
    println(sayilar.toString())

    sayilar.clear()
    println(sayilar.toString())

}