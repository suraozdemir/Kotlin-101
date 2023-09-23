package com.example.kotlin101.ObjectOrientedProgramming

fun main () {
    val kamilKOc = Bus (kapasite = 50, nereden = "Bursa", nereye = "Ankara", mevcutYolcu = 10)

    kamilKOc.bilgiAl()


    kamilKOc.kapasite =100
    kamilKOc.nereden ="İzmir"
    kamilKOc.nereye ="İstanbul"
    kamilKOc.mevcutYolcu = 30

    kamilKOc.bilgiAl()

    kamilKOc.yolcuAl(20)
    kamilKOc.bilgiAl()

    kamilKOc.yolcuIndir(40)
    kamilKOc.bilgiAl()

    val otobusFirması = Bus (kapasite = 50, nereden = "Bursa", nereye = "İzmit", mevcutYolcu = 5)

    otobusFirması.bilgiAl()
    otobusFirması.yolcuAl(50)
    otobusFirması.bilgiAl()

}