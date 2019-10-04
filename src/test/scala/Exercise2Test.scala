import exercises.Exercise2._
import org.scalatest.FunSuite

class Exercise2Test extends FunSuite {

  test("stringTimes") {
    assert(stringTimes("test", 0) == "")
    assert(stringTimes("test", 1) == "test")
    assert(stringTimes("test", 2) == "testtest")
  }

  test("countX") {
    assert(countX("") == 0)
    assert(countX("abcXx") == 1)
    assert(countX("abcxx") == 2)
  }

  test("countXX") {
    assert(countXX("") == 0)
    assert(countXX("abcXx") == 0)
    assert(countXX("abcxx") == 1)
    assert(countXX("abcxxx") == 1)
    assert(countXX("axxbcxxxx") == 3)
  }

}
