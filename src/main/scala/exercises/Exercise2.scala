package exercises

import scala.util.matching.Regex

/* Strings */

object Exercise2 {

  /*
  Given a string and a non-negative int n, return a larger string that is n copies of the original string.
  stringTimes("Hi", 2) → "HiHi"
  stringTimes("Hi", 3) → "HiHiHi"
  stringTimes("Hi", 1) → "Hi"
  */
  def stringTimes(string: String, int: Int): String = string * int

  /*
  Count the number of "x" in the given string (case sensitive!).
  countXX("abcxx") → 2
  countXX("xxx") → 3
  countXX("xxxx") → 4
  */
  def countX(string: String): Int = new Regex("x").findAllIn(string).length
  /*
  Count the number of "xx" in the given string (case sensitive!).
  We'll say that overlapping is not allowed, so "xxx" contains 1 "xx".
  countXX("abcxx") → 1
  countXX("xxx") → 1
  countXX("xxxx") → 2
  Bonus: How would you implement this function if overlapping was allowed?
  */
  def countXX(string: String): Int = new Regex("xx").findAllIn(string).length

}
