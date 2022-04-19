object Ceasar {
  def translate(text: String, n: Int): String = {
    def cipherLow(c: Char, n: Int): Char = {
      (((c - 'a') + n) % 26 + 'a').toChar
    }

    def cipherUp(c: Char, n: Int): Char = {
      (((c - 'A') + n) % 26 + 'A').toChar
    }

    text.map {
      case c if ('a' to 'z').contains(c) => cipherLow(c, n)
      case c if ('A' to 'Z').contains(c) => cipherUp(c, n)
      case c => c
    }
  }
}
