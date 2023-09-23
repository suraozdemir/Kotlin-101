package com.example.kotlin101.Collections

import java.util.Scanner
fun main () {
    val girdi = Scanner(System.`in`)

    val personeller = ArrayList<Personel>()

    for (i in 1..5) {

        println("$i. Personel ad : ")
        val isim = girdi.next()

        println("$i. Personel adres il : ")
        val il = girdi.next()

        println("$i Personel adres ilçe :")
        val ilce = girdi.next()

        val adres = Adres(il, ilce)

        val personel = Personel(i, isim, adres)

        personeller.add(personel)

        for (p in personeller) {

            println("*************")
            println("Personel no : ${p.no}")
            println("Personel ad : ${p.isim}")
            println("Personel il : ${p.adres.il}")
            println("Personel ilçe : ${p.adres.ilce}")
        }


    }
}