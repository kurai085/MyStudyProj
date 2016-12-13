
object exercise{

  def product_reduce(f: Int=>Int)(a: Int, b: Int): Int =
    mapReduce(f,(x,y)=>x * y, 1)(a,b)


  def product(f: Int => Int)(a:Int, b: Int): Int=
  {
    if(a > b)
      1
    else
      f(a) * product(f)(a+1,b)
  }

  product(x=> x*x)(3,4)

  def fact(n: Int) =
  {
    product(x=>x)(1,n)
  }

  def mapReduce(f: Int=> Int, combine: (Int, Int)=>Int, zero: Int)(a: Int, b: Int) : Int=
  {
    if(a>b)zero
    else
      combine(f(a), mapReduce(f, combine, zero)(a+1,b))
  }

  fact(5)
  product_reduce(x=> x*x)(3,4)
  product(x=> x*x)(3,4)
}