object InsertSort {

  def sort(list: List[Int]): List[Int] = {
    return convertUnsortedListIntoSorted(list.tail, List(list.head))
  }

  private def convertUnsortedListIntoSorted(unsortedList: List[Int], sortedList: List[Int]): List[Int] = {
    return unsortedList match {
      case x :: Nil => return placeNumberInListAtRightOrder(x, sortedList)
      case x :: xs  => return convertUnsortedListIntoSorted(xs, placeNumberInListAtRightOrder(x, sortedList))
    }
  }

  private def placeNumberInListAtRightOrder(number: Int, list: List[Int]): List[Int] = {
    return list match {
      case x :: Nil => if (number > x) return List(x,number)
                       else            return List(number, x)
      case x :: xs  => if (number > x) return x :: placeNumberInListAtRightOrder(number, xs)
                       else            return number :: x :: xs
    }
  }
}
