  /*  / sfujimoto: 2017/06/29 6:57 */
  import com.atomicscala.AtomicTest._
object RecursiveSum extends App{

  def sumIt(toSum: List[Int], sum: Int = 0): Int = {
    println("sum: " + sum + " / List: " + toSum)
    if (toSum.isEmpty)
      sum
    else
      sumIt(toSum.tail, sum + toSum.head)

  }


  sumIt(List(10, 20, 30, 40, 50)) is 150
}
