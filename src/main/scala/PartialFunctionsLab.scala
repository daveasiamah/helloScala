object PartialFunctionsLab extends App {

  object SquareRoot extends PartialFunction[Int, Double] {
    override def isDefinedAt(x: Int): Boolean = x <= 0

    override def apply(num: Int): Double = Math.sqrt(num)
  }

  println(SquareRoot(4))
}
