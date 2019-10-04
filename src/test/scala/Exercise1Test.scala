import exercises.Exercise1._
import org.scalatest.FunSuite

class Exercise1Test extends FunSuite {

  test("isEven") {
    assert(isEven(-2))
    assert(!isEven(-1))
    assert(isEven(0))
    assert(!isEven(1))
    assert(isEven(2))
  }

  test("calculateCircumference") {
    assert(calculateCircumference(1) == 6.283185307179586)
  }

}
