def elem(char: Character): RegExp
def elem(predicate: Character => Boolean): RegExp
def oneOf(chars: Seq[Character]): RegExp
def word(chars: Seq[Character]): RegExp