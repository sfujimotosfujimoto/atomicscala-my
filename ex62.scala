import com.atomicscala.AtomicTest._

val constants = Map(3.141 -> "Pi", 2.718 -> "e",1.618 -> "phi")

Map((3.141, "Pi"), (2.718, "e"), (1.618, "phi")) is constants

Vector((3.141, "Pi"), (2.718, "e"), (1.618, "phi")).toMap is constants

constants(2.718) is "e"

constants.keys is "Set(3.141, 2.718, 1.618)"

constants.values is "MapLike.DefaultValuesIterable(Pi, e, phi)"

(for(pair <- constants) yield pair.toString) is "List((3.141,Pi), (2.718,e), (1.618,phi))"

(for((k,v) <- constants) yield k + ": " + v) is "List(3.141: Pi, 2.718: e, 1.618: phi)"



//// 2

case class Name(firstName:String, lastName:String) 




val m = Map("sally@taylor.com" -> Name("Sally","Taylor"), "jiminy@cricket.com" -> Name("Jiminy", "Cricket"))
m("sally@taylor.com") is Name("Sally", "Taylor")


//// 3

val m2 = Map("sally@taylor.com" -> Name("Sally","Taylor"), "jiminy@cricket.com" -> Name("Jiminy", "Cricket"))

m2("jiminy@cricket.com") is Name("Jiminy", "Cricket")
m2("sally@taylor.com") is Name("Sally", "Taylor")


//// 4

val m3 = Map("English" -> "", "French" -> "", "Spanish" -> "", "German" -> "", "Chinese" -> "")

val m4 = m3 + ("Turkish" -> "")

val m5 = m4 + ("Spanish" -> "")
println(m5)

val m6 = m5 - "Spanish"
m6.contains("Spanish") is false
println(m6)

println(m2)
val m7 = m2 - "jiminy@cricket.com"

m7.contains("jiminy@cricket.com") is false
println(m7)

case class Person(name:String)

val m8 = Map(Person("Bob") -> "CEO", Person("Janice") -> "CFO")

m8(Person("Janice")) is "CFO"


