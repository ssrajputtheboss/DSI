package Kotlin
import java.time.LocalDateTime
class Item(id:Int,name:String,manufactureTime:LocalDateTime) {
	private var id:Int
		get() = this.id
		set(id:Int) {this.id = id}
	private var name:String
		get() = this.name
		set(name:String) {this.name = name}
	private var manufactureTime:LocalDateTime
		get() = this.manufactureTime
		set(manufactureTime:LocalDateTime) {this.manufactureTime = manufactureTime}
	init{
		this.id = id
		this.name = name
		this.manufactureTime = manufactureTime
	}
}