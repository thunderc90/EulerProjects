/**
 * Solution for EulerProject.com's Problem 3
 * Created by buckl on 2/18/2016.
 */

import BigIntUtils.BigIntImprovements

object Project3 {
  def run(n: BigInt): Unit = {
    println("Project 3: " + calc(n))
  }

  def calc(n: BigInt): BigInt = {
    (BigInt(1) to n.sqrt).filter(isFactor(_,n)).filter(isPrime).last
  }

  def isFactor(factor: BigInt, number: BigInt): Boolean = {
    (number % factor) == BigInt(0)
  }

  def isPrime(number: BigInt): Boolean = {
    if (number <= BigInt(1))
      false
    else if (number ==  BigInt(2))
      true
    else
      !(BigInt(2) to (number-1)).exists(isFactor(_,number))
  }
}
