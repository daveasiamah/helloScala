package part2OOP

/**
 * Created by David Asiamah
 * */
object MethodNotations extends App {
  //Person with name and favoriteMovie
  //Method likes with movie as param
  //Method hangsOutWith takes a Person

  class APerson(val name: String, favoriteMovie: String) {
    def hangsOutWith(aPerson: APerson): String = s"${this.name} is hanging out with ${aPerson.name}."

    def likes(movie: String): Boolean = movie == favoriteMovie

    def +(aPerson: APerson): String = s"${this.name} is hanging out with ${aPerson.name}."

    def +(nickname: String): APerson = new APerson(s"$name $nickname", favoriteMovie)

    val printMessage: () => String = () => s"${this.name}"

    def isAlive: Boolean = true

    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"

    def learns(thing: String) = s"$name is learning $thing"

    def learnsScala: String = this learns "Scala"
  }

  val jack = new APerson("Jack", "Tenet")
  val tom = new APerson("Tom", "Kick Boxer")
  println(jack + tom)
  println((jack + "the rockstar") ())
  println((tom + "the maverick").apply())
  val person1 = new APerson("Dan", "Indiana Jones and The Last Crusade")
  val person2 = new APerson("Linda", "Fight Club")

  //  println(person2.hangsOutWith(person1))
  //  println(person1 hangsOutWith person2)
  //  println(person1 + (person2))
  //  println(1.+(2))
  //  println(person1.printMessage())

  println(person1.learns("C++"))

}
