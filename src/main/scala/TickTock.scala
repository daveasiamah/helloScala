class TickTock(val word: String, delay: Int) extends Runnable {
  override def run(): Unit = {

    while (!Thread.interrupted) {
      try {
        print(s"$word")
        Thread.sleep(delay)
      }
      catch {
        case ie: InterruptedException => {
          println("Interrupted: shutting down")
          Thread.currentThread.interrupt
        }
      }
    }
  }
}
