object Sets extends App{
  import com.atomicscala.AtomicTest._

  val set = Set(1, 1, 2, 3, 9, 9, 4, 22, 11, 7, 6)
  set is Set(1, 6, 9, 2, 22, 7, 3, 11, 4)

  set(9) is true
  set(99) is false

  Set(1, 6, 9, 2).subsetOf(set) is true

  set.union(Set(2, 3, 4, 99)) is Set(1, 6, 9, 2, 22, 7, 3, 11, 99, 4)
  set | Set(2, 3, 4, 99) is Set(1, 6, 9, 2, 22, 7, 3, 11, 99, 4)

  set & Set(0, 1, 11, 22, 87) is Set(1, 22, 11)
  set intersect Set(0, 1, 11, 22, 87) is Set(1, 22, 11)

  set &~ Set(0, 1, 11, 22, 87) is Set(6, 9, 2, 7, 3, 4)
  set -- Set(0, 1, 11, 22, 87) is Set(6, 9, 2, 7, 3, 4)
}
