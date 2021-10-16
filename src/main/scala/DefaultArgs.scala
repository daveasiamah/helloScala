import scala.annotation.tailrec

/*
 * Created*/
object DefaultArgs extends App {

  @tailrec
  def tailRecFactorial(n: Int, acc: Int = 1): Int = {
    if (n <= 1) acc
    else tailRecFactorial(n - 1, n * acc)
  }

  val fact10 = tailRecFactorial(10) //default value of acc implied
  println(fact10)

  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = {
    println(s"Saving picture with Format: ${format}, Resolution: ${width} X ${height})....")
    println("Picture Saved")
  }

  savePicture(format = "bmp", 1440, 1920)
  savePicture()
}
