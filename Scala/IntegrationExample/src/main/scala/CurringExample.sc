def addCurrying1(a: Int)(b: Int): Int = a+b
def addCurrying2(a: Int):Int => Int=b =>a+b
def addCurrying3(a: Int) = (b:Int) => a+b

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

var func1 = addCurrying2(2);
var func2 = addCurrying3(4);
val func0= addCurrying1(1)_; //UnderScore 의 선언으로 해당 형태를 사용 할 수 있음.
                             // 해당 연산자에 대하여 찾아볼것

func0(3)
func1(3)
func2(4)




//println(filter(nums, modN(2)))
//println(filter(nums, modN(3)))