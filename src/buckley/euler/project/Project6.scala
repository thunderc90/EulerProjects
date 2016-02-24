package buckley.euler.project

/**
 * Project 6 from ProjectEuler.com
 * Created by buckl on 2/21/2016.
 */

import buckley.utils.BigIntUtils._

object Project6 extends Project {
  override def projectNum(): Int = 6

  override def calc(x: BigInt): BigInt = {
    val nums = one to x
    nums.sum.pow(2) - nums.map(_.pow(2)).sum
  }
}
