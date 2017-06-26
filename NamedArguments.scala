import com.atomicscala.AtomicTest._

class Color(red:Int, blue:Int, green:Int)
new Color(red = 80, blue = 9, green = 100)
new Color(80, 9, green = 100)

class Color2(red:Int = 100, blue:Int = 100, green:Int = 100)
new Color2(20)
new Color2(20, 17)
new Color2(blue = 20)
new Color2(red = 11, green = 42)

