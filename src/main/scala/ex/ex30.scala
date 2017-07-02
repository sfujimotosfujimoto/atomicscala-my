import com.atomicscala.AtomicTest._

println("//4")



var s = ""
val v = Vector(1, 5, 7, 8)
v.foreach(i => (s = s + (i * 7 + " ")))
s is "7 35 49 56 "

println("//6")

  val between = (temperature:Int, low:Int, high:Int) => {
    if (temperature < high && temperature > low) true
    else false
  }

between(70, 80, 90) is false
between(70, 60, 90) is true


println("//7")


var s1 = ""
val numbers = Vector(1, 2, 5, 3, 7)
numbers.foreach((n:Int) => (s1 = s1 + (n * n + " ")))
s1 is "1 4 25 9 49 "

println("//8")

  val pluralize = (s:String) => (s + "s")


pluralize("cat") is "cats"
pluralize("dog") is "dogs"
pluralize("silly") is "sillys"

println("//9")

var s2 = ""
val words = Vector("word", "cat", "animal")
words.foreach(w => (s2 = s2 + pluralize(w) + " "))
s2 is "words cats animals "


