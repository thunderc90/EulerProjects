package buckley.utils

/**
 * Class for additions to the BigInt class
 * Created by buckl on 2/19/2016.
 */
object BigIntUtils {
  lazy val zero = BigInt(0)
  lazy val one = BigInt(1)
  lazy val two = BigInt(2)
  lazy val three = BigInt(3)

  var primeCheckCache = List[BigInt]()

  implicit class BigIntImprovements(val number: BigInt) {
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

    def isFactorOf(factoree: BigInt): Boolean = {
      (factoree % number) == zero
    }

    def isPrime = {
      if (number <= one)
        false
      else if (number ==  two)
        true
      else
        !(two to (number.sqrt)).exists(_.isFactorOf(number))
    }
  }
}
