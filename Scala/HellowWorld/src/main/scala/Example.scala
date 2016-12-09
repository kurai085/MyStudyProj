/**
  * Created by Bin on 2016-12-08.
  */
object ExampleApp extends App {
  def abs(x: Double) = if(x < 0) -x else x

  def sqrtIter(guess: Double, x: Double): Double=
    if (isGoodEnough(guess, x))
      guess
    else sqrtIter(improve(guess,x),x)

  def isGoodEnough(guess: Double, x: Double) =
      abs(guess*guess-x) /x < 0.001

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2

  def sqrt(x: Double) = sqrtIter(1.0, x)

 val rslt = sqrt(1)
 val aa = isGoodEnough(1.0,1)
// val rslt2 =  sqrt(4)

 println(rslt);
//  println(rslt2);
//  println(sqrt(1e-6));
}
