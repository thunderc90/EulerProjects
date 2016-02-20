package buckley.euler.project

/**
 * Project 2 from EulerProjects.com
 * Created by buckl on 2/18/2016.
 */
object Project2 extends Project {
  override def projectNum(): Int = 2

  var cache = Map[BigInt, BigInt](
    BigInt(0)->BigInt(1),
    BigInt(1)->BigInt(1))

  def calc(max: BigInt): BigInt = {
    var fVal = BigInt(1)
    var n = BigInt(2)

    while (fVal < max) {
      fVal = fib(n)
      n = n + 1
    }

    //sum relevant values from cache
    cache.keySet.filter(_ > 0).flatMap(cache.get).filter(_ < max).filter(_ % 2 == 0).sum
  }

  def fib(n: BigInt): BigInt = {
    def fib_calc(n: BigInt): BigInt = fib_rec(n-1)+fib_rec(n-2)
    def fib_rec(n: BigInt): BigInt = cache.get(n) match {
      case Some(x) => x
      case _ =>
        cache += (n -> fib_calc(n))
        fib_rec(n)
    }
    fib_rec(n)
  }
}
