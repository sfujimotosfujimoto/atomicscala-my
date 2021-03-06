  import com.atomicscala.AtomicTest._
  import com.atomicscala.Name
  /*  / sfujimoto: 2017/07/01 7:47 */
object PetMap extends App {


  trait Pet extends Name
  class Bird extends Pet
  class Duck extends Bird
  class Cat extends Pet
  class Dog extends Pet

  val petMap = Map("Dick" -> new Bird, "Carl" -> new Duck, "Joe" -> new Cat, "Tor" -> new Dog)

  petMap.keys is Set("Dick", "Carl", "Joe", "Tor")
  petMap.values.toVector is "Vector(Bird, Duck, Cat, Dog)"
}
