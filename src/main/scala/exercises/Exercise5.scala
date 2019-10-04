package exercises

import utils.{Animal, Parrot}
import exercises.Exercise2.countX

/* Collections */

object Exercise5 {

  /*
  You are given a list of prices. Return the sum of this list
  sumList(List(1.5,2.0,3.0)) → 6.5
   */
  def sumList(list: List[Double]): Double = ???
  /*
  Same as above but now we have a list of lists. Return the sum of all numbers
  Bonus: Think about what you would to if the lists were nested even further
  */
  def sumAllLists(lists: List[List[Double]]): Double = ???

  /*
  Given a List of Integers, return a new List with each element squared
  squaredValues(List(1,2,3)) → List(1,4,9)
   */
  def squaredValues(list: List[Int]): List[Int] = ???

  /*
  Given a List of Strings, return a new List with sum of the character "x" in each String
   */
  def xCounts(list: List[String]): List[Int] = ???

  /*
  You are given a List of Strings. Return the count of unique values in that list
  uniqueValues(List("a")) → 1
  uniqueValues(List("a", "a", "b")) → 2
   */
  // def uniqueValues(list: List[String]): Int = list.toSet.size
  def uniqueValues(list: List[String]): Int = ???

  /*
  You are given a list of Strings. Append "a" to each String.
  But if the string ends with an "a", append "b".
  Also filter out all strings that begin with "c"
  transformStrings(List("tt", "ba", "cc")) → List("tta", "bab")
   */
  def transformStrings(list: List[String]): List[String] = ???

  /*
  You are given a List of Objects - Dogs, Cats and Parrots. Each of them has a name and inherits from superclass Animal.
  Return the count of unique names in that List unless it's a Parrot. Don't count them at all.
  (see utils.Animal for implementation details of Animals)
  uniqueNames(List(new Dog("a"))) → 1
  uniqueNames(List(new Dog("a"), new Cat("a"))) → 1
  uniqueNames(List(new Dog("a"), new Cat("b"), new Parrot("c"))) → 2
 */

  def uniqueNames(list: List[Animal]): Int = {
    ???
  }

}
