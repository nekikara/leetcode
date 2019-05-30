package easy.e167

object Solution {
  def twoSum(numbers: Array[Int], target: Int): Array[Int] = {
    val max = numbers.length
    traverse(numbers, target, 0, max - 1)
  }

  def traverse(numbers: Array[Int],
               target: Int,
               firstIndex: Int,
               secondIndex: Int): Array[Int] = {
    val first = numbers(firstIndex)
    val second = numbers(secondIndex)
    val sum = first + second

    if (target == sum) {
      Array(firstIndex + 1, secondIndex + 1)
    } else if (target < sum) {
      traverse(numbers, target, firstIndex, secondIndex - 1)
    } else {
      traverse(numbers, target, firstIndex + 1, secondIndex)
    }
  }
}
