package com.example.kotlin101.Collections

fun main () {
    val sayilar = mapOf<Int, String>(1 to "Bir", 2 to "İki")
    val oranlar = mutableMapOf<Double, String>(1.5 to "oran1", 3.4 to "oran2")
    val iller =HashMap<Int,String>()

    iller.put(16, "bursa")
    iller.put(34,"istanbul")

    println(iller.toString())

    iller.put(16,"yenibursa")
    println(iller.toString())

    println(iller.get(34))

    println(iller.size)
    println(iller.count())
    println(iller.containsKey(16))
    println(iller.containsValue("istanbul"))

    for ((anahtar,deger) in iller ){
        println("$anahtar : $deger")
    }
    iller.remove(16)
    println(iller.toString())

    iller.clear()
    println(iller.toString())

}