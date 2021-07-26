package Kotlin
import java.time.LocalDateTime
class Item(id:Int,name:String,manufactureTime:LocalDateTime) {
	var id:Int
		get() = this.id
		set(id:Int) {this.id = id}
	var name:String
		get() = this.name
		set(name:String) {this.name = name}
	var manufactureTime:LocalDateTime
		get() = this.manufactureTime
		set(manufactureTime:LocalDateTime) {this.manufactureTime = manufactureTime}
	init{
		this.id = id
		this.name = name
		this.manufactureTime = manufactureTime
	}
	
	override public fun toString():String{
		return "Item(id=$id,name=$name,manufactureTime=${manufactureTime.toString()})"
	}
}