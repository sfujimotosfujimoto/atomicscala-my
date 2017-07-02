import com.atomicscala.AtomicTest._
/* sfujimoto: 2017/06/26 13:32 */
object GreatApe3 extends App {

  class GreatApe {
    def call = "Hoo!"

    var energy = 3

    def eat() = {
      energy += 10; energy
    }

    def climb(x: Int) = energy -= x
  }

  class Bonobo extends GreatApe {
    override def call = "Eep!"

    energy = 5

    override def eat() = super.eat() * 2

    def run() = "Bonobo runs"
  }

  class Chimpanzee extends GreatApe {
    override def call = "Yawp!"

    override def eat() = super.eat() * 3

    def jump = "Chimp jumps"

    val kind = "Common"
  }

  def talk(ape: GreatApe) = {
    ape.climb(4)
    ape.call + ape.eat()
  }

  talk(new GreatApe) is "Hoo!9"
  talk(new Bonobo) is "Eep!22"
  talk(new Chimpanzee) is "Yawp!27"
}
