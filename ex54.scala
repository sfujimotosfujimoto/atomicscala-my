/*  / sfujimoto: 2017/06/27 17:04 */
import com.atomicscala.AtomicTest._

trait WIFI {
  val address:String
  val reportStatus:String = "working"
}

class Camera {
  def showImage = "Showing video"
}

class WIFICamera extends Camera with WIFI {
  override val address: String = "192.168.0.200"
}


val webcam = new WIFICamera
webcam.showImage is "Showing video"
webcam.address is "192.168.0.200"
webcam.reportStatus is "working"



///// 2

trait Connections {
  val maxConnections = 5
  var connected = 0
  def connect(b:Boolean):Boolean = {
    b match {
      case true =>
        if(connected < maxConnections) {
          connected = connected + 1
          true
        } else false
      case false =>
        if(connected > 0) {
          connected = connected -1
          true
        } else false
    }
  }

}

class Object extends Connections

val c = new Object with Connections
println("////a")
c.maxConnections is 5
println("////b")
c.connect(true) is true
println("////c")
c.connected is 1
println("////d")
for(i <- 0 to 3)
  c.connect(true) is true
println("////e")
c.connected is 5
c.connect(true) is false
println("////f")
c.connect(false) is true
println("////g")
c.connected is 4
println("////h")
for(i <- 0 to 3)
  c.connect(false) is true
println("////i")
c.connected is 0
println("////j")
c.connect(false) is false

//// 4



val c2 = new WIFICamera with Connections
c2.maxConnections is 5
c2.connect(true) is true
c2.connected is 1
c2.connect(false) is true
c2.connected is 0
c2.connect(false) is false


trait ArtPeriod {
  def period(year:Int):String ={
    year match {
      case year if(year > 1970) => "Contemporary"
      case year if(year > 1880) => "Modern"
      case year if(year > 1789) => "Romanticism"
      case year if(year > 1699) => "Late Baroque"
      case year if(year > 1599) => "Baroque"
      case year if(year > 1299) => "Renaissance"
      case year if(year < 1300) => "Pre-Renaissance"
      case _ => "???"
    }
  }
}

// From
// wikipedia.org/wiki/Art_periods
// Pre-Renaissance: before 1300
// Renaissance: 1300-1599
// Baroque: 1600-1699
// Late Baroque: 1700-1789
// Romanticism: 1790-1880
// Modern: 1881-1970
// Contemporary: after 1971
val art = new Object with ArtPeriod
art.period(1400) is "Renaissance"
art.period(1650) is "Baroque"
art.period(1279) is "Pre-Renaissance"


//// 5

class Painting(val name:String, val year:Int) extends ArtPeriod {
  def period:String = period(year)
}

val painting = new Painting("The Starry Night", 1889)
painting.period is "Modern"