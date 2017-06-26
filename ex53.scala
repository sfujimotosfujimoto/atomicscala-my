/*  / sfujimoto: 2017/06/27 6:58 */
import com.atomicscala.AtomicTest._

case class Mobility(val mobility:String)

case class Vision(val vision:String)


case class Manipulator(val manipulator:String)

class Robot(m:Mobility, v:Vision, mani:Manipulator) {
  override def toString: String = s"$m, $v, $mani"
}
val walker = new Robot(
  Mobility("Legs"),
  Vision("Visible Spectrum"),
  Manipulator("Magnet"))
walker is "Mobility(Legs), " +
  "Vision(Visible Spectrum)," +
  " Manipulator(Magnet)"
val crawler = new Robot(
  Mobility("Treads"),
  Vision("Infrared"),
  Manipulator("Claw"))
crawler is "Mobility(Treads)," +
  " Vision(Infrared), " +
  "Manipulator(Claw)"
val arial = new Robot(
  Mobility("Propeller"),
  Vision("UV"),
  Manipulator("None"))
arial is "Mobility(Propeller)," +
  " Vision(UV), Manipulator(None)"
