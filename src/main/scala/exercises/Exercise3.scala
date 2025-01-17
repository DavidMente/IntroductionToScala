package exercises

/* Flow Control */

object Exercise3 {

  /*
  When squirrels get together for a party, they like to have cigars.
  A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
  Unless it is the weekend, in which case there is no upper bound on the number of cigars.
  Return true if the party with the given values is successful, or false otherwise.
  cigarParty(30, false) → false
  cigarParty(50, false) → true
  cigarParty(70, true) → true
  */
  def cigarParty(cigars: Int, isWeekend: Boolean): Boolean = ???

  /*
  Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden,
  so in that case just return 20.
  sortaSum(3, 4) → 7
  sortaSum(9, 4) → 20
  sortaSum(10, 11) → 21
   */
  def sortaSum(a: Int, b: Int): Int = ???

  /*
  Given a string str, if the string starts with "f" return "Fizz".
  If the string ends with "b" return "Buzz".
  If both the "f" and "b" conditions are true, return "FizzBuzz".
  In all other cases, return the string unchanged.
  fizzString("fig") → "Fizz"
  fizzString("dib") → "Buzz"
  fizzString("fib") → "FizzBuzz"
   */
  def fizzString(string: String): String = {
    ???
  }

}
