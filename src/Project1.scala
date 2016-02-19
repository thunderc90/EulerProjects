/**
 * Created by buckl on 2/17/2016.
 */
object Project1 {
  def run(x: Int): Unit = {
    println("Project 1: " + calc(x))
  }

  def calc(num: Int): Int = {
    val nums = (1 to num-1)
    nums.filter(i => (i % 3 == 0 || i % 5 == 0)).foldLeft(0)(_+_)
  }
}
