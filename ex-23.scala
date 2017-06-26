import com.atomicscala.AtomicTest._

println("// 1")

println("// 2")

  class Overloading3 {
    def f():Int ={ 0 }
    def f(n:Int) = { n }
    def f(n:Int, m:Int) = { n + m }
    def f(n:Int, m:Int, o:Int) = { n + m + o }
    def f(n:Int, m:Int, o:Int, p:Int) = { n + m + o + p }
  }
val g = new Overloading3
g.f() is 0
g.f(1) is 1
g.f(1, 2) is 3
g.f(1, 2, 3) is 6
g.f(1, 2, 3, 4) is 10
println("// 3")

println("// 4")

