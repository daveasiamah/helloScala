package part2OOP

/*
* Counter class
* - receives current count
* - method current count
* - method to increment/decrement => new Counter
* - overload inc/dec to receive an amount
* */


class Counter(val count: Int = 0) {
  def increment: Counter = {
    println("Incrementing...")
    println(count)
    new Counter(count + 1) //Would have been count + 1 but for immutability we return a new instance.
  }

  def decrement: Counter = {
    println("Decrementing...")
    println(count)
    new Counter(count - 1)
  }

  def increment(n: Int): Counter = {
    if (n <= 0) this
    else increment.increment(n - 1)
  }

  def decrement(n: Int): Counter = {
    if (n <= 0) this
    else decrement.decrement(n - 1)
  }

  def printCount(): Unit = println(count)
}
