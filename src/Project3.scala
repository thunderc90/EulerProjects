/**
 * Created by buckl on 2/18/2016.
 */
import scala.math.sqrt

object Project3 {

  def run(n: Int): Unit = {
    println("Project 3: " + calc(n))
  }

  def calc(n: Int): Int = {
    (1 to sqrt(n).toInt).filter(isFactor(_,n)).filter(isPrime(_)).last
  }

  def isFactor(i: Int, n: Int): Boolean = {
    n%i==0
  }

  def isPrime(i: Int): Boolean = {
    if (i <= 1)
      false
    else if (i == 2)
      true
    else
      !(2 to (i-1)).exists(x=>i%x==0)
  }
}
