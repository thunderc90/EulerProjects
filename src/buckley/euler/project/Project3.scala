package buckley.euler.project

/**
 * Solution for EulerProject.com's Problem 3
 * Created by buckl on 2/18/2016.
 */

import buckley.utils.BigIntUtils
import BigIntUtils._

object Project3 extends Project {
  override def projectNum(): Int = 3

  def calc(n: BigInt): BigInt = {
    (one to n.sqrt).filter(isFactor(_,n)).filter(isPrime).last
  }

  def isFactor(factor: BigInt, number: BigInt): Boolean = {
    (number % factor) == zero
  }

  def isPrime(number: BigInt): Boolean = {
    if (number <= one)
      false
    else if (number ==  two)
      true
    else
      !(two to (number-one)).exists(isFactor(_,number))
  }
}
