package scalatips

object WhyIsContravarianceHard {

  val list: List[Int] = List(1, 2, 3)

  class Animal

  class Dog extends Animal

  //  Question: if Dog <: Animal, does List[Dog] <: List[Animal] ? THE VARIANCE QUESTION
  //if YES, than the type is called COVARIANT
  def main(args: Array[String]): Unit = {

  }
}
