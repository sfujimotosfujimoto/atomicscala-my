/* sfujimoto: 2017/06/26 14:26 */
import com.atomicscala.AtomicTest._

abstract class Animal {
  def templateMethod = s"The $animal goes $sound"
  def animal:String
  def sound:String
}


class Duck extends Animal {
  def animal = "Duck"
  override def sound = "Quack"
}

class Cow extends Animal {
  def animal = "Cow"
  def sound = "Moo"
}

(new Duck).templateMethod is "The Duck goes Quack"
(new Cow).templateMethod is "The Cow goes Moo"

