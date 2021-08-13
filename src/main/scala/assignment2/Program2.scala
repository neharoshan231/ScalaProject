package assignment2

import scala.collection.mutable.ListBuffer

object Program2 extends App{
 val items = ListBuffer("Milk", "Cheese", "Donuts", "Apple", "Banana")
  items -= ("Apple", "Banana")
  items.foreach(item => println(item))
  println(items.mkString("|"))
}
