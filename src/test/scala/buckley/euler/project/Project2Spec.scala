package buckley.euler.project

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by buckl on 3/4/2016.
  */
class Project2Spec extends FlatSpec with Matchers{

  "Project2.calc" should "return 4613732, given 4 million" in {
    Project2.calc(BigInt(4000000)) should be (BigInt(4613732))
  }

  it should "return 0, given 0, 1, or 2" in {
    Project2.calc(BigInt(0)) should be (BigInt(0))
    Project2.calc(BigInt(1)) should be (BigInt(0))
    Project2.calc(BigInt(2)) should be (BigInt(0))
  }

  it should "return 2, given 3-8" in {
    Project2.calc(BigInt(3)) should be (BigInt(2))
    Project2.calc(BigInt(4)) should be (BigInt(2))
    Project2.calc(BigInt(5)) should be (BigInt(2))
    Project2.calc(BigInt(6)) should be (BigInt(2))
    Project2.calc(BigInt(7)) should be (BigInt(2))
    Project2.calc(BigInt(8)) should be (BigInt(2))
  }
}
