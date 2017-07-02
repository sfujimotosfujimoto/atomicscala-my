import com.atomicscala.AtomicTest._

object ChangingAVal extends App {
  class X(var n:Int)
  val x = new X(11)
  x.n is 11
  x.n = 22
  x.n is 22
}



