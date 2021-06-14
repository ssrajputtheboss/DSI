package Kotlin.array

import Kotlin.Item
import java.time.LocalDateTime

fun main(){
    val item = Item(1,"hi" ,LocalDateTime.now() )
    println(item.toString())
}