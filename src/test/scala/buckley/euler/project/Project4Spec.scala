package buckley.euler.project

import org.scalatest.{Matchers, FlatSpec}

import buckley.utils.BigIntUtils._

/**
  * Created by buckl on 3/26/2016.
  */
class Project4Spec extends FlatSpec with Matchers{

  //TODO
//  "Project4.calc" should "return None, given 0" in {
//    Project4.calc(zero) should be (BigInt(0))
//  }

  it should "return 9009, given 2" in {
    Project4.calc(two) should be (BigInt(9009))
  }

  it should "return 906609, given 3" in {
    Project4.calc(three) should be (BigInt(906609))
  }
}
