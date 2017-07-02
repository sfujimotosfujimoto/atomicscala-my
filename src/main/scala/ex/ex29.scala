import com.atomicscala.AtomicTest._
println("//1")
def inferred(c1:Char, c2:Char, c3:Char) = {
  Vector(c1, c2, c3)
}


def explicitDouble(c1:Double, c2:Double, c3:Double):Vector[Double] = {
  Vector(c1, c2, c3)
}




explicitDouble(1.0, 2.0, 3.0) is Vector(1.0, 2.0, 3.0)

println("//2")

  def explicitList(v:Vector[Double]):List[Double] = {
    v.toList
  }


explicitList(Vector(10.0, 20.0)) is List(10.0, 20.0)
explicitList(Vector(1, 2, 3)) is List(1.0, 2.0, 3.0)

println("//3")

  def explicitSet(v:Vector[Double]):Set[Double] = {
    v.toSet
  }

explicitSet(Vector(10.0, 20.0, 10.0)) is Set(10.0, 20.0)
explicitSet(Vector(1, 2, 3, 2, 3, 4)) is Set(1.0, 2.0, 3.0, 4.0)

println("//4")

  def historicalData(data:Vector[Int]):String = {
    var sunny = 0
    var mostlySunny = 0
    var mostlyCloudy = 0

    for(s <- data) {
      s match {
        case 100 => sunny += 1
        case 80 => mostlySunny += 1
        case 20 => mostlyCloudy += 1
      }
    }    
    val forecastString = ("Sunny=" + sunny + ", Mostly Sunny=" + mostlySunny + ", Mostly Cloudy=" + mostlyCloudy
)
    forecastString
  }
  

val weather = Vector(100, 80, 20, 100, 20)
historicalData(weather) is "Sunny=2, Mostly Sunny=1, Mostly Cloudy=2"


