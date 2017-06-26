import com.atomicscala.AtomicTest._

class SimpleTime(val hours:Int, val minutes:Int) {
  def -(aTime:SimpleTime):SimpleTime = {
    val h = hours - aTime.hours
    val m = minutes - aTime.minutes
    if(h < 0) {
      new SimpleTime(0, 0)
    } else if(m >= 0) {
      new SimpleTime(h, m)
    } else {
      new SimpleTime(h - 1, m + 60)
    }
  }
}


val someT1 = new SimpleTime(10, 30)
val someT2 = new SimpleTime(9, 30)
val someST = someT1 - someT2
someST.hours is 1
someST.minutes is 0

val someST2 = new SimpleTime(10, 30) - new SimpleTime(9, 45)
someST2.hours is 0
someST2.minutes is 45

class FancyNumber1(i:Int) {
  def ^(n:Int) = scala.math.pow(i, n).toInt
  def **(n:Int) = scala.math.pow(i, n).toInt
}


val a2 = new FancyNumber1(2)
a2.^(3) is 8
val b2 = new FancyNumber1(10)
b2 ^ 2 is 100





val a3 = new FancyNumber1(2)
a3.^(3) is 8
a3.**(3) is 8
val b3 = new FancyNumber1(10)
b3 ^ 2 is 100
b3 ** 2 is 100
