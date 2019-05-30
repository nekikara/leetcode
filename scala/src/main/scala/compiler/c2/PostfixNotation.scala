package compiler.c2

object PostfixNotation {
  def compile(source: String): String = {
    val compiled = collection.mutable.MutableList.empty[Char]
    val stack = collection.mutable.Stack[Char]('(')
    traverse(source, 0, source.length, compiled, stack)
    compiled.mkString("")
  }

  def traverse(source: String,
               index: Int,
               max: Int,
               compiled: collection.mutable.MutableList[Char],
               stack: collection.mutable.Stack[Char]): Unit = {
    if (index < max) {
      val c = source(index)
      if (c.isLetter) {
        compiled += c
      } else {
        processOperator(c, compiled, stack)
      }
      traverse(source, index + 1, max, compiled, stack)
    } else if (index == max) {
      processOperator(')', compiled, stack)
    }
  }

  def processOperator(c: Char,
                      compiled: collection.mutable.MutableList[Char],
                      stack: collection.mutable.Stack[Char]): Unit = {
    if (stack.isEmpty) {
      stack.push(c)
    } else {
      if (c == '(') {
        stack.push(c)
      } else if (c == ')') {
        var pop = stack.pop
        while (pop != '(' && stack.nonEmpty) {
          compiled += pop
          pop = stack.pop
        }
      } else {
        val pop = stack.pop
        compareOperators(c, pop) match {
          case 1 =>
            stack.push(pop)
            stack.push(c)
          case -1 =>
            compiled += pop
            processOperator(c, compiled, stack)
        }
      }
    }
  }

  def compareOperators(left: Char, right: Char): Int = {
    val leftVal = valueOfOperators(left)
    val rightVal = valueOfOperators(right)

    if (leftVal <= rightVal) {
      -1
    } else {
      1
    }
  }

  def valueOfOperators(ope: Char): Int = {
    ope match {
      case '*' | '/' => 10
      case '+' | '-' => 5
      case _         => 1
    }
  }
}
