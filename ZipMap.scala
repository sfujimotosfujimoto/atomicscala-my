/*  / sfujimoto: 2017/06/29 17:55 */
import com.atomicscala.AtomicTest._

case class Person(name:String, ID:Int)
val names = Vector("Bob", "Jill", "Jim")
val IDs = Vector(1731, 9274, 8378)

names.zip(IDs).map {
  case(n, id) => Person(n, id)
} is "Vector(Person(Bob,1731), Person(Jill,9274), Person(Jim,8378))"



