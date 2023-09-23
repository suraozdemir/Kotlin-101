package com.example.kotlin101.ObjectOrientedProgramming2

open class Elma:Eatable, Squeezable {
    override fun howToEat() {
        println("Dilimle ve ye")
    }

    override fun howToSqueeze() {
        println("Blender ile sık")
    }
}