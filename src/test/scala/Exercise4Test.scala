import exercises.Exercise4._
import org.scalatest.FunSuite

class Exercise4Test extends FunSuite {

  test("encryptString") {
    assert(encryptString("test", x => x) == "TEST")
    assert(encryptString("test", x => x.replace("E", "A") + "E") == "TASTE")
  }

  test("fizzBuzz") {
    val list = fizzBuzz()
    assert(list(0) == 1)
    assert(list(2) == "Fizz")
    assert(list(4) == "Buzz")
    assert(list(14) == "FizzBuzz")
    assert(list.size == 100)
  }

}
