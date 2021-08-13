package assignment2

object Program5 extends App {
  case class Items(name: String, price: Double, quantity: Int)

  val item1 = Items("vanilla ice cream", 2.99, 10)
  val item2 = Items("chocolate biscuits", 3.99, 3)
  val item3 = Items("cupcakes", 4.99, 5)
  val itemList = List(item1, item2, item3)
  def printItems(itemList: List[Items]): Unit = {
    itemList.foreach{ item => println(s"${item.quantity} ${item.name} at $$${item.price} each.") }
  }

  printItems(itemList)

  def printOtherItem(itemList: List[Items]): Unit = {
    itemList.foreach{
      case Items("cupcakes", _, _) => println("Founds a cupcake item")
      case Items(_, _, _) => println("Found another item")
    }
  }

  printOtherItem(itemList)
}
