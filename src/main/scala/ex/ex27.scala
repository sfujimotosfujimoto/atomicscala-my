import com.atomicscala.AtomicTest._

println("// 1")
case class Person(val first:String,val last:String, val email:String)

val p = Person("Jane", "Smile", "jane@smile.com")
p.first is "Jane"
p.last is "Smile"
p.email is "jane@smile.com"

println("// 2")



val people = Vector(
  Person("Jane","Smile","jane@smile.com"),
  Person("Ron","House","ron@house.com"),
  Person("Sally","Dove","sally@dove.com"))

people(0) is "Person(Jane,Smile,jane@smile.com)"
people(1) is "Person(Ron,House,ron@house.com)"
people(2) is "Person(Sally,Dove,sally@dove.com)"

println("// 3")
case class Dog(name:String, breed:String)

val dogs = Vector(
  Dog("Fido", "Golden Lab"),
  Dog("Ruff", "Alaskan Malamute"),
  Dog("Fifi", "Miniature Poodle")
  )

dogs(0) is "Dog(Fido,Golden Lab)"
dogs(1) is "Dog(Ruff,Alaskan Malamute)"
dogs(2) is "Dog(Fifi,Miniature Poodle)"

println("// 4")
case class Dimension(var height:Int, var width:Int)
val c = new Dimension(5,7)
c.height is 5
c.height = 10
c.height is 10
c.width = 19
c.width is 19

println("// 5")
println("// 6")

case class SimpleTimeDefault(val hours:Int, val minutes:Int = 0) {
  def subtract(aTime:SimpleTimeDefault):SimpleTimeDefault = {
    val h = hours - aTime.hours
    val m = minutes - aTime.minutes
    if(h < 0) {
      new SimpleTimeDefault(0, 0)
    } else if(m >= 0) {
      new SimpleTimeDefault(h, m)
    } else {
      new SimpleTimeDefault(h - 1, m + 60)
    }
  }
}

val anotherT1 = new SimpleTimeDefault(10, 30)
val anotherT2 = new SimpleTimeDefault(9)
val anotherST = anotherT1.subtract(anotherT2)

anotherST.hours is 1
anotherST.minutes is 30

val anotherST2 =
  new SimpleTimeDefault(10).subtract(new SimpleTimeDefault(9, 45))

anotherST2.hours is 0
anotherST2.minutes is 15
