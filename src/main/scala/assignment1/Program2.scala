package assignment1

object Program2 extends App {
  val numbers = Seq(2, 4, 6, 7, 10, 3)
  var sum = 0

  def addOddNumbers(numbers: Seq[Int]): Int = {
    for (n <- numbers) {
      if (n % 2 != 0) {
        sum += n
      }
    }
   return sum
  }

  println("sum of odd number is : " + addOddNumbers(numbers))

}

