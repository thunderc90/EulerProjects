package buckley.utils

/**
 * Class for additions to the BigInt class
 * Created by buckl on 2/19/2016.
 */
object BigIntUtils {
  lazy val zero = BigInt(0)
  lazy val one = BigInt(1)
  lazy val two = BigInt(2)
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
  }
}
