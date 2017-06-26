import com.atomicscala.AtomicTest._

def acceptAnything(x:Any):String = {
  x match {
    case s:String => "A String: " + s
    case i:Int if(i<20) => s"An Int less than 20: $i"
    case i:Int => s"Some other Int: $i"
    case p:Person => s"A person ${p.name}"
    case _ => "I don't know what that is!"
  }
}

acceptAnything(5) is "An Int less that 20: 5"
acceptAnything(25) is "Some other Int: 25"
acceptAnything("Some text") is "A String: Some text"

case class Person(name:String)
val bob = Person("Bob")
acceptAnything(bob) is "A person Bob"

acceptAnything(Vector(1, 2, 5)) is "I don't know what that is!"

