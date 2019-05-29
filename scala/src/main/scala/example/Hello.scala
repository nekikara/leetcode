package example

object Solution {
  def numJewelsInStones(J: String, S: String): Int = {
    var matchedCount = 0
    S.foreach(s => {
      if (J.contains(s)) matchedCount += 1
    })
    matchedCount
  }

  def toLowerCase(str: String): String = {
    str.toLowerCase
  }

  def numUniqueEmails(emails: Array[String]): Int = {
    val y = emails.map(x => {
      val splitted = x.split('@')
      val local: String = splitted(0)
      val domain: String = splitted(1)
      val withoutDot = local.replaceAll("\\.", "")
      val withoutPlus = withoutDot.replaceAll("\\+.*$", "")
      s"$withoutPlus@$domain"
    }).toSet
    y.size
  }

  def uniqueMorseRepresentations(words: Array[String]): Int = {
    val table = Map('a' -> ".-",
      'b' -> "-...",
      'c' -> "-.-.",
      'd' -> "-..",
      'e' -> ".",
      'f' -> "..-.",
      'g' -> "--.",
      'h' -> "....",
      'i' -> "..",
      'j' -> ".---",
      'k' -> "-.-",
      'l' -> ".-..",
      'm' -> "--",
      'n' -> "-.",
      'o' -> "---",
      'p' -> ".--.",
      'q' -> "--.-",
      'r' -> ".-.",
      's' -> "...",
      't' -> "-",
      'u' -> "..-",
      'v' -> "...-",
      'w' -> ".--",
      'x' -> "-..-",
      'y' -> "-.--",
      'z' -> "--.."
    )

    words.map(w => {
      w.map(c => {
        table(c)
      }).mkString("")
    }).toSet.size
  }

  def repeatedNTimes(A: Array[Int]): Int = {
    val len = A.length
    val n = len / 2
    var stats = scala.collection.mutable.Map[Int, Int]()
    A.foreach(elm => {
      val x = stats.get(elm)
      if (x.isEmpty) {
        stats += (elm -> 1)
      } else {
        stats.update(elm, x.get + 1)
      }
    })
    val kv = stats.find(p => {
      p._2 == n
    })
    val answer = kv match {
      case Some(r) => {
        r._1
      }
      case None => 1
    }
    answer
  }

  def sortedSquares(A: Array[Int]): Array[Int] = {
    val b: Array[Int] = A.map(a => a * a).sorted
    b
  }

  def sortArrayByParity(A: Array[Int]): Array[Int] = {
    val even = collection.mutable.MutableList[Int]()
    val odd = collection.mutable.MutableList[Int]()
    A.foreach(a => {
      if (a % 2 == 0) {
        even += a
      } else {
        odd += a
      }
    })
    (even ++ odd).toArray
  }

  def flipAndInvertImage(A: Array[Array[Int]]): Array[Array[Int]] = {
    val ans = A.map(a => {
      a.reverse
    }).map(a => {
      a.map(b => {
        if (b == 1) 0
        else 1
      })
    })
    ans
  }

  def judgeCircle(moves: String): Boolean = {
    var x = 0
    var y = 0
    moves.foreach { c => {
      c match {
        case 'L' => x -= 1
        case 'R' => x += 1
        case 'U' => y += 1
        case 'D' => y -= 1
      }
    }}
    x == 0 && y == 0
  }

  def hammingDistance(x: Int, y: Int): Int = {
    var xB = x.toBinaryString
    var yB = y.toBinaryString
    if (xB.length < yB.length) {
      val diff = yB.length - xB.length
      xB = "0" * diff + xB
    } else {
      val diff = xB.length - yB.length
      yB = "0" * diff + yB
    }

    //println(xB)
    //println(yB)
    var count = 0
    0 until xB.length foreach { i => {
      val xC = xB(i)
      val yC = yB(i)
      //println(i, xC, yC)
      if (xC != yC) count += 1
    }}
    count
  }

  def diStringMatch(S: String): Array[Int] = {
    val x = 0 to S.length
    var a = x.toArray
    val A = collection.mutable.MutableList[Int]()
    S.foreach {c => {
      c match {
        case 'I' => {
          A += a(0)
          a = a.slice(1, a.length)
        }
        case 'D' => {
          A += a.last
          a = a.slice(0, a.length - 1)
        }
      }
    }}
    A += a(0)
    A.toArray
  }

}

object Hello extends App {

  /*
  val i942_1 = "IDID"
  val e942_1 = Array(0,4,1,3,2)
  val a942_1 = Solution.diStringMatch(i942_1)
  println(e942_1.deep == a942_1.deep)

  val i942_2 = "III"
  val e942_2 = Array(0,1,2,3)
  val a942_2 = Solution.diStringMatch(i942_2)
  println(e942_2.deep == a942_2.deep)

  val i942_3 = "DDI"
  val e942_3 = Array(3,2,0,1)
  val a942_3 = Solution.diStringMatch(i942_3)
  println(e942_3.deep == a942_3.deep)

  val a11 = Solution.hammingDistance(1, 4)
  println(a11)
  println(a11 == 2)

  val i10 = "LL"
  val a10 = Solution.judgeCircle(i10)
  println(a10)
  val i10 = Array(Array(1,1,0),Array(1,0,1),Array(0,0,0))
  val a10 = Solution.flipAndInvertImage(i10)
  println(a10.mkString)
  println(a10.deep == Array(Array(1, 0, 0), Array(0, 1, 0), Array(1,1,1)).deep)

  val i9 = Array(3, 1, 2, 4)
  val a9 = Solution.sortArrayByParity(i9)
  println(a9.mkString)
  println(a9.deep == Array(2, 4, 3, 1).deep)

  val i8 = Array(-4, -1, 0, 3, 10)
  val a8 = Solution.sortedSquares(i8)
  println(a8.mkString)
  println(a8.deep == Array(0, 1, 9, 16, 100).deep)

  val i9 = Array(-7,-3,2,3,11)
  val a9 = Solution.sortedSquares(i9)
  println(a9.mkString)
  println(a8.deep == Array(4,9,9,49,121).deep)
  val i5 = Array(1, 2, 3, 3)
  val a5 = Solution.repeatedNTimes(i5)
  println(a5 == 3)

  val i6 = Array(2, 1, 2, 5, 3, 2)
  val a6 = Solution.repeatedNTimes(i6)
  println(a6 == 2)

  val i7 = Array(5, 1, 5, 2, 5, 3, 5, 4)
  val a7 = Solution.repeatedNTimes(i7)
  println(a7 == 5)
  val i4 = Array("gin", "zen", "gig", "msg")
  val a4 = Solution.uniqueMorseRepresentations(i4)
  println(a4 == 2)
  val x1 = Solution.numJewelsInStones("aA", "aAAbbbb")
  println(x1 == 3)

  val x2 = Solution.numJewelsInStones("z", "ZZ")
  println(x2 == 0)

  val y1 = Solution.toLowerCase("Hello")
  println(y1 == "hello")

  val y2 = Solution.toLowerCase("LOVELY")
  println(y2 == "lovely")

  val a3 = Solution.numUniqueEmails(Array("test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"))
  println(a3 == 2)
  */
}

