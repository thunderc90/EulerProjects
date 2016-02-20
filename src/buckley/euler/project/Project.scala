package buckley.euler.project

/**
 * trait defining Project template
 * Created by buckl on 2/20/2016.
 */
trait Project {
  def run(x: BigInt): Unit = {
    val startTime = System.currentTimeMillis()
    val solution = calc(x)
    val duration = System.currentTimeMillis()-startTime

    println("Project " + projectNum() + ": {" + duration + ", \t" + solution + "}")
  }

  def calc(x: BigInt): BigInt
  def projectNum(): Int
}
