package com.example.kotlin101.StringUsage

import java.util.Scanner
fun main () {

    val girdi = Scanner(System.`in`)

    println("enter a word")

    val word = girdi.next()

    for (i in word.length-1 downTo 0){
        print(word[i])
    }
}