word("0b") ~ many1(oneOf("01"))
  |> { (cs, range) =>
    transformToToken(cs).setPos(range._1)
  }