package com.example.kotlin101.StringUsage

fun main () {
    val str1 = "Hello"
    println(str1)

    var str2 = String()
    str2 ="Kotlin"
    println(str2)

    val str3 = """
        HOW ARE YOU
        HELLOO
        HEY
    """.trimIndent() //for free space
    println(str3)

    val str4 = ""
    val str5 = String()

    if (str4.isEmpty()){
        println("str4 empty")
    } else{
        println("str4 full")
    }

    if (str5.isEmpty()){
        println("str5 emty")
    }else{
        println("str5 full")
    }

    val varA = 10
    val varB = 20
    println("$varA x $varB = ${varA*varB}")

    val str6 = "hello"
    val str7 =" World"
    println(str6+str7)

    val str8 = "Hello Kotlin"
    println("$str8 boyutu :${str8.length}")

    val str9 = "Hello"
    val str10 = "Hello World"

    if (str9 == str10){
        println("$str9 and $str10 are equal")
    } else {
        println("$str9 and $str10 are not equal")
    }

    val str11 = "hello"
    for (s in str11) {
        println(s)
    }

}