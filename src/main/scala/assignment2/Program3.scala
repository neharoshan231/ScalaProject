package assignment2

object Program3 extends App {
  val codeList = List("A", "BB", "CCC", "DDDD", "EEEEE")
  val mapWithCount = codeList.map{ list => s"$list - ${list.length}"}
  mapWithCount.foreach(count => println(count))
}