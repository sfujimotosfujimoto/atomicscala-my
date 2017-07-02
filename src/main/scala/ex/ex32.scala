import com.atomicscala.AtomicTest._

case class Activity(date:String, activity:String) {
  }
def getActivities(date:String, as:Vector[Activity]):Vector[String] = {
  for {
    n <- as
    if n.date == date 
  } yield n.activity
  }




val activities = Vector(
  Activity("01-01", "Run"),
  Activity("01-03", "Ski"),
  Activity("01-04", "Run"),
  Activity("01-10", "Ski"),
  Activity("01-03", "Run"))

getActivities("01-01", activities) is Vector("Run")
getActivities("01-02", activities) is Vector()
getActivities("01-03", activities) is Vector("Ski", "Run")
getActivities("01-04", activities) is Vector("Run")
getActivities("01-10", activities) is Vector("Ski")
