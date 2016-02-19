/**
 * Created by buckl on 2/18/2016.
 */
object Project2 {

  var cache = Map[Int, Int](0->1,1->1)

  def run(n: Int): Unit = {
    println("Project 2: " + calc(n))
  }

  def calc(max: Int): Int = {
    var fVal = 1
    var n = 2

    while (fVal < max) {
      fVal = fib(n)
      n = n + 1
    }

    //sum relevant values from cache
    cache.keySet.filter(_ > 0).flatMap(cache.get(_)).filter(_ < max).filter(_ % 2 == 0).sum
  }

  def fib(n: Int): Int = {
    def fib_calc(n: Int): Int = fib_rec(n-1)+fib_rec(n-2)
    def fib_rec(n: Int): Int = cache.get(n) match {
      case Some(x) => x
      case _ => {
        cache += (n -> fib_calc(n))
        fib_rec(n)
      }
    }
    fib_rec(n)
  }
}
