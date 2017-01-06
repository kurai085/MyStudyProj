def filter(xs: List[Int], p: Int => Boolean): List[Int] =
  if (xs.isEmpty) xs
  else if (p(xs.head)) xs.head :: filter(xs.tail, p)
  else filter(xs.tail, p)

def modN(n: Int)(x: Int) = ((x % n) == 0)

def calculate(gx:Int=>Int,x:Int):Int=
  gx(x)

def sum(x:Int)(y:Int):Int =
  x+y

def cal(x:Int)(y:Int):Int=
  x+y

//val nums = List(1, 2, 3, 4, 5, 6, 7, 8)
calculate(sum(2),1)





//println(filter(nums, modN(2)))
//println(filter(nums, modN(3)))