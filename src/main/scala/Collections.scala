package coll

object IntercalateLists {

  def select(e: Int, i: Int, l: List[Int]) : Int = {
    if(i % 2 == 0 && l.size > i) {
      return l(i)
    } else {
      return e
    }
  }

  def apply(l1: List[Int], l2: List[Int]): (List[Int], List[Int]) = {
    val l3 = l1.zipWithIndex.map {case (e, i) => select(e, i, l2)}
    val l4 = l2.zipWithIndex.map {case (e, i) => select(e, i, l1)}
    (l3, l4)
  }
}
