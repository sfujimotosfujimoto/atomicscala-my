/* sfujimoto: 2017/06/26 14:38 */
trait AllAbstract {
  def f(n:Int):Int
  val d:Double
}

trait PartialAbstract {
  def f(n:Int):Int
  val d:Double
  def g(s:String) = s"($s)"
  val j = 42
}

trait Concrete {
  def f(n:Int) = n * 11
  val d = 1.61803
}

abstract class Klass1 extends AllAbstract with PartialAbstract

class Klass2 extends AllAbstract {
  def f(n:Int) = n * 12
  val d = 3.14159
}

new Klass2

class Klass3 extends AllAbstract with Concrete

new Klass3

class Klass4 extends PartialAbstract with Concrete

new Klass4

class Klass5 extends AllAbstract with PartialAbstract with Concrete

new Klass5

trait FromAbstract extends Klass1
trait FromConcrete extends Klass2

trait Construction {
  println("Constructor body")
}

class Constructable extends Construction
new Constructable

val x = new AllAbstract with PartialAbstract with Concrete


