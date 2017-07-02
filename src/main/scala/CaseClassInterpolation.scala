import com.atomicscala.AtomicTest._

case class Sky(color:String)
object CaseClassInterpolation extends App {
  s"""${new Sky("Blue")}""" is "Sky(Blue)"

}

