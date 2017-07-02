import com.atomicscala.AtomicTest._

println("//1")
val v = Vector(1, 2, 3, 4)
v.foreach(n => ((n * 11) + 10)) is Vector(21, 32, 43, 54)


println("//2")
println("//3")
var vec = Vector[Int]()
  for(i <- v) {
    vec = vec :+ i
  }
vec is Vector(1, 2, 3, 4)

println("//4")




val v2 = Vector(1, 2, 3, 4)
v2.map(n => n + 1) is Vector(2, 3, 4, 5)

var vec2 = Vector[Int]()

for(i <- v2){
  vec2 = vec2 :+ (i + 1)
}

vec2 is Vector(2, 3, 4, 5)

println("//5")




val v3 = Vector(1, 10, 100, 1000)
v3.reduce((sum, n) => sum + n) is 1111

(1 to 100).reduce((sum, n) => sum + n) is 5050

var n3 = 0

for (i <- 1 to 100) {
  n3 = n3 + i
}
println("//for 5050")
n3 is 5050


val v4 = Vector("D", "u", "c", "k")

v4.reduce((sum, n) => sum + n) is "Duck"

var s = ""

for (i <- v4) {
  s = s + i
}

println("//6")

  def sumIt(i:Int*) = {
    i.reduce((sum, n)=> sum + n)
  }

sumIt(1, 2, 3) is 6
sumIt(45, 45, 45, 60) is 195
