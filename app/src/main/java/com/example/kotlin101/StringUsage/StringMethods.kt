package com.example.kotlin101.StringUsage

fun main () {
    val str1 = "Hello"

    println(str1.subSequence(0,3))

    val str2 = "Hello"

    if (str2.contains("llo")){
        println("true")
    }else{
        println("false")
    }

    val str3 = "Hello"

    println(str3.toUpperCase())
    println(str3.toLowerCase())

    val str4 ="Hello How are you"

    val range = str4.split(" ")

    for (d in range){
        println(d)
    }

    val str5 = "     Hello     " //has white space
    println(str5.trim())
}