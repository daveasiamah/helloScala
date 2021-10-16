package part2OOP

object AnonymousClasses extends App {
  abstract class Animal {
    def eat: Unit
  }

  class AnonymousClasses$anon$1 extends Animal {
    override def eat: Unit = println("Hahahahaahaaaa")
  }
  //Anonymous class
  /*
  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("Hahahahahahaaaa")
  println(funnyAnimal.getClass)
  }
  *
  * */

  class Person(name: String) {
    def sayHi: Unit = println(s"Hi, name is $name, how can I help?")
  }

  val jim = new Person("Jim") {
    override def sayHi: Unit = println(s"Hi, my name is Jim, how can I be of service")
  }

  println(jim)

  /*
  * 1. Generic trait MyPredicate[T] with a little method test(T) => Boolean
  * 2. Generic trait MyTransformer[A,B] with a method transform(A) => B
  * 3. MyList:
  * - map(transformer) => MyList
  * - filter(predicate) => MyList
  * - flatMap(transformer from A to MyList[B]) => MyList[B]
  * */


}
