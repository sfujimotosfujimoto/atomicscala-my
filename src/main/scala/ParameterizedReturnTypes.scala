import com.atomicscala.AtomicTest._
object ParameterizedReturnTypes extends App {

  def inferred(c1: Char, c2: Char, c3: Char) = {
    Vector(c1, c2, c3)
  }




  inferred('a', 'b', 'c') is "Vector(a,b,c)"

}
