object Main extends App{
  import com.atomicscala.AtomicTest._


  println("// 1")
  class Coffee(val shots: Int = 2,
               val decaf: Int = 0,
               val milk: Boolean = false,
               val toGo: Boolean = false,
               val syrup: String = "") {
    var result = ""
    println(shots, decaf, milk, toGo, syrup)

    def getCup(): Unit = {
      if (toGo)
        result += "ToGoCup "
      else
        result += "HereCup "
    }

    def caf(): Int = {
      shots - decaf
    }

    def pourShots(): Unit = {
      for (s <- 0 until shots)
        if (decaf > 0)
          result += "decaf shot "
        else
          result += "shot "
    }

    def addMilk(): Unit = {
      if (milk)
        result += "milk "
    }

    def addSyrup(): Unit = {
      result += syrup
    }

    getCup()
    pourShots()
    addMilk()
    addSyrup()
  }




  val doubleHalfCaf = new Coffee(shots = 2, decaf = 1)
  val tripleHalfCaf = new Coffee(shots = 3, decaf = 2)

  doubleHalfCaf.decaf is 1
  doubleHalfCaf.caf is 1
  doubleHalfCaf.shots is 2
  tripleHalfCaf.decaf is 2
  tripleHalfCaf.caf is 1
  tripleHalfCaf.shots is 3

  println("// 2")
  class Tea(
             val decaf: Boolean = false,
             val name: String = "Earl Grey",
             val sugar: Boolean = false,
             val milk: Boolean = false
           ) {
    var describe = ""
    var calories = 0

    def addName(): Unit = {
      describe += name
    }

    def addMilk(): Unit = {
      if (milk) {
        describe += " + milk"
        calories += 100
      }
    }

    def addSugar(): Unit = {
      if (sugar) {
        describe += " + sugar"
        calories += 16
      }
    }

    def checkDecaf(): Unit = {
      if (decaf)
        describe += " decaf"
    }

    addName()
    addMilk()
    addSugar()
    checkDecaf()
  }

  val tea2 = new Tea
  tea2.describe is "Earl Grey"
  tea2.calories is 0

  val lemonZinger2 = new Tea(decaf = true, name = "Lemon Zinger")
  lemonZinger2.describe is "Lemon Zinger decaf"
  lemonZinger2.calories is 0

  val sweetGreen2 = new Tea(name = "Jasmine Green", sugar = true)
  sweetGreen2.describe is "Jasmine Green + sugar"
  sweetGreen2.calories is 16

  val teaLatte2 = new Tea(sugar = true, milk = true)
  teaLatte2.describe is "Earl Grey + milk + sugar"
  teaLatte2.calories is 116


  println("// 3")
  class Tea2(
              val decaf: Boolean = false,
              val name: String = "Earl Grey",
              val sugar: Boolean = false,
              val milk: Boolean = false
            ) {
    var describe = ""
    var calories = 0

    def addName(): Unit = {
      describe += name
    }

    def addMilk(): Unit = {
      if (milk) {
        describe += " + milk"
        calories += 100
      }
    }

    def addSugar(): Unit = {
      if (sugar) {
        describe += " + sugar"
        calories += 16
      }
    }

    def checkDecaf(): Unit = {
      if (decaf)
        describe += " decaf"
    }

    addName()
    addMilk()
    addSugar()
    checkDecaf()
  }

  val tea = new Tea2
  tea.describe is "Earl Grey"
  tea.calories is 0
  tea.name is "Earl Grey"

  val lemonZinger = new Tea2(decaf = true, name = "Lemon Zinger")
  lemonZinger.describe is "Lemon Zinger decaf"
  lemonZinger.calories is 0
  lemonZinger.decaf is true

  val sweetGreen = new Tea2(name = "Jasmine Green", sugar = true)
  sweetGreen.describe is "Jasmine Green + sugar"
  sweetGreen.calories is 16
  sweetGreen.sugar is true

  val teaLatte = new Tea2(sugar = true, milk = true)
  teaLatte.describe is "Earl Grey + milk + sugar"
  teaLatte.calories is 116
  teaLatte.milk is true
}
