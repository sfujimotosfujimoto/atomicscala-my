/* sfujimoto: 2017/06/26 14:51 */
import com.atomicscala.AtomicTest._

trait Framework {
  val part1:Int
  def part2:Double

  def templateMethod = part1 + part2
}


def operation(impl:Framework) = impl.templateMethod

class Implementation extends Framework {
  val part1 = 42
  val part2 = 2.71828
}


operation(new Implementation) is 44.71828
