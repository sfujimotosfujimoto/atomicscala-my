import com.atomicscala.AtomicTest._
object MethodParentheses extends App {

  class Simple(val s: String) {
    def getA() = s

    def getB = s
  }

  val simple = new Simple("Hi")
  simple.getA() is "Hi"
  simple.getA is "Hi"
  simple.getB is "Hi"
}
