import com.atomicscala.AtomicTest._

case class Passenger(
  first:String, last:String
  )
case class Train(
  travelers:Vector[Passenger],
  line:String
  )
case class Bus(
  passengers:Vector[Passenger],
  capacity:Int
  )

case class Plane(
  passengers:Vector[Passenger],
  line:String
  )

def travel(transport:Any):String = {
  transport match {
    case Train(travelers, line) => s"Train line $line $travelers"
    case Bus(travelers, seats) => s"Bus size $seats $travelers"
    case Plane(travelers, line) => s"Plane $line $travelers"
    case Passenger => "Walking along"
    case what => s"$what is in limbo!"
  }
}
def travel2(transport:Any):String = {
  transport match {
    case Train(travelers, line) => s"Train line $line $travelers"
    case Bus(travelers, seats) => s"Bus size $seats $travelers"
    case Plane(travelers, line) => s"Plane $line $travelers"
    case Passenger(first, last) => s"$first is walking"
    case what => s"$what is in limbo!"
  }
}




val travelers = Vector(
  Passenger("Harvey", "Rabbit"),
  Passenger("Dorothy", "Gale")
  )

val trip = Vector(
  Train(travelers, "Reading"),
  Bus(travelers, 100)
  )





val trip2 = Vector(
  Train(travelers, "Reading"),
  Plane(travelers, "B757"),
  Bus(travelers, 100))

travel(trip2(1)) is "Plane B757 Vector(Passenger(Harvey,Rabbit), Passenger(Dorothy,Gale))"

travel2(Passenger("Sally", "Marie")) is "Sally is walking"



case class Kitten(name:String)

travel2(Kitten("Kitty")) is "Kitten(Kitty) is in limbo!"
