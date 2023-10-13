package com.example.fcmpushnotification

class hello {
}


fun main() {
    var a = "10"
    var b:String? = null
    var c:String? = ""
    b= "11"
    c= "12"
    val result= concatStr(a,b,c)
    println(result)
}

fun concatStr(m:String,n:String,p:String):String{
    return m+n+p
}