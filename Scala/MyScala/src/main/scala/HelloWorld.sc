import scala.annotation.tailrec

object HellowWorld
{

  //greatest common divisor
  def gcd(a: Int, b: Int) : Int= {
    if (b == 0)
      a
    else
      gcd(b, a % b)
  }

  //Not Tail Recursion
  def factorialNRec(n: Int): Int={
    if (n == 0)
      1
    else
      n * factorial(n-1)
  }

  //Tail Recursion
  def factorial(n: Int): Int={

    def loop(acc: Int, n: Int): Int =
      if(n == 0)
        acc
    else
        loop(acc * n, n-1)

    loop(1,n)
  }

  gcd(14, 21)
  factorial(4)
}