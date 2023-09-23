package com.example.kotlin101.AdvancedKotlin

import java.lang.ArithmeticException

fun main() {

    val x = 30
    val y = 0

    val list = Array<Int>(size = 2) { 0 }

    try {
        println("Sonuç: ${x / y}")
        list[4] = 8
    } catch (e: Exception) {
        if (e is ArithmeticException) {
            println("second number can not be divided by zero")
        } else if (e is ArrayIndexOutOfBoundsException) {
            println("exceeded the size of the directory")
        }
    }
}
