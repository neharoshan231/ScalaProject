package assignment1

import scala.collection.mutable.ListBuffer

object program3 extends App{
  val names = List("january", "march")
  println(names.count(_))
  var newString = new ListBuffer[String]()
  def concatString(names: List[String]): ListBuffer[String] = {
    for(n <- names) {
      newString += "hello" + n.toUpperCase()
    }
    return newString
  }
//  println(concatString(names))
}
