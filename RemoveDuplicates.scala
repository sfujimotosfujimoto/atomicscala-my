import com.atomicscala.AtomicTest._

val ch = for(i <- 0 to 2) yield 'a' to 'd'
ch is "Vector(NumericRange a to d, NumericRange a to d, NumericRange a to d)"

ch.flatten is "Vector(a, b, c, d, a, b, c, d, a, b, c, d)"

ch.flatten.toSet is "Set(a, b, c, d)"

