package buckley.euler.project

/**
 * Solution for EulerProject.com's Problem 3
 * Created by buckl on 2/18/2016.
 */

import buckley.utils.BigIntUtils._

object Project3 extends Project {
  override def projectNum(): Int = 3

  //Returns 0 when input isn't n isn't greater than 1... this is prevent UnsupportedOperationException from occuring
  def calc(n: BigInt): BigInt = n match {
    case n if n > zero && !n.isPrime => (one to n.sqrt).filter(_.isFactorOf(n)).filter(_.isPrime).last
    case n if n > zero && n.isPrime => 1
    case _ => zero
  }
}
