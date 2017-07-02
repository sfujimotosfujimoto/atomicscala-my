  import com.atomicscala.AtomicTest._
object ExpressionInterpolation extends App {

  def f(n: Int): Int = {
    n * 11
  }

  s"f(7) is ${f(7)}!" is "f(7) is 77!"

}
