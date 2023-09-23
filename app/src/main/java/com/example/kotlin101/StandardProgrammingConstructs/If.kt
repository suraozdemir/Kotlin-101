package com.example.kotlin101.StandardProgrammingConstructs

fun main (){
    var yas = 18
    var isim = "mehmet"

    if (yas >=19){
        println("Reşitsiniz")
    }
    if (yas >=19) {
        println("Reşitsiniz")
    }
    else {
        println("reşit değilsiniz")
    }
    if (isim == "ahmet"){
        println("merhaba ahmet")
    } else {
        println("tanınmayan kişi")
    }
    if (isim == "ahmet"){
        println("merhaba ahmet")
    } else if (isim == "mehmet") {
        println("merhaba mehmet")
    }else {
        println("tanınmayan kişi")
    }
    var kullaniciAdi = "admin"
    var sifre = 12345

    if (sifre == 1234 && kullaniciAdi=="admin"){
        println("hoşgeldiniz")
    }else {
        println("Hatalı giriş")
    }
    var sinif = 9
    if (sinif==9 || sinif==10 || sinif==11 || sinif==12){
        println("ayt sınavına hazırlanabilirsiniz")
    }
    var a=10
    var b=10
    if (a==b) println("eşit") else println("eşit değil")

}