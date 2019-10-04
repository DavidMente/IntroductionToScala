package exercises

import scala.util.matching.Regex

/* Numbers */

object Exercise1 {

  /*
  Write a function that checks whether a given integer is even
  isEven(2) → true
  isEven(1) → false
  */
  // def isEven(int: Int): Boolean = int % 2 == 0

  /* Alt solution: Make implementation clear through additional function */
  def isEven(int: Int): Boolean = isDivisible(int, 2)

  def isDivisible(dividend: Int, divisor: Int): Boolean = dividend % divisor == 0

  /*
  Write a function that calculates a circle's circumference for a given radius (2 * PI * radius)
  Hint: Use Math library
  calculateCircumference(1) → 6.28
   */
  def calculateCircumference(radius: Double): Double = 2 * Math.PI * radius

}
