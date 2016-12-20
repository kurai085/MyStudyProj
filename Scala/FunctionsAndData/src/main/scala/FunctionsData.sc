
object rationals
{
  val x = new Rational(1,2)
  x.numer
  val y = new Rational(2,3)
  x.add(y)
  println("wfqwef")

}

class Rational(x: Int, y:Int){
  def numer = x
  def denom = y

  def add(that: Rational)=
    new Rational(numer*that.denom + that.numer*denom, denom*that.denom)

  def neg : Rational = new Rational(-numer, denom)

  def sub(that: Rational) = add(that.neg)

  def less(that: Rational) = this.numer * that.denom < that.denom * this.denom

  def max(that: Rational) = if (this< that) that else this
////////////////////////////// operator overriding?

  def unary_- : Rational = new Rational(-numer, denom)
  //심볼과 콜론을 띄워주어야한다.

  def <(that: Rational) = this.numer * that.denom < that.numer * this.denom

  def + (that:Rational) =
    new Rational(numer*that.denom + that.numer*denom, denom*that.denom)

  def - (that: Rational) = this + -that

  override def toString = numer + "/" + denom
}

val x = new Rational(1,2)
val y = new Rational(2,3)
x.add(y)
x.sub(y)
x<y
x max y


