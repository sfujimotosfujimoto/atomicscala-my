import com.atomicscala.AtomicTest._

def matchColor(color:String):String = {
  color match {
    case "red" => "RED"
    case "blue" => "BLUE"
    case "green" => "GREEN"
    case _ => "UNKNOWN COLOR: " + color
  }
}

matchColor("white") is "UNKNOWN COLOR: white"

def matchColor2(color:String):String = {
  if(color == "red") "RED"
  else if (color == "blue") "BLUE"
  else if (color == "green") "GREEN"
  else "UNKNOWN COLOR: " + color

}

matchColor2("green") is "GREEN"

//2

def oneOrTheOther(exp:Boolean):String = {
  exp match {
    case true => "True!"
    case _ => "It's false"
  }
}

val v = Vector(1)
val v2 = Vector(3, 4)
oneOrTheOther(v == v.reverse) is "True!"
oneOrTheOther(v2 == v2.reverse) is "It's false"


//3
def checkTruth(exp1:Boolean, exp2:Boolean):String = {
  exp1 match {
    case true => 
      if(exp2) "Both are true"
      else "First: true, second: false"
    case false => 
      if(exp2) "First: false, second: true"
      else "Both are false"
  }
}


checkTruth(true || false, true) is "Both are true"
checkTruth(1 > 0 && -1 < 0, 1 == 2) is "First: true, second: false"
checkTruth(1 >= 2, 1 >= 1) is "First: false, second: true"
checkTruth(true && false, false && true) is "Both are false"


//4 forecast
def forecast(n:Int):String = {
  n match {
    case 100 => "Sunny"
    case 80 => "Mostly Sunny"
    case 50 => "Partly Sunny"
    case 20 => "Mostly Cloudy"
    case 15 => "Unknown"
    case 0 => "Cloudy"
    case _ => "???"
  }
}
forecast(100) is "Sunny"
forecast(80) is "Mostly Sunny"
forecast(50) is "Partly Sunny"

val sD = Vector(100, 80, 50, 20, 0, 15)

def forecastLoop(sD:Vector[Int]):Unit = {
  for (s <- sD) {
    println("forecast(" + s +") is " + forecast(s))
  }

}
println("\n///num5///")
forecastLoop(sD)
