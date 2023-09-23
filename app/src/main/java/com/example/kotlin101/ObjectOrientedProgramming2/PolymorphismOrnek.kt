package com.example.kotlin101.ObjectOrientedProgramming2

fun main () {
    val ogretmen:Personel = Ogretmen ()
    val isci:Personel =Isci()

    val mudur = Mudur ()

    mudur.terfiEtti(ogretmen)
    mudur.terfiEtti(isci)
}