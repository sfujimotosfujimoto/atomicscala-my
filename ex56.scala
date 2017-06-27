/*  / sfujimoto: 2017/06/27 18:23 */
import com.atomicscala.AtomicTest._

trait Building
trait Room
trait Storage
trait Sink
trait Storable
trait Store[T <: Storable]
trait Cook[T]
trait Cleanable
trait Clean[T <: Cleanable]

trait Edible extends Cleanable with Storable

object Protein extends Enumeration {
  case class _Val() extends Val with Edible
  type Protein = _Val
  val beef, chicken, pork, tofu = _Val()
}
import Protein._

object Fruit extends Enumeration {
  case class _Val() extends Val with Edible
  type Fruit = _Val
  val apple, orange, banana, tomato = _Val()
}
import Fruit._

trait Food[F <: Edible]
  extends Store[F]
  with Clean[F]
  with Cook[F]

trait Handheld extends Cleanable with Storable

object Cutlery extends Enumeration {
  case class _Val() extends Val with Handheld
  type Cutlery = _Val
  val knife, spoon, fork, spatula = _Val()
}
import Cutlery._

object Device extends Enumeration {
  case class _Val() extends Val with Handheld
  type Device = _Val
  val poacher, timer, sifter, torch = _Val()
}
import Device._

trait Utensil[Utensil <: Handheld]
  extends Store[Utensil]
  with Clean[Utensil]
  with Cook[Utensil]



trait Kitchen extends Room {
  val storage:Storage
  val sinks:Vector[Sink]
  val food:Food[Edible]
  val utensils:Vector[Utensil[Handheld]]
}

case class House() extends Building {
  val kitchens = Vector[Kitchen]()
}

House is "House"

///// 3
class Base {
  override def toString = "Base"
}
class Derived extends Base {
  override def toString = "Derived"
}
class Most extends Derived {
  override def toString = "Most"
}

def f1[T <: Base](t:T) = "f1 " + t
def f2[T <: Derived](t:T) = "f2 " + t
def f3[T <: Most](t:T) = "f3 " + t

f1(new Base) is "f1 Base"
f1(new Derived) is "f1 Derived"
f1(new Most) is "f1 Most"

f2(new Derived) is "f2 Derived"
f2(new Most) is "f2 Most"

f3(new Most) is "f3 Most"


