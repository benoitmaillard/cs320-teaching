enum Token extends Positioned with Product:
  case KeywordToken(value: String)
  case BoolLitToken(value: Boolean)
  case PrimTypeToken(value: String)
  case OperatorToken(name: String)
  case DelimiterToken(value: String)
  case IdentifierToken(name: String)
  case IntLitToken(value: Int)
  case StringLitToken(value: String)