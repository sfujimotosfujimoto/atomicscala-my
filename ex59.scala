/*  / sfujimoto: 2017/06/29 7:02 */
import com.atomicscala.AtomicTest._

def max(toMax:List[Int], a:Int=0):Int = {
  println("a: " + a + " / toMax: " + toMax)
  if(toMax.isEmpty) {
    a
  } else {
    if (a > toMax.head)
      max(toMax.tail, a)
    else
      max(toMax.tail, toMax.head)
  }
}



val aList = List(10, 20, 45, 100, 12, 230, 444, 15, 30)
max(aList) is 444


//// 3

def sumIt(nums:List[Int]):Int =
  nums.reduce((total, n) => total + n)

sumIt(List(1, 2, 3)) is 6
sumIt(List(45, 45, 45, 60)) is 195


//// 4


val animalList = List("cat", "dog", "cat", "cat", "cat")

def calcFreq(xs:List[String], target:String, total:Int = 0): Int = {
  if(xs.isEmpty)
    total
  else
    if(xs.head == target)
      calcFreq(xs.tail, target, total + 1)
    else
      calcFreq(xs.tail, target, total)

}

calcFreq(animalList, "cat") is 4
calcFreq(animalList, "dog") is 1
