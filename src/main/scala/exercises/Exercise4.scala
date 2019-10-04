package exercises

import scala.collection.mutable.ListBuffer

object Exercise4 {

  /*
  Write a function that accepts a String and an encryption function.
  It should transform the String to upper case and apply the encryption function to the new String
  encryptString("test", (x => x)) → "TEST"
  */
  def encryptString(string: String, encrypt: String => String): String = ???

  /*
  Create a List of all numbers ranging from 1 to 100
  For multiples of 3, insert "Fizz" instead of the number
  For multiples of 5, insert "Buzz" instead of the number
  For multiples of 3 and 5, insert "FizzBuzz" instead of the number
   */
  def fizzBuzz(): List[Any] = {
    ???
  }

}
