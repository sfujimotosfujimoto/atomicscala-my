/* sfujimoto: 2017/06/26 13:39 */
import com.atomicscala.AtomicTest._

println("//1")


class GreatApe2(val weight:Double, val age:Int, val gender:String) {
  def myWords:Vector[String] = Vector("Roar")
}

class Bonobo2(weight:Double, age:Int, gender:String)
  extends GreatApe2(weight, age, gender) {
  override def myWords:Vector[String] = super.myWords ++ Vector("Hello")
}



println("//2")



val roaringApe = new GreatApe2(112, 9, "Male")
roaringApe.myWords is Vector("Roar")
val chattyBonobo = new Bonobo2(150, 14, "Female")
chattyBonobo.myWords is Vector("Roar", "Hello")



println("//3")

class Trip(val origination:String, val destination:String, val startDate:String, val endDate:String) {
  override def toString = "From " + origination + " to " + destination + ": " + startDate + " to " + endDate
}

class AirplaneTrip(origination:String, destination:String, startDate:String, endDate:String, val movie:String)
  extends Trip(origination, destination, startDate, endDate) {
  override def toString = "On a flight from " + origination + " to " + destination + ", we watched " + movie
}

class CarTrip(val wayPoints:Vector[String], startDate:String, endDate:String)
  extends Trip(wayPoints.head, wayPoints.last, startDate, endDate) {
  override def toString = s"From $origination to $destination: $startDate to $endDate, we visited " + wayPoints.slice(1, wayPoints.length -1)
}

val t = new Trip("Detroit","Houston", "5/1/2012","6/1/2012")
val a = new AirplaneTrip("Detroit", "London", "9/1/1939", "10/31/1939", "Superman")

val cities = Vector("Boston",
  "Albany","Buffalo","Cleveland",
  "Columbus","Indianapolis",
  "St. Louis", "Kansas City",
  "Denver", "Grand Junction",
  "Salt Lake City", "Las Vegas",
  "Bakersfield", "San Francisco")

val c = new CarTrip(cities, "6/1/2012", "7/1/2012")

c.origination is "Boston"
c.destination is "San Francisco"
c.startDate is "6/1/2012"

t is "From Detroit to Houston: 5/1/2012 to 6/1/2012"
a is "From Detroit to London: 9/1/1939 to 10/31/1939, we watched Superman"
c is "From Boston to San Francisco:" +
  " 6/1/2012 to 7/1/2012, we visited" +
  " Vector(Albany, Buffalo, " +
  "Cleveland, Columbus, Indianapolis," +
  " St. Louis, Kansas City, Denver, " +
  "Grand Junction, Salt Lake City, " +
  "Las Vegas, Bakersfield)"