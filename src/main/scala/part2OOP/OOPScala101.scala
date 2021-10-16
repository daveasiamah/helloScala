package part2OOP

object OOPScala101 extends App {
  class Person(name: String, age: Int = 0) { //Class parameters are NOT FIELDS!
    //Class Method
    def greet(name: String): Unit = {
      println(s"${this.name} says Hello, $name")
    }

    //Method Overloading - Polymorphism
    def greet(): Unit = println(s"Hi, I am $name")

    //Multiple constructors
    def this(name: String) = this(name, 0)

    def this() = this("John Doe")
  }

  val person = new Person("John", 24)
  println(person.greet("George"))


  //Testing
  val newAuthor = new Writer("Frank", "Harker", 1980);
  val imposter = new Writer("Frank", "Harker", 1960);
  val newNovel = new Novel("Beyond the Frontier", 2021, newAuthor)

  val newEdition = newNovel.copy(2022)

  val counter = new Counter

  counter.increment.printCount()
  counter.printCount();

  counter.increment(5).increment(3).increment(2).decrement(3).printCount()
  //  counter.decrement(1).printCount()
  //  counter.printCount();

  println("Beyond the Frontier: New Edition is Written by Frank Harker?: " + newEdition.isWrittenBy(newAuthor))
  println("Author's Age: " + newNovel.authorAge)
  println("Novel is Written by newAuthor?: " + newNovel.isWrittenBy(newAuthor))
  println("Novel is Written by Imposter?: " + newNovel.isWrittenBy(imposter))

}
