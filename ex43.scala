import com.atomicscala.AtomicTest._
/* sfujimoto: 2017/06/26 12:53 */

println("//1")


class GreatApe(val weight:Double, val age:Int, val color:String = "Black") {
  def yell():String = "YAHHHh!!!!"
}

class Bonobo(weight:Double, age:Int) extends GreatApe(weight, age)

class Chimpanzee(weight:Double, age:Int) extends GreatApe(weight, age)
class BonoboB(weight:Double, age:Int) extends Bonobo(weight, age)

class BonoboC(weight:Double, age:Int) extends BonoboB(weight, age)


def display(ape:GreatApe) = s"weight: ${ape.weight} age: ${ape.age}"

display(new GreatApe(100, 12, "Black")) is "weight: 100.0 age: 12"
display(new Bonobo(100, 12)) is "weight: 100.0 age: 12"
display(new Chimpanzee(100, 12)) is "weight: 100.0 age: 12"
display(new BonoboB(100, 12)) is "weight: 100.0 age: 12"
display(new BonoboC(100, 12)) is "weight: 100.0 age: 12"

println("//2")

val b = new Bonobo(10, 12)
b.yell() is "YAHHHh!!!!"

println("//3")

class House(val address:String, val state:String, val zip:String) {
  def this(state:String, zip:String) = this("address?", state, zip)
  def this(zip:String) = this("address?", "state?", zip)
}

class Home(address:String, state:String, zip:String, val name:String, val heart:Boolean = true) extends House(address, state, zip) {
  override def toString = "Where the heart is"
}






val h = new Home("Naka", "Tokyo", "177-9987", "Home!", true )
h.toString is "Where the heart is"
h.heart is true

println("//4")
class VacationHouse(state:String, zip:String, val startMonth:Int, val endMonth:Int) extends House(state, zip) {
  def intToMonth(n:Int):String = {
    n match {
      case 1 => "January"
      case 2 => "February"
      case 3 => "March"
      case 4 => "April"
      case 5 => "May"
      case 6 => "June"
      case 7 => "July"
      case 8 => "August"
      case 9 => "September"
      case 10 => "October"
      case 11 => "November"
      case 12 => "December"
      case _ => "Huh??"
    }
  }
  override def toString = s"Rented house in $state for months of ${intToMonth(startMonth)} through ${intToMonth(endMonth)}."
}




val v = new VacationHouse("MI", "49431", 6, 8)
v is "Rented house in MI for months of " +
  "June through August."


println("//5")
class Trip(val origination:String, val destination:String, val startDate:String, val endDate:String) {
  override def toString = s"From $origination to $destination: $startDate to $endDate"
}

class AirplaneTrip(origination:String, destination:String, startDate:String, endDate:String, val movie:String) extends Trip(origination, destination, startDate, endDate)

class CarTrip(cities:Vector[String], startDate:String, endDate:String) extends Trip(cities.head, cities.last, startDate, endDate)

val t = new Trip("Detroit","Houston",
  "5/1/2012","6/1/2012")
val a = new AirplaneTrip("Detroit",
  "London","9/1/1939",
  "10/31/1939", "Superman")
val cities = Vector("Boston",
  "Albany","Buffalo","Cleveland",
  "Columbus","Indianapolis",
  "St. Louis", "Kansas City",
  "Denver", "Grand Junction",
  "Salt Lake City", "Las Vegas",
  "Bakersfield", "San Francisco")
val c = new CarTrip(cities,
  "6/1/2012", "7/1/2012")
c.origination is "Boston"
c.destination is "San Francisco"
c.startDate is "6/1/2012"
t is "From Detroit to Houston:" + " 5/1/2012 to 6/1/2012"
c is "From Boston to San Francisco:" + " 6/1/2012 to 7/1/2012"


println("//6")
