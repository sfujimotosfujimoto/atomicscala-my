import com.atomicscala.AtomicTest._
object Main extends App {

  println("////  1")
  class Family(args: String*) {
    def familySize(): Int = {
      args.length
    }
  }

  val family1 = new Family("Mom", "Dad", "Sally", "Dick")
  family1.familySize() is 4
  val family2 = new Family("Dad", "Mom", "Harry")
  family2.familySize() is 3


  println("////  2")

  class FlexibleFamily(father: String, mother: String, kids: String*) {
    def familySize(): Int = {
      var count = 2
      for (k <- kids) {
        count = count + 1
      }
      count
    }
  }

  val family3 = new FlexibleFamily("Mom", "Dad", "Sally", "Dick")
  family3.familySize() is 4
  val family4 = new FlexibleFamily("Dad", "Mom", "Harry")
  family4.familySize() is 3

  val familyNoKids = new FlexibleFamily("Mom", "Dad")
  familyNoKids.familySize() is 2

  println("////  3")


  val familyNoKids1 = new FlexibleFamily("Mom", "Dad")
  familyNoKids1.familySize() is 2

  println("////  8")

  class Cup5(var percentFull: Int) {
    val max = 100

    def add(increase: Int*): Int = {
      for (i <- increase) {
        percentFull += i
        if (percentFull > max) {
          percentFull = max
        }


      }
      percentFull
    }
  }

  val cup5 = new Cup5(0)
  cup5.add(20, 30, 50, 20, 10, -10, -40, 10, 50) is 100
  cup5.add(10, 10, -10, 10, 90, 70, -70) is 30

  println("////  9")

  def squareThem(arg: Int*) = {
    var total = 0
    for (i <- arg) {
      total += i * i
    }
    total
  }

  squareThem(2) is 4
  squareThem(2, 4) is 20
  squareThem(1, 2, 4) is 21


}
