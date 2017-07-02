/*  / sfujimoto: 2017/06/26 14:54 */
println("//1")
import com.atomicscala.AtomicTest._

trait EnergySource

trait BatteryPower {
  def monitor(charge:Int) = {
    charge match {
      case _ if(charge > 40) => "green"
      case _ if(charge >= 20) => "yellow"
      case _ if(charge < 20) => "red"
    }
  }
}


class Battery extends EnergySource with BatteryPower
val battery = new Battery
battery.monitor(80) is "green"
battery.monitor(30) is "yellow"
battery.monitor(10) is "red"


println("//2")

class Toy

class BatteryPoweredToy extends Toy with BatteryPower


val toy = new BatteryPoweredToy
toy.monitor(50) is "green"

println("//3")




val toy2 = new BatteryPoweredToy
toy2.monitor(50) is "green"