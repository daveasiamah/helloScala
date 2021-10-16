object Hello extends App {
  private var message: String = ""

  /*Expressions in Scala are Evaluated(Return the Value of Something)
   * Expressions in Java are Executed(Do Something)*/
  def main(): Unit = {
    message = "Echo, Earthlings, All Your Bases Are Belong To Us."
    //    message.toUpperCase()
    //    println("Hello World!")
    println(message.toUpperCase())
  }

  var num = 0
  val num2 = 5
  while (num < 5) {
    println(num)
    num += 1
  }

  for (i <- 0 until num2) {
    println(i.toString + ": " + i)
  }

  //Pattern matching
  var result: Int => String = {
    case 0 => "Zero"
    case _ => "other"
  }

  main()
  println(result(0))
}
