import org.scalatest.FunSpec
import org.scalatest.ShouldMatchers

class SortTest extends FunSpec with ShouldMatchers{
  describe("Sort Test") {
    it("should sort via insert sort") {
      InsertSort.sort(List(23,0, 4, 1)).should(be(List(0, 1, 4, 23)))
    }

    it("should sort via insert sort 2") {
      InsertSort.sort(List(3,8,1, 9, 15, 1)).should(be(List(1, 1, 3, 8 ,9, 15)))
    }




  }
}