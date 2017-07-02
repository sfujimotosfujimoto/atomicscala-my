import com.atomicscala.AtomicTest._

class Exclaim(var s:String) {
  var count = 0
  def noParens = {
    s + "!"
    count += 1
  }  
}

val e = new Exclaim("counting")
// Call exclamation method
// Call exclamation method again
e.noParens
e.noParens
e.count is 2


