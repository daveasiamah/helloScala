object CallByValueAndCallByName extends App {
  def calledByValue(x: Long): Unit = {
    println("called by value: " + x)
    println("called by value: " + x)
  }

  def calledByName(x: => Long): Unit = {
    println("called by name: " + x)
    println("called by name: " + x)
  }

  calledByName(System.nanoTime())
  calledByValue(System.nanoTime())

}
