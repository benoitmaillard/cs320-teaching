val lexer = Lexer(    
  word("true")
    |> { (cs, range) =>
      BoolLitToken(true).setPos(range._1) },
  ... // other rules

) onError {
  (cs, range) =>
    ErrorToken(cs.mkString).setPos(range._1)
} onEnd {
  pos => EOFToken().setPos(pos)
}