object CaseClassesAndPatternMatching extends App {

  val someSms = SMS("+144-233-521-555", "Are you there?")
  val someVoiceRecording = VoiceRecording("Tom", "https://acmevoice.com/id/123/001")
  val someEmail = Email("Jack", "Our Scala Session", "Hey, I was wondering if we could have our " +
    "Scala session tomorrow. Let me know. \n Best regards \n Jack ")
  val v = Var("x")
  val op = BinOp("+", Number(2.33), v)

  def showNotification(notification: Notification): String = {
    println("** Acme Notification System v0.01 **")
    notification match {
      case Email(sender, title, body) =>
        s"You got an email from $sender with title: \n$title with body: \n$body"
      case SMS(number, message) =>
        s"You got an SMS from $number! Message: $message"
      case VoiceRecording(name, link) =>
        s"You received a Voice Recording from $name! Click the link to hear it: $link"
    }
  }

  abstract class Notification

  abstract class Expr

  println(showNotification(someSms))
  println(showNotification(someEmail))

  println(showNotification(someVoiceRecording))

  /*Another Example of case classes and pattern matching:
   * */

  case class Email(sender: String, title: String, body: String) extends Notification

  case class SMS(caller: String, message: String) extends Notification

  case class VoiceRecording(value: String, value1: String) extends Notification

  case class Var(name: String) extends Expr

  case class Number(num: Double) extends Expr

  case class UnOp(operator: String, arg: Expr) extends Expr

  case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

}
