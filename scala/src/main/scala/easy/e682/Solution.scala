package easy.e682

object Solution {
  def calPoints(ops: Array[String]): Int = {
    val opeStack = collection.mutable.Stack[Int]()
    ops.foreach {
      case "C" => {
        opeStack.pop
      }
      case "+" => {
        val head = opeStack.head
        val second = opeStack(1)
        opeStack.push(head + second)
      }
      case "D" => {
        val head = opeStack.head
        opeStack.push(head * 2)
      }
      case n => opeStack.push(n.toInt)
    }

    opeStack.sum
  }
}
