import com.atomicscala.AtomicTest._

case class Cycle(wheels:Int) {
  override def toString = wheels match {
    case 1 => "Unicycle"
    case 2 => "Bicycle"
    case _ if(wheels < 0) => "That's not a cycle!"
    case _ => s"Cycle with $wheels wheels"
  }
}







val c1 = Cycle(1)
c1 is "Unicycle"
val c2 = Cycle(2)
c2 is "Bicycle"
val cn = Cycle(5)
cn is "Cycle with 5 wheels"



Cycle(-2) is "That's not a cycle!"
