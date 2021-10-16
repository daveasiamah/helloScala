
object demo {
  //  val fruits = List("mango", "pawpaw", "pineapple", "banana", "peach")
  //  for (fruit <- fruits)
  //    println(fruit)

  //val big = new java.math.BigInteger("12345")
  //demo.fruits.foreach(x => println('\u2022' + x))
  //val greetings = new Array[String](3)
  //
  //greetings(0) = "Hello"
  //greetings(1) = ","
  //greetings(2) = "World"
}

def showGreeting(n: Int): Int = {
  if (n < 1) return 1
  println("Ola, Amigo!" + n)
  showGreeting(n - 1)
}

println(showGreeting(5))
