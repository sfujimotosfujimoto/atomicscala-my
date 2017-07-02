object AnUnchangingVar extends App{
  import com.atomicscala.AtomicTest._


  y.n is 11
  y = new Y(22)
  class Y(val n: Int)
  var y = new Y(11)


}
