package buckley.euler.project

/**
 * Solution for EulerProject.com's Problem 3
 * Created by buckl on 2/18/2016.
 */

import buckley.utils.BigIntUtils._

object Project3 extends Project {
  override def projectNum(): Int = 3

  def calc(n: BigInt): BigInt = (one to n.sqrt).filter(_.isFactorOf(n)).filter(_.isPrime).last
}
