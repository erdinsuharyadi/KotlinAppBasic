package com.erdin.kotlinprojectbasic

fun show(n1: String) {
    println("Tampilkan isi : $n1")
}

fun show(n2: Int) {
    println("Tampilkan isi : $n2")
}

fun show(n3: Double) {
    println("Tampilkan isi : $n3")
}

fun main(args: Array<String>) {
    show(1000)
    show("String")
    show(0.5)
}