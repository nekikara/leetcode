package easy.e733

object Solution {
  def floodFill(image: Array[Array[Int]],
                sr: Int,
                sc: Int,
                newColor: Int): Array[Array[Int]] = {
    val maxR = image.length
    val maxC = image.head.length
    val startOldColor = image(sr)(sc)
    if (startOldColor == newColor) {
      image
    } else {
      fillPixel(image, sr, sc, newColor, maxR, maxC, startOldColor)
    }
  }

  def fillPixel(image: Array[Array[Int]],
                sr: Int,
                sc: Int,
                newColor: Int,
                maxR: Int,
                maxC: Int,
                oldColor: Int): Array[Array[Int]] = {
    if (sc < 0 || sr < 0 || maxC <= sc || maxR <= sr) {
      image
    } else {
      val pixel = image(sr)(sc)
      if (pixel == oldColor) {
        image(sr)(sc) = newColor
        fillPixel(image, sr - 1, sc, newColor, maxR, maxC, oldColor)
        fillPixel(image, sr + 1, sc, newColor, maxR, maxC, oldColor)
        fillPixel(image, sr, sc - 1, newColor, maxR, maxC, oldColor)
        fillPixel(image, sr, sc + 1, newColor, maxR, maxC, oldColor)
      } else {
        image
      }
    }
  }
}
