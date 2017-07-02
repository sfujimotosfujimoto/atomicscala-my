import com.atomicscala.AtomicTest._

case class Bicycle(riders:Int)


class Surrey(val adornment:String)


class Surrey2(val adornment:String) {
  override def toString = s"Surrey with the $adornment"
}

object Bicycle extends App {
  val fancy2 = new Surrey2("fringe on top")
  fancy2 is "Surrey with the fringe on top"
  val forTwo = Bicycle(2)
  forTwo is "Bicycle(2)"
  val fancy = new Surrey("fringe on top")
  println(fancy)
}

