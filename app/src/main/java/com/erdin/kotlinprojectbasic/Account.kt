package com.erdin.kotlinprojectbasic

abstract class Account {
    var accountNo:Int=1234
    var balance:Int=123

    fun getData() {
        println("Acc No: "+accountNo+"\nBalance: "+balance)
    }

}