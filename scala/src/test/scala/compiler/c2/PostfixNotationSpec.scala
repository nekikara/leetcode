package compiler.c2

import org.scalatest._

class PostfixNotationSpec extends FlatSpec with Matchers {
  "The PostfixNotation" should "have convertBST 1" in {
    val a = "a+(b*c)"
    val o = "abc*+"
    PostfixNotation.compile(a) should be(o)
  }
  "The PostfixNotation" should "have convertBST 2" in {
    val a = "(a+b)*(c+d)"
    val o = "ab+cd+*"
    PostfixNotation.compile(a) should be(o)
  }
  "The PostfixNotation" should "have convertBST 3" in {
    val a = "(a+(b*c)+d)"
    val o = "abc*+d+"
    PostfixNotation.compile(a) should be(o)
  }
  "The PostfixNotation" should "have convertBST 4" in {
    val a = "(a+(b*c*(d+e))+d)"
    val o = "abc*de+*+d+"
    PostfixNotation.compile(a) should be(o)
  }
  "The PostfixNotation" should "have convertBST 5" in {
    val a = "(a+b)*c+d"
    val o = "ab+c*d+"
    PostfixNotation.compile(a) should be(o)
  }
  "The PostfixNotation" should "have convertBST 6" in {
    val a = "a+b*c*(d+e)"
    val o = "abc*de+*+"
    PostfixNotation.compile(a) should be(o)
  }
  "The PostfixNotation" should "have convertBST 7" in {
    val a = "a*b*c+d+e"
    val o = "ab*c*d+e+"
    PostfixNotation.compile(a) should be(o)
  }

  "The PostfixNotation" should "have processOperator 1" in {
    val compiled = collection.mutable.MutableList[Char]('a')
    val stack = collection.mutable.Stack[Char]('+')
    PostfixNotation.processOperator('(', compiled, stack)
    compiled should be(collection.mutable.MutableList[Char]('a'))
    stack should be(collection.mutable.Stack[Char]('(', '+'))
  }
}
