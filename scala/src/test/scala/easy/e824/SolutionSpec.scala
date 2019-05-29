package easy.e824

import org.scalatest._

class SolutionSpec extends FlatSpec with Matchers {
  "Solution" should "have toGoatLatin 1" in {
    val i = "I speak Goat Latin"
    val o = "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
    Solution.toGoatLatin(i) should be(o)
  }
  "Solution" should "have toGoatLatin 2" in {
    val i = "The quick brown fox jumped over the lazy dog"
    val o =
      "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
    Solution.toGoatLatin(i) should be(o)
  }
  "Solution" should "have toGoatLatin 3" in {
    val i = "Each word consists of lowercase and uppercase letters only"
    val o =
      "Eachmaa ordwmaaa onsistscmaaaa ofmaaaaa owercaselmaaaaaa andmaaaaaaa uppercasemaaaaaaaa etterslmaaaaaaaaa onlymaaaaaaaaaa"
    Solution.toGoatLatin(i) should be(o)
  }
}
