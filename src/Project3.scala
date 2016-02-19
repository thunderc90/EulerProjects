/**
 * Solution for EulerProject.com's Problem 3
 * Created by buckl on 2/18/2016.
 */
object Project3 {
  def run(n: BigInt): Unit = {
    println("Project 3: " + calc(n))
  }

  implicit class BigIntImprovement(val number: BigInt) {
    def sqrt = {
      val one = BigInt(1)
      def next(n: BigInt, i: BigInt): BigInt = (n+i/n)>>1

      var n = one
      var n1 = next(n, number)

      while((n1-n).abs > one) {
        n=n1
        n1 = next(n,number)
      }
      while(n1*n1>number){
        n1 -= one
      }
      n1
    }
  }

  def calc(n: BigInt): BigInt = {
    (BigInt(1) to n.sqrt).filter(isFactor(_,n)).filter(isPrime(_)).last
  }

  def isFactor(i: BigInt, n: BigInt): Boolean = {
    n%i==0
  }

  def isPrime(i: BigInt): Boolean = {
    if (i <= 1)
      false
    else if (i == 2)
      true
    else
      !(BigInt(2) to (i-1)).exists(isFactor(_,i))
  }
}
