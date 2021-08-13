package assignment1

object program5 extends App{
val printString = (n: Int, s: String) => {
  for(a <- 0 until n) {
    println(s)
  }
}
  printString(5, "MentorConnect")
}
