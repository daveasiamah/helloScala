package part2OOP

/**/
object VendingMachine extends App {
  /*The Vending Machine project:
  A vending machine that sells two products:
  1. "White Chocolate Bar for $1.50" and
  2. "Granola Bar for $1.00.
  NB: The machine does not give back change.

  3. A customer can buy an item by selecting a specific product and inserting money into
  the vending machine.
  4. Once the vending machine receives the request, it should check that it should collect
  the money and release the product.
  5. Analyze the business requirements and identify the main components of this vending machine.

  Analysis of business requirements:
  a. A customer requests a product to buy.
  Following this operation, the vending machine should:
  b. Check if the product is in stock.
  c. Check if the money is enough to cover its cost.
  d. Reject the request if the the product is not in stock, or money is not enough.
  e. When rejecting the request, it should display a human-readable text explaining what went wrong.
  f. When successful, it should collect the money.
  g. Release the product.
  h. Display a message that acknowledges the purchase.
  * */

  //  class Product(productName: String, money: Double)
  //
  //  class ChocolateBar extends Product("White Chocolate Bar", 1.50)
  //
  //  class GranolaBar extends Product("Granola Bar", 1.00)

  class VendingMachine {
    var chocolateBar: Int = 0
    var granolaBar: Int = 0
    var totalMoney: Double = 0.0

    def addToStock(product: String, quantity: Int = 0): Unit = {
      if (product == "chocolate") chocolateBar += quantity
      else if (product == "granola") granolaBar += quantity
    }

    def collectMoney(money: Double): Unit = totalMoney += money

    def releaseProduct(product: String): Unit = {
      if (product == "chocolate") chocolateBar -= 1
      else if (product == "granola") granolaBar -= 1
    }

    def isProductAvailable(product: String): Boolean = {
      val productQuantity = {
        if (product == "chocolate") chocolateBar
        else if (product == "granola") granolaBar
        else 0
      }
      productQuantity > 0
    }

    def isMoneyEnough(product: String, money: Double): Boolean = {
      val cost = if (product == "chocolate") 1.5 else 1
      money >= cost
    }

    def completeBuyRequest(product: String, money: Double): String = {
      collectMoney(money)
      releaseProduct(product)
      s"There you go!, Have a $product bar"
    }


    def buy(product: String, money: Double): String = {
      if (!isProductAvailable(product))
        s"Oops!, product $product is out of stock."
      else if (!isMoneyEnough(product, money))
        s"Please, insert more money"
      else completeBuyRequest(product, money)
    }
  }

  val machine1 = new VendingMachine

  machine1.addToStock("granola", 2)
  machine1.addToStock("chocolate", 5)
  //  machine1
  //  machine1.chocolateBar += 2

  println(machine1.buy("granola", 1.00))
  println(machine1.buy("chocolate", 1.50))
  println(machine1.buy("chocolate", 1.50))

  println(s"Total sales collected is: " + machine1.totalMoney)

}
