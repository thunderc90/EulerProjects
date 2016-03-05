import buckley.euler.project.Project1
import org.scalatest.{Matchers, FlatSpec}

/**
  * Project 1 Specification
  * Created by buckl on 3/4/2016.
  */
class Project1Spec extends FlatSpec with Matchers {

  "Project1.calc" should "return 23 given 10" in {
    Project1.calc(BigInt(10)) should be (BigInt(23))
  }

  it should "return 233168 given 1000" in {
    Project1.calc(BigInt(1000)) should be (BigInt(233168))
  }

  it should "return 0 given 0,1,2, or 3" in {
    Project1.calc(BigInt(0)) should be (BigInt(0))
    Project1.calc(BigInt(1)) should be (BigInt(0))
    Project1.calc(BigInt(2)) should be (BigInt(0))
    Project1.calc(BigInt(3)) should be (BigInt(0))
  }

  it should "return 3 given 4, or 5" in {
    Project1.calc(BigInt(4)) should be (BigInt(3))
    Project1.calc(BigInt(5)) should be (BigInt(3))
  }

  it should "return 8 given 6" in {
    Project1.calc(BigInt(6)) should be (BigInt(8))
  }

}
