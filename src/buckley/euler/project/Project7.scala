package buckley.euler.project

/**
 * Project 7
 * Created by buckl on 2/24/2016.
 */
import buckley.utils.BigIntUtils._

object Project7 extends Project {
  override def projectNum(): Int = 7
  override def calc(x: BigInt): BigInt = {

    val est = bruteForceIthPrime(x.toInt)

    est
  }

  private def bruteForceIthPrime(x: BigInt): BigInt = {
    var counter = one
    var prime = two

    while (counter < x) {
      prime += one
      if (prime.isPrime) counter += one
    }
    prime
  }
}
