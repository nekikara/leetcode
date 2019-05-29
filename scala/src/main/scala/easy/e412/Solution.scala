package easy.e412

object Solution {
  def fizzbuzz(n: Int): List[String] = {
    (1 to n).map(x => {
      if (x % 15 == 0) {
        "FizzBuzz"
      } else if (x % 5 == 0) {
        "Buzz"
      } else if (x % 3 == 0) {
        "Fizz"
      } else {
        x.toString
      }
    }).toList
  }
}
