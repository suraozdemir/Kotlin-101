package com.example.kotlin101.AdvancedKotlin

fun main () {

    val firstThread = FirstThread()
    firstThread.start()

    val secondThread = Thread(SecondThread())
    secondThread.start()

    for (i in 900..999){
        println("Main Thread : $i")
        Thread.sleep(100)
    }

}