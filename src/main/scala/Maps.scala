/*  / sfujimoto: 2017/07/01 6:57 */
import com.atomicscala.AtomicTest._
object Maps extends App {

  val constants = Map("Pi" -> 3.141, "e" -> 2.718, "phi" -> 1.618)

  Map(("Pi", 3.141), ("e", 2.718), ("phi", 1.618)) is constants

  Vector(("Pi", 3.141), ("e", 2.718), ("phi", 1.618)).toMap is constants

  constants("e") is 2.718

  constants.keys is "Set(Pi, e, phi)"

  constants.values is "MapLike.DefaultValuesIterable(3.141, 2.718, 1.618)"

  (for (pair <- constants) yield pair.toString) is "List((Pi,3.141), (e,2.718), (phi,1.618))"

  (for ((k, v) <- constants) yield k + ": " + v) is "List(Pi: 3.141, e: 2.718, phi: 1.618)"

}
