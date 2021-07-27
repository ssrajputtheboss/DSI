package Kotlin.array
import Kotlin.Item
import java.time.LocalDateTime

fun main(){
	var items:Array<Item> = arrayOf<Item>(
		Item(1,"Item1",LocalDateTime.of(2021,2,25,5,32,50)),
		Item(2,"Item2",LocalDateTime.of(2021,3,25,6,3,50)),
		Item(1,"Item1",LocalDateTime.of(2020,8,20,8,45,30)),
		Item(1,"Item1",LocalDateTime.of(2029,4,3,12,23,43))
	)
	
	items.forEach{print(it)}
	println()
}

