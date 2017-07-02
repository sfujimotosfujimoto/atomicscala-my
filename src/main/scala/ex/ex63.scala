import com.atomicscala.AtomicTest._

var m = Map(2 -> "two", 3 -> "three")

m + (4 -> "four")

m is Map(2 -> "two", 3 -> "three")

val m2 = Map(8 -> "eight", 9 -> "nine")

m = m2

m = Map(8 -> "eight", 9 -> "nine")
m is Map(8 -> "eight", 9 -> "nine")

//// 2

val s = Set("a", "b", "a", "c")

s is Set("a", "b", "c")
