/*  / sfujimoto: 2017/06/26 16:39 */
import com.atomicscala.AtomicTest._
import java.text.SimpleDateFormat

import org.apache.commons.math3.stat.Frequency

val datePattern = new SimpleDateFormat("MM/dd/yy")



val mayDay = datePattern.parse("05/01/12")
mayDay.getDate is 1
mayDay.getMonth is 4


val f = new Frequency
f.addValue("cat")
f.addValue("dog")
f.addValue("cat")
f.addValue("bird")
f.addValue("cat")
f.addValue("cat")
f.addValue("kitten")
f.addValue("mouse")
f.getCount("cat") is 4


// add values for cat, dog, cat, bird,
//   cat, cat, kitten, mouse here
f.getCount("cat") is 4
