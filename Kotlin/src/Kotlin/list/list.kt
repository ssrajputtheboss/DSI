package Kotlin.list
import Kotlin.Item
import java.time.LocalDateTime

fun main(){
	var items:MutableList<Item> = mutableListOf<Item>(
		Item(1,"Item1",LocalDateTime.of(2021,2,25,5,32,50)),
		Item(2,"Item2",LocalDateTime.of(2021,3,25,6,3,50)),
		Item(3,"Item3",LocalDateTime.of(2020,8,20,8,45,30)),
		Item(4,"Item4",LocalDateTime.of(2029,4,3,12,23,43))
	)
	
	//items.forEach{print(it)}
	println(items.joinToString())
	items.add(Item(5,"Item5",LocalDateTime.of(2019,1,30,12,3,3)))
	println("After adding")
	println(items.joinToString())
	println()
	items.removeAt(items.size-1)
	// items.minus(items.size-1) // alternatively
	println("After removing last element")
	println(items.joinToString())
	items.sortBy{it.id}
	//items.sortByDecreasing{it.id} // decreasing order sort
	println()
}
