import com.atomicscala.AtomicTest._
object MultipleClassArgs extends App {

  class Sum3(a1: Int, a2: Int, a3: Int) {
    def result(): Int = {
      a1 + a2 + a3
    }

  }

  new Sum3(13, 27, 44).result() is 84

  class Sum(args: Int*) {
    def result(): Int = {
      var total = 0
      for (n <- args) {
        total += n
      }
      total
    }
  }

  new Sum(13, 27, 44).result() is 84
  new Sum(1, 3, 5, 7, 9, 11).result() is 36
}
