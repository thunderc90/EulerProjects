package buckley.euler.project

/**
 * Project1 from EulerProjects.com
 * Created by buckl on 2/17/2016.
 */

import buckley.utils.BigIntUtils._

object Project1 extends Project {
  override def projectNum(): Int = 1

  def calc(num: BigInt): BigInt = {
    val nums = BigInt(1) to num - 1
    nums.filter(p = i => {
      i % 3 == zero || i % 5 == zero
    }).sum
  }
}