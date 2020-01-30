package com.erdin.kotlinprojectbasic

class Nilai {
    var nama = ""
    var NPM = ""
    var kelas = ""
    private var nilaiku = 0

    fun setNilai(nilai:Int){
        nilaiku = nilai
    }

    fun getNilai(): Int {
        return nilaiku
    }

}