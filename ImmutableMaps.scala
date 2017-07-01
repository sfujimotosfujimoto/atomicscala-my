import com.atomicscala.AtomicTest._

val m = Map(5 -> "five", 6 -> "six")
m(5) is "five"

m + (4 -> "four")
m is Map(5 -> "five", 6 -> "six")
val m2 = m + (4 -> "four")
m2 is Map(5 -> "five", 6 -> "six", 4 -> "four")

