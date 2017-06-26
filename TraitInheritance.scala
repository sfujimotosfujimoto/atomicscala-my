/* sfujimoto: 2017/06/26 14:45 */
import com.atomicscala.AtomicTest._

trait Base {
  def f = "f"
}

trait Derived1 extends Base {
  def g = "17"
}

trait Derived2 extends Derived1 {
  def h = "1.11"
}

class Derived3 extends Derived2

val d = new Derived3

d.f is "f"
d.g is "17"
d.h is "1.11"

