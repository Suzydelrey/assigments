package com.example.kotlin

fun main() {
    for (number in 0..100){
        if (number==71){
            println("it's over 70!! ")
        }else
            println(number)
    }
       var temperature =35
       while (temperature > 10 ){
           when (temperature) {
               30 -> {
                   println("its hot")
               }
               20 -> {
                   println("its comfy")
               }
               15 -> {
                   println("its cold")
               }
               else -> {
                   println(temperature)


               }
           }
       }


               temperature--
   }
