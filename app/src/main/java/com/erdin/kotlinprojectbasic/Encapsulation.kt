package com.erdin.kotlinprojectbasic

fun main(args: Array<String>){
    var data = Nilai()
    data.nama = "Erdin Suharyadi"
    data.NPM = "123456789"
    data.kelas = "XII IPA 1"
    data.setNilai(90)
    println("Nama: " + data.nama)
    println("NPM: " + data.NPM)
    println("Kelas: " + data.kelas)
    println("Nilai: " + data.getNilai())
}
