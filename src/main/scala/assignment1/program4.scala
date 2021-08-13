package assignment1

object program4 extends App{
def weekName(n: Int): String = {
  val week = n match {
    case 1 | 8 => "Monday"
    case 2 => "Tuesday"
    case 3 => "Wednesday"
    case 4 => "Thursday"
    case 5 => "Friday"
    case 6 => "Saturday"
    case 7 => "Sunday"
    case _ => "Invalid Week"
  }
  return week
}
  println(weekName(1))
  println(weekName(3))
  println(weekName(4))
  println(weekName(8))
}
