package part2OOP

object Objects extends App {
  val fruit1 = new Fruit
  val fruit2 = new Fruit
  println(fruit1)
  println(fruit2)

  def isEqualto2(obj: Object) = {
    val result = fruit1.==(fruit2)
    println()
  }
}

class Fruit
