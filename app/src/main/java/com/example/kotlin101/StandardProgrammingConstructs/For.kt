package com.example.kotlin101.StandardProgrammingConstructs

fun main () {
    for (i in 3..5) {
        println(i)
    }
// 10 ile 20 arasında 5er 5er artsın

    var baslangic = 10
    var bitis = 20
    var artis = 5

    for (a in 10..20 step 5) {
        println("a : $a")
    }

    //20 ile 10 2ser azaltma

    for (b in 20 downTo 10 step 2) {
        println("b : $b")
    }

    //until kavramı

    for (c in 1 until 5){
        println("c : $c")
    }

    var sayac = 1

    while (sayac <= 4){
        println("Sayaç : $sayac")
        sayac += 1
    }
}
