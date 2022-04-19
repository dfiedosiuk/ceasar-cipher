import org.scalatest._
import flatspec._
import matchers._
import Ceasar._


class CeasarSpec extends AnyFlatSpec with should.Matchers {

  behavior of "A translate() "

  it should "return translated text according to Ceasar Cipher parameters for lower case " in {
    translate("a b c ? d ... x y z", 1) shouldBe "b c d ? e ... y z a"
  }

  it should "return translated text according to Ceasar Cipher parameters for upper case " in {
    translate("Ala ma Bota", 1) shouldBe "Bmb nb Cpub"
  }
}