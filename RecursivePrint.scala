/*  / sfujimoto: 2017/06/29 6:53 */
def rPrint(s:Seq[Char]):Unit = {
  print(s.head)
  if(s.tail.nonEmpty)
    rPrint(s.tail)
}




