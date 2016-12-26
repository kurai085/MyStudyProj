import java.util.NoSuchElementException

trait List[T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
}

class Cons[T](val head: T,val tail: List[T]) extends List[T]{
  def isEmpty = false
}

class Nil[T] extends List[T]
{
  def isEmpty = true;
  def head: Nothing = throw new NoSuchElementException("Nil.head")
  def tail: Nothing = throw new NoSuchElementException("Nul,tail")
}

object nth
{
  def nth[T](n: Int, xs:List[T]): T=
    if(xs.isEmpty) throw new IndexOutOfBoundsException
    else if(n == 0)
      xs.head
    else
      nth( n - 1, xs.tail)

  val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))

  nth(2, list)
  nth(-1, list)
}

abstract class Nat{
  def isZero : Boolean
  def predecessor: Nat
  def successor = new Succ(this)
  def +(that: Nat) :Nat
  def -(that: Nat) :Nat
}

object Zero extends Nat{
  def isZero = true
  def predecessor = throw new Error("0.predecoessor")
  def +(that: Nat) = that

  def-(that: Nat) =
    if(that.isZero)
      this
    else
      throw new Error("negative number")

}

class Succ(n: Nat) extends Nat{
  def isZero = false
  def predecessor = n
  def +(that: Nat) =new Succ(n + that)

  def -(that: Nat) =
    if(that.isZero)
      this
    else
      n - that.predecessor
}

