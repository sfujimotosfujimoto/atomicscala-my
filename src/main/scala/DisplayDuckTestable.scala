import com.atomicscala.AtomicTest._

object DisplayDuckTestable extends App {
  var s = ""
  val duck = "Duck".toVector
  duck.foreach(n => s = s + n + ":")
  s is "D:u:c:k:"
}


