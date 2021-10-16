package part2OOP

object InheritanceAndTraits extends App {
  val bobcat = new Cat
  val dog1 = new Dog()

  class Animal {
    val creatureType = "Wild"

    protected def eat(): Unit = println("Animal is eating: nom...nom")
  }

  bobcat.crunch()

  //Single class inheritance
  class Cat extends Animal {
    def crunch(): Unit = {
      eat()
      println("Cat is eating: crunch...crunch")
    }
  }

  //Constructors
  class Person(name: String, age: Int) {
    //auxiliary constructor
    def this(name: String) = this(name, 0)
  }

  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  //Overriding
  class Dog() extends Animal {
    override val creatureType: String = "domestic"

    override def eat(): Unit = println("Dog is eating: crunch...crunch...")
  }

  dog1.eat()
  println(dog1.creatureType)
}
