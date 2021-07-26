package Kotlin.map
import Kotlin.Item
import java.time.LocalDateTime

fun main(){
	var items:Map<String,Item> = mapOf<String,Item>(
		"Dektop" to Item(1,"Item1",LocalDateTime.of(2021,2,25,5,32,50)),
		"Laptop" to Item(2,"Item2",LocalDateTime.of(2021,3,25,6,3,50)),
		"Mobile" to Item(1,"Item1",LocalDateTime.of(2020,8,20,8,45,30)),
		"SmartWatch" to Item(1,"Item1",LocalDateTime.of(2029,4,3,12,23,43))
	)
	
	items.forEach{k:String,v:Item->
	print(v)//print(items[k])
	}
	println()
	items += "New" to Item(1,"Item1",LocalDateTime.of(2029,4,3,12,23,43))
	items.toSortedMap(compareBy<String>{it}.thenBy{items[it]?.id})
}
