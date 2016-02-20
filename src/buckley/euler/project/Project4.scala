package buckley.euler.project

/**
 * Project1 from EulerProjects.com
 * Created by buckl on 2/17/2016.
 */

object Project4 extends Project {
  override def projectNum(): Int = 1

  def calc(digits: BigInt): BigInt = {
    possibleSolutionsFrom(allNumbersUpTo(maxNumWithX(digits))).filter(isPalindromeNumber).max
  }

  def allNumbersUpTo(num: Int): List[Int] = {
    (1 to num).toList
  }

  def maxNumWithX(num: BigInt): Int ={
    (Math.pow(10,num.toInt)-1).toInt
  }

  def possibleSolutionsFrom(nums: List[Int]): List[Int] = {
    for{
      i<-nums
      y<-nums
    } yield {
      i*y
    }
  }

  def isPalindromeNumber(num: Int): Boolean = {
    num.toString.equals(num.toString.reverse)
  }
 }