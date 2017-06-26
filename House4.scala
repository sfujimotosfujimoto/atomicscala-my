/*  / sfujimoto: 2017/06/27 6:52 */
trait Building
trait Food
trait Utensil
trait Store[T]
trait Cook[T]
trait Clean[T]
trait Kitchen extends Store[Food] with Cook[Food] with Clean[Utensil]

trait House extends Building {
  val kitchens:Vector[Kitchen]
}



