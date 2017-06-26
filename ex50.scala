/*  / sfujimoto: 2017/06/26 17:05 */
import com.atomicscala.AtomicTest._



trait EnergySource

trait BatteryPower {
  def monitor(charge:Int):String = {
    if(charge < 20) "red"
    else if(charge < 40) "yellow"
    else "green"
  }
}

class Battery extends EnergySource with BatteryPower

object Battery extends App {
  val battery = new Battery
  for(arg <- args)
    println(battery.monitor(arg.toInt))
}

