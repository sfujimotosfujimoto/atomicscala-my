/* sfujimoto: 2017/06/26 14:30 */
import com.atomicscala.AtomicTest._


abstract class Animal {
  def templateMethod = s"The $animal goes $sound"
  def animal:String
  def sound:String
  def food:String
}


class Duck extends Animal {
  def animal = "Duck"
  override def sound = "Quack"
  override def food = "plants"
}

class Cow extends Animal {
  def animal = "Cow"
  def sound = "Moo"
  def food = "grass"
}




val duck = new Duck
duck.food is "plants"
val cow = new Cow
cow.food is "grass"


println("//2")


class Chicken extends Animal {
  def animal = "Chicken"
  def sound = "!!"
  def food = "insects"
}

class Pig extends Animal {
  def animal = "Pig"
  def sound = "!!!"
  def food = "anything"
}



val chicken = new Chicken
chicken.food is "insects"
val pig = new Pig
pig.food is "anything"

println("//3")

abstract class Adder(x:Int) {
  def add(y:Int):Int
}


class NumericAdder(val x:Int) extends Adder(x) {
  def add(y:Int):Int = x + y
}

val num = new NumericAdder(5)
num.add(10) is 15