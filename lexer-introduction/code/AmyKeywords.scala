word("abstract") | word("case") | word("class") |
word("fn") | word("else") | word("extends") |
word("if") | word("match") | word("object") |
word("val") | word("error") | word("_") | word("end")
  |> { (cs, range) =>
    KeywordToken(cs.mkString).setPos(range._1) },
