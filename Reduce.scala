import com.atomicscala.AtomicTest._

val v = Vector(1, 10, 100, 1000)
v.reduce((sum, n) => sum + n) is 1111

(1 to 100).reduce((sum, n) => sum + n) is 5050

val v2 = Vector("D", "u", "c", "k")

v2.reduce((sum, n) => sum + n) is "Duck"
