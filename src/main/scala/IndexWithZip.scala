/*  / sfujimoto: 2017/06/29 17:52 */
import com.atomicscala.AtomicTest._
object IndexWithZip extends App{

  def number(s: String) =
    Range(0, s.length).zip(s)


  number("Howdy") is Vector((0, 'H'), (1, 'o'), (2, 'w'), (3, 'd'), (4, 'y'))
}
