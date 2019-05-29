package easy.e13

object Solution {
  def romanToInt(s: String): Int = {
    sum(s, 0)
  }

  def sum(s: String, index: Int): Int = {
    if (s.length <= index) {
      0
    } else {
      val first = s(index)
      if (first == 'I' || first == 'X' || first == 'C') {
        if (index + 1 < s.length) {
          val second = s(index + 1)
          val token: String = s"$first$second"
          val tokenInt = strToInt(token)
          if (tokenInt < 0) {
            strToInt(first.toString) + sum(s, index + 1)
          } else {
            tokenInt + sum(s, index + 2)
          }
        } else {
          strToInt(first.toString) + sum(s, index + 1)
        }
      } else {
        strToInt(first.toString) + sum(s, index + 1)
      }
    }
  }

  def strToInt(s: String): Int = {
    s match {
      case "I"  => 1
      case "IV" => 4
      case "V"  => 5
      case "IX" => 9
      case "X"  => 10
      case "XL" => 40
      case "L"  => 50
      case "XC" => 90
      case "C"  => 100
      case "CD" => 400
      case "D"  => 500
      case "CM" => 900
      case "M"  => 1000
      case _    => -1
    }
  }
}
