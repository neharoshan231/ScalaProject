package assignment2

object Program1 extends App{
  val basketOne = Set("Cake", "Milk", "Cheese", "Toilet Paper")
  val basketTwo = Set("Bread", "Water", "Juice", "Milk", "Cheese")
  val commonItems = basketOne intersect basketTwo
  commonItems.foreach(item => println(item.toUpperCase()))
}
