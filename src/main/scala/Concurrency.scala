

object Multithreading extends App {
  val t1 = new Thread(new TickTock("Movie Streamer Running", 5000))
  val t2 = new Thread(new TickTock("Music Streamer Running", 5000))
  t1.start()
  t2.start()
  Thread.sleep(5000)
}

object TickTockExecutor extends App {

  import java.util.concurrent._

  val ticker = new TickTock("tick", 500)
  val tocker = new TickTock("tock", 750)

  val engine = Executors.newFixedThreadPool(2)
  engine.execute(ticker)
  engine.execute(tocker)

  Thread.sleep(5000)
  engine.shutdownNow()
}

//object Concurrency extends App{}
