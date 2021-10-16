import scala.annotation.tailrec

object Recursion extends App {
  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)
      result
    }
  }

  println(factorial(10))

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: Int = 1): Int = {
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator)
    }

    factHelper(4, 1)
  }

  /*
   1. Concatenate a string (n) times recursive.
   2. IsPrime function tail recursively.
   3. Fibonacci function, tail recursively.
 */

  //  Concatenate a string (n) times.

  @tailrec
  def concatString(word: String, n: Int, acc: String): String = {
    if (n <= 0) acc
    else concatString(word, n - 1, word + acc)

  }

  println(concatString("I Love U Winnie, ", 5, ""))


  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else if (n <= 1) true
      else isPrimeTailrec(t - 1, n % t != 0 && isStillPrime)
    }

    isPrimeTailrec(n / 2, true)
  }

  println(isPrime(3))


  def fib(n: Int): Int = {
    @tailrec
    def fibTailrec(i: Int, nextToLast: Int, last: Int): Int =
      if (i >= n) last
      else fibTailrec(i + 1, last + nextToLast, last)

    if (n <= 2) 1
    else fibTailrec(3, 1, 1) // because these are the first two fibonacci numbers.
  }

  println(fib(8))

  def fibonacci(n: Int): Int = if (n < 3) 1 else {
    val res = fibonacci(n - 1) + fibonacci(n - 2);
    res
  }

  for {i <- List.range(1, 17)} yield print(fibonacci(i) + ", ")
}
