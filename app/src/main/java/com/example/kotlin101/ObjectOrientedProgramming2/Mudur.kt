package com.example.kotlin101.ObjectOrientedProgramming2

class Mudur :Personel() {
    fun iseAl(p:Personel){
        p.iseAlindi()
    }

    fun terfiEtti(p:Personel){
        if (p is Ogretmen){
            p.maasArttir()
        }
        if (p is Isci){
            println("İşçiler terfi alamaz.")
        }

        (p as Ogretmen).maasArttir()

    }
}