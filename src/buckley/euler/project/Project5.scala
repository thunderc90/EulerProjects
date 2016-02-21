package buckley.euler.project

/**
 * Project 5
 * Created by buckl on 2/20/2016.
 */
import buckley.utils.BigIntUtils._

import scala.collection.mutable.MutableList

object Project5 extends Project {
  override def projectNum(): Int = 5

  override def calc(max: BigInt): BigInt = {
    //build scrubbed dividers list, remove sub-dividers...
    // for example 4%2 == 0, so 2 is irrelevant
    // 6 % 3 == 0 so 3 is irrelevant...
    val scrubbedDividers: List[BigInt] = getRelevantDividers((one to max).toList)

    var multiple = one
    val value = scrubbedDividers.max

    while (!isEvenlyDivisible(multiple * value, scrubbedDividers))
      multiple += one

    multiple*value
  }

  def isEvenlyDivisible(value: BigInt, scrubbedDividers: List[BigInt]): Boolean = !scrubbedDividers.map(value%_ == zero).contains(false)

  def getRelevantDividers(dividers: List[BigInt]): List[BigInt] = {
    val toBeRemoved: MutableList[BigInt] = MutableList()
    for {
      i: BigInt <- dividers
      j: BigInt <- dividers
    } yield {
      if ((i != j) && (i % j == zero))
        toBeRemoved += j
    }
    dividers.diff(toBeRemoved)
  }
}
