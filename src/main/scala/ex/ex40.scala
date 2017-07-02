import com.atomicscala.AtomicTest._

val tuple1 = (65, "Sunny", "Stars")
val (temp1, sky1, view1)= tuple1
temp1 is 65
sky1 is "Sunny"
view1 is "Stars"

val tuple2 = (78, "Cloudy", "Satellites")
val (temp2, ski2, view2) = tuple2
temp2 is 78
ski2 is "Cloudy"
view2 is "Satellites"

val tuple3 = (51, "Blue", "Night")
val (temp3, ski3, view3) = tuple3
temp3 is 51
ski3 is "Blue"
view3 is "Night"

val info = (50, 45)
info._1 is 50
info._2 is 45


def weather(temperature:Int, humidity:Int) = {
  if(humidity > 40) {
    if(temperature > 80)
      ("Hot", "Humid")
    else if(temperature < 50)
      ("Cold", "Damp")
    else
      ("Temperate", "Humid")
    } else {
      if(temperature > 80)
        ("Hot", "Pleasant")
      else if(temperature < 50)
        ("Cold", "Pleasant")
      else
        ("Temperate", "Pleasant")
    }
}

weather(81, 45) is ("Hot", "Humid")
weather(50, 45) is ("Temperate", "Humid")
weather(27, 55) is ("Cold", "Damp")
weather(27, 30) is ("Cold", "Pleasant")





val (heat1, moisture1) = weather(81, 45)
heat1 is "Hot"
moisture1 is "Humid"
val (heat2, moisture2) = weather(27, 55)
heat2 is "Cold"
moisture2 is "Damp"
