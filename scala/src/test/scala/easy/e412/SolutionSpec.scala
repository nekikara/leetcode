package easy.e412

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have fizzbuzz" in {
    val o1 = List(
      "1",
      "2",
      "Fizz",
      "4",
      "Buzz",
      "Fizz",
      "7",
      "8",
      "Fizz",
      "Buzz",
      "11",
      "Fizz",
      "13",
      "14",
      "FizzBuzz"
    )
    Solution.fizzbuzz(15) should equal (o1)
  }
}




