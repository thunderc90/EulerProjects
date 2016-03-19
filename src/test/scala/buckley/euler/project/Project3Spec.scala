package buckley.euler.project

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by buckl on 3/4/2016.
  */
class Project3Spec extends FlatSpec with Matchers{

  "Project3.calc" should "return 29, given 13195" in {
    Project3.calc(BigInt(13195)) should be (BigInt(29))
  }

  it should "return 6857, given 600851475143 " in {
    Project3.calc(BigInt(600851475143L)) should be (BigInt(6857))
  }

  it should "return 1, for a prime number greater than 0, and will NOT throw an UnsupportedOperationException" in {
    Project3.calc(BigInt(13)) should be (BigInt(1))
    Project3.calc(BigInt(5)) should be (BigInt(1))
    Project3.calc(BigInt(0)) should be (BigInt(0))
    Project3.calc(BigInt(-1)) should be (BigInt(0))
  }
}
