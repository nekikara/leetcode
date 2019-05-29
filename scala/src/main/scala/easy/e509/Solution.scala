package easy.e509

object Solution {

  def fib(N: Int): Int = {
    if (N == 0 || N == 1) { N }
    else {
      fib(N - 1) + fib(N - 2)
    }
  }

}
