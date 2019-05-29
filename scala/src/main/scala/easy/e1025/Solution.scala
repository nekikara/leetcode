package easy.e1025

object Solution {
  def divisorGame(N: Int): Boolean = {
    withTurn(N, 0) % 2 == 1
  }

  def withTurn(N: Int, turn: Int): Int = {
    println("N", N, "turn", turn)
    if (N == 1) {
      turn
    } else {
      var max = N / 2
      val x = (1 to max).filter(xC => N % xC == 0).min
      withTurn(N - x, turn + 1)
    }
  }
}
