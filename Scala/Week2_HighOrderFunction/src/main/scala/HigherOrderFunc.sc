object HigherOrder{


  def sum(f: Int => Int,a: Int, b:Int)={
  //factorial  //factorial
   def loop(a: Int, acc: Int): Int = {
     println(acc,a)
     if (a > b) //Clojure
       acc
     else
       loop(a + 1, f(a) + acc)
   }

     loop(a, 0)
  }

  val rslt =  sum(x=>2*x+1,3,5)

}