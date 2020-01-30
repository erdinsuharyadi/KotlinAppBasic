package com.erdin.kotlinprojectbasic

open class Sepeda {
    private var kecepatan:Int = 0
    private var gir:Int = 0

    fun ubahGir(plusGir:Int) {
        gir += plusGir
        println("Gir: $gir")
    }

    fun tambahKecepatan(plusKecepatan: Int){
        kecepatan += plusKecepatan
        println("Kecepatan: $kecepatan")
    }
}