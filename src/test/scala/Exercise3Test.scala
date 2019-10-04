import exercises.Exercise3._
import org.scalatest.FunSuite

class Exercise3Test extends FunSuite {

  test("cigarParty") {
    assert(!cigarParty(39, isWeekend = false))
    assert(cigarParty(40, isWeekend = false))
    assert(cigarParty(60, isWeekend = false))
    assert(!cigarParty(61, isWeekend = false))
    assert(cigarParty(61, isWeekend = true))
  }

  test("sortaSum") {
    assert(sortaSum(0, 0) == 0)
    assert(sortaSum(5, 4) == 9)
    assert(sortaSum(5, 5) == 20)
    assert(sortaSum(10, 9) == 20)
    assert(sortaSum(11, 10) == 21)
  }

  test("fizzString") {
    assert(fizzString("fff") == "Fizz")
    assert(fizzString("ab") == "Buzz")
    assert(fizzString("ffb") == "FizzBuzz")
    assert(fizzString("xfbx") == "xfbx")
  }

}
