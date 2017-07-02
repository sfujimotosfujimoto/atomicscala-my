object SeqOperations extends App{
  /*  / sfujimoto: 2017/06/28 22:09 */
  import com.atomicscala.AtomicTest._

  testSeq(Vector(1, 7, 22, 11, 17))
  testSeq(List(1, 7, 22, 11, 17))


  def testSeq(s: Seq[Int]) = {
    s.isEmpty is false
    s.length is 5

    s :+ 99 is Seq(1, 7, 22, 11, 17, 99)
    47 +: s is Seq(47, 1, 7, 22, 11, 17)

    s.head is 1
    s.tail is Seq(7, 22, 11, 17)

    s.last is 17
    s.drop(3) is Seq(11, 17)
    s.dropRight(3) is Seq(1, 7)

    s.take(3) is Seq(1, 7, 22)
    s.takeRight(3) is Seq(22, 11, 17)
    s.slice(2, 5) is Seq(22, 11, 17)

    s(3) is 11
    s.contains(22) is true
    s.indexOf(22) is 2
    s.updated(3, 16) is Seq(1, 7, 22, 16, 17)
    s.patch(3, Nil, 1) is Seq(1, 7, 22, 17)


    val seq2 = s ++ Seq(99, 88)
    seq2 is Seq(1, 7, 22, 11, 17, 99, 88)

    s.distinct.sorted is Seq(1, 7, 11, 17, 22)
    s.reverse is Seq(17, 11, 22, 7, 1)

    s.intersect(seq2) is Seq(1, 7, 22, 11, 17)

    s.min is 1
    s.max is 22

    s.startsWith(Seq(1, 7)) is true
    s.endsWith(Seq(11, 17)) is true

    s.sum is 58

    s.product is 28798

    s.toSet is Set(1, 17, 22, 7, 11)


  }


}
