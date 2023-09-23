package com.example.kotlin101.ObjectOrientedProgramming

class QuaotaFee {
    fun internetucretihesaplama(GB: Int): Int {
        var ucret = 0
        if (GB > 50) {
            val kotaFazlasi = GB - 50
            ucret = 100 + kotaFazlasi * 4
        } else {
            ucret = 100
        }
        return ucret
    }

}
