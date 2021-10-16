object Currying extends App{
        def add(num1:Int)(num2:Int)=num1+num2
        def multiply(num1:Int)=(num2:Int)=>num1*num2
        println(add(2)(45))
        println(multiply(2)(45))
        }
