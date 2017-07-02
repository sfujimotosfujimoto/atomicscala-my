/*  / sfujimoto: 2017/06/28 21:38 */
import com.atomicscala.AtomicTest._

/// 1
//
//object Shots extends Enumeration {
//  type Shots = Value
//  val Single, Double, Triple = Value
//}
//
//object Cup extends Enumeration {
//  type Cup = Value
//  val ToGo, Here = Value
//}
//
//object Caffeine extends Enumeration {
//  type Caffeine = Value
//  val Caf, HalfCaf, Decaf = Value
//}
//
//object Milk extends Enumeration {
//  type Milk = Value
//  val NoMilk, Skim, Lowfat = Value
//}
//
//trait Flavor
//
//object Syrup extends Enumeration {
//  case class _Val() extends Val with Flavor
//  type Syrup = _Val
//  val NoFlavor, Vanilla, Hazelnut, Raspberry, Choc = _Val()
//}
//
//trait Amount {
//  val pumps:Int
//}
//
//trait Taste[F <: Flavor] extends Amount {
//  val flavor:F
//}
//
//import Shots._
//import Caffeine._
//import Cup._
//import Milk._
//import Syrup._
//
//
//
//case class Coffee(shots:Shots,
//                  caffeine:Caffeine,
//                  cup:Cup
//
//                 )
//case class Latte(shots:Shots,caffeine:Caffeine, cup:Cup, milk:Milk)
//
//class Mocha(shots:Shots, caffeine:Caffeine, cup:Cup, milk:Milk, syrup:Syrup = Choc) extends Latte(shots, caffeine, cup, milk){
//  override def toString = s"Mocha($shots,$caffeine,$cup,$milk,$syrup)"
//}

//// 2

//val latte = new Latte(Single, Caf, Here, Skim)
//latte is "Latte(Single,Caf,Here,Skim)"
//val usual = new Coffee(Double, Caf, Here)
//usual is "Coffee(Double,Caf,Here)"


//// 3

//val mocha = new Mocha(Double,Caf,ToGo,Skim)
//mocha is "Mocha(Double,Caf,ToGo,Skim,Choc)"


///// 4
import sodafountain._
import IceCream._

object Container extends Enumeration {
  type Container = Value
  val Pint, Quart, HalfGallon = Value
}
import Container._

case class TakeHome(cont:Container, flavor:Flavor) {
  override def toString = s"TakeHome($cont,$flavor)"
}


TakeHome(Pint, Chocolate) is
  "TakeHome(Pint,Chocolate)"
TakeHome(Quart, Strawberry) is
  "TakeHome(Quart,Strawberry)"
TakeHome(HalfGallon, Vanilla) is
  "TakeHome(HalfGallon,Vanilla)"