/* sfujimoto: 2017/06/26 13:59 */
import com.atomicscala.AtomicTest._

println("//1")

object MonthName extends Enumeration {
  type MonthName = Value
  val January = Value(1)
  val February,
      March,
      April,
      May,
      June,
      July,
      August,
      September,
      October,
      November,
      December = Value

}
import MonthName._
def monthNumber(month:MonthName):Int = month.id

println("//2")
MonthName.February is "February"
MonthName.February.id is 2
MonthName.December.id is 12
MonthName.July.id is 7




println("//3")
July is "July"
monthNumber(July) is 7


println("//4")

def season(month:MonthName):String = {
  month.id match {
    case 1 => "Winter"
    case 2 => "Winter"
    case 3 => "Spring"
    case 4 => "Spring"
    case 5 => "Spring"
    case 6 => "Summer"
    case 7 => "Summer"
    case 8 => "Summer"
    case 9 => "Autumn"
    case 10 => "Autumn"
    case 11 => "Autumn"
    case 12 => "Winter"
  }
}



season(January) is "Winter"
season(April) is "Spring"
season(August) is "Summer"
season(November) is "Autumn"


println("//6")

object Level extends Enumeration {
  type Level  = Value
  val Overflow, High, Medium, Low, Empty, Draining, Pooling, Dry = Value
}

Level.Medium is "Medium"
import Level._
Medium is "Medium"

{ for(n <- Range(0, Level.maxId))
  yield (n, Level(n)) } is Vector((0, Overflow), (1, High), (2, Medium), (3, Low), (4, Empty), (5, Draining), (6, Pooling), (7, Dry))

{ for(lev <- Level.values)
  yield lev }.toIndexedSeq is Vector(Overflow, High, Medium, Low, Empty, Draining, Pooling, Dry)

def checkLevel(level:Level) = level match {
  case Overflow => ">>> Overflow!"
  case Empty | Dry => "Alert"
  case Pooling => "Warning!"
  case other => s"Level $level OK"
}



Level.Draining is Draining
Level.Draining.id is 5
checkLevel(Low) is "Level Low OK"
checkLevel(Empty) is "Alert"
checkLevel(Draining) is "Level Draining OK"
checkLevel(Pooling) is "Warning!"
checkLevel(Dry) is "Alert"