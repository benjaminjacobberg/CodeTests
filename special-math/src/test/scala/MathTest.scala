import org.scalatest.FunSuite

class MathTest extends FunSuite {
  test("Math.specialMath") {
    val math = new Math()
    assert(math.specialMath(0) == 0)
    assert(math.specialMath(1) == 1)
    assert(math.specialMath(7) == 79)
    assert(math.specialMath(17) == 10926)

    // Ouch! The performance hit of this hurts. Adding a cache to the function to optimize the performance.
    assert(math.specialMath(90) == BigInt("19740274219868223074"))
  }
}
