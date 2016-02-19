/**
 * Project1 from EulerProjects.com
 * Created by buckl on 2/17/2016.
 */

import BigIntUtils._

object Project1 {
  def run(x: BigInt): Unit = {
    println("Project 1: " + calc(x))
  }

  def calc(num: BigInt): BigInt = {
    val nums = BigInt(1) to num-1
    nums.filter(p = i => {
      i % 3 == zero || i % 5 == zero
    }).sum
  }
}
