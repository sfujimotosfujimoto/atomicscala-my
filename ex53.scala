/*  / sfujimoto: 2017/06/27 6:58 */
import com.atomicscala.AtomicTest._

trait Ability

case class Mobility(val mobility:String) extends Ability
case class Vision(val vision:String) extends Ability
case class Manipulator(val manipulator:String) extends Ability

class Robot {
  var mobility = Vector[Mobility]()
  var vision = Vector[Vision]()
  var manipulator = Vector[Manipulator]()
  def +(m:Mobility) = {
    mobility = mobility :+ m
    this
  }
  def +(v:Vision) = {
    vision = vision :+ v
    this
  }
  def +(m:Manipulator) = {
    manipulator = manipulator :+ m
    this
  }
  override def toString = mobility.mkString(", ") + " | " + vision.mkString(", ") + " | " + manipulator.mkString(", ")
}

///// 3


//// 6


val bot = new Robot +
  Mobility("Propeller") +
  Mobility("Legs") +
  Vision("UV") +
  Vision("Visible Spectrum") +
  Manipulator("Magnet") +
  Manipulator("Claw")

bot is "Mobility(Propeller)," +
  " Mobility(Legs) | Vision(UV)," +
  " Vision(Visible Spectrum) |" +
  " Manipulator(Magnet)," +
  " Manipulator(Claw)"