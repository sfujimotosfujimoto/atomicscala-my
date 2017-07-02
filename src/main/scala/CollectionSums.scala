/*  / sfujimoto: 2017/06/29 6:59 */
import com.atomicscala.AtomicTest._

object CollectionSums extends App {
  List(10, 20, 30, 40, 50).sum is 150
  Vector(10, 20, 30, 40, 50).sum is 150
  Seq(10, 20, 30, 40, 50).sum is 150
  (10 to 50 by 10).sum is 150

}




