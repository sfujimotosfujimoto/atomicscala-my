/*  / sfujimoto: 2017/06/26 22:31 */
import com.atomicscala.AtomicTest._

trait Mobile {
  def moves = "Movement"
}

class Animal extends Mobile {
  override def moves = "Biological " + super.moves
}

class Vehicle extends Mobile {
  override def moves = "Mechanical " + super.moves
}

def movable(mobile:Mobile) = mobile.moves

movable(new Animal) is "Biological Movement"
movable(new Vehicle) is "Mechanical Movement"


println("//2")


import libs.Name

class Element extends Name {
  def interact(other:Element) = s"$this interact $other"
  def draw = "Drawing the element"
}

class Inert extends Element {
  override def draw = s"$this drawing!"
}
class Wall extends Inert {
  override def draw = "Don't draw on the wall!"
}

trait Material {
  def resilience:String
}
trait Wood extends Material {
  def resilience = "Breakable"
}
trait Rock extends Material {
  def resilience = "Hard"
}
class RockWall extends Wall with Rock
class WoodWall extends Wall with Wood

trait Skill
trait Fighting extends Skill {
  def fight = "Fight!"
}
trait Digging extends Skill {
  def dig = "Dig!"
}
trait Magic extends Skill {
  def castSpell = "Spell!"
}
trait Flight extends Skill {
  def fly = "Fly!"
}

//class Character(var player:String = "None") extends Element
class Fairy extends Character with Magic
class Viking extends Character with Fighting
class Dwarf extends Character with Digging with Fighting
class Wizard extends Character with Magic
//class Dragon extends Character with Magic with Flight


def battle(fighter:Fighting) = s"$fighter, ${fighter.fight}"
battle(new Viking) is "Viking, Fight!"
battle(new Dwarf) is "Dwarf, Fight!"
battle(new Fairy with Fighting) is "anon, Fight!"

def fly(flyer:Element with Flight, opponent:Element) =
  s"$flyer, ${flyer.fly}, ${opponent.interact(flyer)}"




//// Starter 2
val e = new Element
e.draw is "Drawing the element"
val in = new Inert
in.draw is "Inert drawing!"




//// 3

// check
val wall = new Wall
wall.draw is "Don't draw on the wall!"
//// 4


class Character(val player:String="None") extends Element
// Change the next line
class Dragon(val dragonPlayer:String) extends Character(dragonPlayer) with Magic with Flight
val d = new Dragon("Puff")
d.player is "Puff"
//// 5

class Seed
class Tomato extends Seed {
  override def toString = "Tomato"
}
class Corn extends Seed {
  override def toString = "Corn"
}
class Zucchini extends Seed {
  override def toString = "Zucchini"
}

class Garden(seeds:Seed*) {
  val plants = seeds.toVector
  override def toString = plants.mkString(", ")
}

val garden = new Garden(new Tomato, new Corn, new Zucchini)
garden is "Tomato, Corn, Zucchini"
//// 6

trait Shape {
  def draw():String
}
class Ellipse extends Shape {
  override def draw(): String = "Ellipse"
}
class Rectangle extends Shape {
  override def draw(): String = "Rectangle"
}

class Circle extends Ellipse {
  override def draw(): String = "Circle"
}
class Square extends Rectangle {
  override def draw(): String = "Square"
}

class Drawing(val shapes:Shape*) {
  val parts = shapes.toVector
  def draw = for { shape <- parts } yield shape.draw
  override def toString = draw.mkString(", ")
}

val drawing = new Drawing(
  new Rectangle, new Square,
  new Ellipse, new Circle)
drawing.draw is "Vector(Rectangle," +
  " Square, Ellipse, Circle)"
drawing is "Rectangle, Square," +
  " Ellipse, Circle"