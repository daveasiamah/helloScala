object ValuesVariablesTypes extends App {
  val x: Int = 42;
  println(x)

  var aVariable = 0
  val aWeirdValue = (aVariable = 3) //Unit == void in Java
  println(aWeirdValue)

  //side effects: println(), whiles, reassining
  //Code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2) "hello"
    else"goodbye"
  }
  println(aCodeBlock)
  //What is the difference between "hello world" vs println("hello world")?
  //The String "hello world" is a String literal type and println("hello world") is a Unit type with a side effect

  val someValue = {
    2 < 3
  }

  println(someValue) //true

  val someOtherValue = {
    if (someValue) 239 else 986
    42
  } //42
  println(someOtherValue)

  def aParameterlessFunction(): Int = 22

  println(aParameterlessFunction) //22

  //A Recursive Function
  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("Nihao! ", 3))

  /*1. A greeting function (name, age) => "Hi, my name is $name and I am $age years old."
    2. Factorial function 1 * 2 * 3 * .. * n
    3. f(1) = 1
       f(2) = 2
       f(3) = f(n -1 ) + f(n -2)
    4. Test if a number is prime
  */

  //Greeting function
  def greetingForKids(name: String, age: Int): String = {
    "Hi, my name is " + name + " and I am " + age + " years old."
  }

  println(greetingForKids("Frank", 23))

  //Factorial function -- Recursive
  def factorial(n: Int): Int = {
    if (n <= 0) 1
    else n * factorial(n - 1)
  }

  println(factorial(5))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n / 2)
  }

  println(isPrime(40))
  println(isPrime(2003))
  println(isPrime(37 * 17))
}
