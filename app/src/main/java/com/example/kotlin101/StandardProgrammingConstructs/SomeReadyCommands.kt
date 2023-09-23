package com.example.kotlin101.StandardProgrammingConstructs

import kotlin.math.abs
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.sqrt

fun main () {

    /* for (i in 1..10) {
         val rastgeleSayi = Random.nextInt(from = 0, until = 10)
         println(rastgeleSayi)
     }*/

    val x = 6.5
    val c = ceil(x)
    println("c : $c")

    val f = floor(x)
    println("f : $f")

    val s = sqrt(x)
    println("s : $s")

    val a = abs(x)
    println("a : $a")

}