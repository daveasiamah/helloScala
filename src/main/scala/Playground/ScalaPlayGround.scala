package Playground

import scala.annotation.tailrec

object ScalaPlayGround {
  def main(args: Array[String]): Unit = {
    println("Hello, World!!")
  }
  //Scala Does not have class level functionality (Static)
  //Scala Object is a SINGLETON INSTANCE ( ScalaObject = SINGLETON INSTANCE)

  //COMPANION OBJECT
  object Person {
    val N_EYES = 2

    def canFly: Boolean = false

    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }

  class Person(val name: String) {
    //Instance-level functionality
  }

  println(Person.N_EYES)
  println(Person.canFly)

  val john = new Person("John")
  val jane = new Person("Jane")
  println(jane == john)

  val person1: Person.type = Person
  val person2: Person.type = Person
  println(person1 == person2)

  val bobbie: Person = Person(jane, john)

  //Scala Applications = Scala object with
  //def main(args: Array[String]):Unit

  println("Left Rotation of Array Problem Solution in Scala:")
  val intArr = List(1, 2, 3, 4, 5)

  @tailrec
  def rotateLeft(numOfRotations: Int, arr: List[Int] = intArr): List[Int] = {
    if (numOfRotations < 1) return arr
    rotateLeft(numOfRotations - 1, arr.tail :+ arr.head)
  }

  println(rotateLeft(numOfRotations = 3))

  def divide(a: Double, b: Double): Double = {
    if (b == 0) throw new ArithmeticException("Invalid operation, division by zero is not allowed.")
    a / b
  }

  println(divide(16, 4))
  println(divide(72, 0))


  abstract class Human {
    def breathe(): String = {
      s"Huff...huff...huff"
    }
  }

  case class Man(name: String, age: Int) extends Human {

  }


}
