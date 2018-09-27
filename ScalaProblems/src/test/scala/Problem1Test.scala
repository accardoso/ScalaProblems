import org.scalatest.FunSuite

class Problem1Test extends FunSuite{
  test("Problem1.removeDuplicates"){
    assert(Problem1.removeDuplicates("xjjyyzzzx") === "xjyz")
  }
}
