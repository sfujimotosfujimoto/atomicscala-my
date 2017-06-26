import com.atomicscala.AtomicTest._


class ClothesWasher(
  val model:String,
  val capacity:Double
) {
  def this(model:String) {
    this(model, 2.0)
  }
  def this(capacity:Double){
    this("Unknown", capacity)
  }
}

class ClothesWasher2(
  val model:String = "Unknown",
  val capacity:Double = 2.0
)

println("// 4")

class ClothesWasher3(
  val model:String,
  val capacity:Double
) {
  def this(model:String) {
    this(model, 2.0)
  }
  def this(capacity:Double){
    this("Unknown", capacity)
  }
  def wash():String = {
    "Simple wash"
  }
  def wash(bleach:Int, fs:Int):String = {
    "Wash used " + bleach + " bleach and " + fs + " fabric softener"
  }
}


val washer = new ClothesWasher3("LG 100", 3.6)
washer.wash(2, 1) is "Wash used 2 bleach and 1 fabric softener"
washer.wash() is "Simple wash"
