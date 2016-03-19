package buckley.utils

import org.scalatest.{Matchers, FlatSpec}
import buckley.utils.BigIntUtils._

/**
  * Created by buckl on 3/19/2016.
  */
class BigIntUtilsSpec extends FlatSpec with Matchers {

  "zero" should "Be equal to BigInt(0)" in {
    zero should be (BigInt(0))
  }

  "one" should "Be equal to BigInt(1)" in {
    one should be (BigInt(1))
  }

  "two" should "Be equal to BigInt(2)" in {
    two should be (BigInt(2))
  }

  "sqrt" should "return 0 given 0" in {
    BigInt(0).sqrt should be (BigInt(0))
  }

  it should "return 1 given 1" in {
    BigInt(1).sqrt should be (BigInt(1))
  }

  it should "return 60000, given 3600000000" in {
    BigInt(3600000000L).sqrt should be (BigInt(60000))
  }

  "ifFactorOF" should "return true, given BigInt(1).isFactorOf(any value except 0)" in {
    BigInt(1).isFactorOf(1) should be (true)
    BigInt(1).isFactorOf(1000000) should be (true)
    BigInt(1).isFactorOf(100000000000L) should be (true)
    BigInt(1).isFactorOf(-1) should be (true)
    BigInt(1).isFactorOf(-1000000) should be (true)
    BigInt(1).isFactorOf(-100000000000L) should be (true)
    BigInt(1).isFactorOf(0) should be (true)
  }

  it should "return true, given 6857.isFactorOf(600851475143)" in {
    BigInt(6857).isFactorOf(BigInt(600851475143L)) should be (true)
  }
}
