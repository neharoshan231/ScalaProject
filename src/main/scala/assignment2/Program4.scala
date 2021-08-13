package assignment2

object Program4 extends App {
  val item1 = ("T-Shirt", "Medium", 10.99)
  val item2 = ("Polo-Shirt", "Large", 4.99)
  val item3 = ("Vest", "Small", 5.99)
  val item4 = ("T-Shirt", "Small", 4.99)
  val item5 = ("T-Shirt", "Small", 4.99)

  val itemsList = List(item1, item2, item3, item4, item5)
  itemsList.foreach(items => {if (items._1 == "T-Shirt"){
    println(s"${items._1.toUpperCase()} is priced at ${items._3} for the ${items._2} size.")
  } else { println(s"${items._1.toLowerCase()} is priced at ${items._3} for the ${items._2} size.") }
  })

}
