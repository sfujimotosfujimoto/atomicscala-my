import com.atomicscala.AtomicTest._

val fruits = Set("apple", "orange", "banana", "kiwi")
val vegetables = Set("beans", "peas",
  "carrots", "sweet potatoes",
  "asparagus", "spinach")
val meats = Set("beef", "chicken")
val groceryCart = Set("apple",
  "pretzels", "bread", "orange", "beef",
  "beans", "asparagus", "sweet potatoes",
  "spinach", "carrots")


def percentMeat(contents:Set[String]) =
  100.0 * (contents intersect meats).size / contents.size

def percentFruit(contents:Set[String]) =
  100.0 * (contents intersect fruits).size / contents.size

def percentVeggies(contents:Set[String]) =
  100.0 * (contents intersect vegetables).size / contents.size

def percentOther(contents:Set[String]) =
  100.0 * (contents -- (fruits | vegetables | meats)).size / contents.size


percentMeat(groceryCart) is 10.0
percentFruit(groceryCart) is 20.0
percentVeggies(groceryCart) is 50.0
percentOther(groceryCart) is 20.0




val vegetarian = Set("kidney beans", "black beans", "tofu")
val groceryCart2 = Set("apple", "pretzels",
  "bread", "orange", "beef",
  "beans", "asparagus", "sweet potatoes",
  "kidney beans", "black beans")



def percentVegetarian(strings: Set[String]) =
  100.0 * (strings intersect vegetarian).size / strings.size

def percentProtein(strings: Set[String]) =
  100.0 * ((strings intersect meats).size + (strings intersect vegetarian).size) / strings.size

percentMeat(groceryCart2) is 10.0
percentVegetarian(groceryCart2) is 20.0
percentProtein(groceryCart2) is 30.0



val box1 = Set("shoes", "clothes")
val box2 = Set("toys", "dishes")
val box3 = Set("toys", "games", "books")
val attic = Set(box1, box2)
val basement = Set(box3)
val house = Set(attic, basement)
Set("shoes", "clothes", "toys", "dishes") is attic.flatten
Set("toys", "games", "books") is basement.flatten
Set("shoes", "clothes", "toys",
  "dishes", "games", "books") is Set(box1, box2, box3).flatten
/* fill this in -- call flatten */
