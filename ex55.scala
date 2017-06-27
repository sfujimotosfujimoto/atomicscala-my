/*  / sfujimoto: 2017/06/27 17:52 */
import com.atomicscala.AtomicTest._

sealed trait Color
case object Red extends Color
case object Green extends Color
case object Blue extends Color
case object Purple extends Color
object Color {
  val values = Vector(Red, Green, Blue, Purple)
}

def display(c:Color) = c match {
  case Red => s"It's $c"
  case Green => s"It's $c"
  case Blue => s"It's $c"
  case Purple => s"It's $c"
}

object EnumColor extends Enumeration {
  type EnumColor = Value
  val Red,
      Green,
      Blue= Value
}
import EnumColor._

EnumColor.Red is "Red"
EnumColor.Blue is "Blue"
EnumColor.Green is "Green"

