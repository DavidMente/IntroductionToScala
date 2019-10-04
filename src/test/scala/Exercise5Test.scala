import exercises.Exercise5._
import org.scalatest.FunSuite
import utils.{Cat, Dog, Parrot}

class Exercise5Test extends FunSuite {

  test("sumList") {
    assert(sumList(List(1.0, 2.0, 3.0)) == 6)
  }

  test("sumAllLists") {
    assert(sumAllLists(List(List(1.0, 2.0), List(3.0))) == 6)
  }

  test("squaredValues") {
    assert(squaredValues(List(1, 2, 3)) == List(1, 4, 9))
  }

  test("uniqueValues") {
    assert(uniqueValues(List()) == 0)
    assert(uniqueValues(List("a", "b")) == 2)
    assert(uniqueValues(List("a", "a")) == 1)
  }

  test("transformStrings") {
    assert(transformStrings(List("tt", "ba", "cc")) == List("tta", "bab"))
  }

  test("uniqueNames") {
    assert(uniqueNames(List(new Dog("a"))) == 1)
    assert(uniqueNames(List(new Dog("a"), new Cat("a"))) == 1)
    assert(uniqueNames(List(new Dog("a"), new Cat("b"), new Parrot("c"))) == 2)
  }

}
