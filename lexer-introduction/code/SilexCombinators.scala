def many(regExp: RegExp): RegExp
def many1(regExp: RegExp): RegExp
def opt(regExp: RegExp): RegExp

sealed abstract class RegExp {
    def |(that: RegExp): RegExp
    def ~(that: RegExp): RegExp
}