package easy.e1021

object Solution {
  def removeOuterParentheses(S: String): String = {
    var stack = ""
    var counter = 0
    var ans = ""
    S.foreach(s => {
      stack += s
      if (s == '(') {
        counter += 1
      } else {
        counter -= 1
      }
      if (counter == 0) {
        ans += stack.slice(1, stack.length - 1)
        stack = ""
      }
    })
    ans
  }
}
