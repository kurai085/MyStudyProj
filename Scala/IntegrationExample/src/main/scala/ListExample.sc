
/*
 Case Class
 : This Class is created object without new syntax
 */

abstract class Term

case class Var(name: String) extends Term
case class Fun(arg: String, body: Term) extends Term
case class Point(x: Int, y: Int)
//x, y가 멤버로 등록 되는듯
val item = Point(1,2)
var item2 = Point(2,4)
item.x
item.y

item2.x
item2.y

////////////////////////////////////////////////////////


def matchTest(x: Int) : Int = x match{
  case 1 => 2
  case 2 => 3
  case 3 => 4
}



/////////////////////////////////////////////////////////
def removeAt(n: Int, xs:List[Int])=
  (xs take n) ::: (xs drop n+1)

def isort(xs: List[Int]):List[Int] = xs match{
  case List() => List()
  case y :: ys => insert(y,isort(ys))
}

def insert(x:Int, xs:List[Int]):List[Int] = xs match{
  case List() => List(x)
  case y :: ys=> if(x <= y) x::xs else y::insert(x,ys)
}

def testOperator(x:Int,xs: List[Int]) : List[Int] = xs match {
  case List() => List()
  case y :: ys =>
    //List (1,2,3,4,5)일 경우 y = x+1 값을 나타내며 ys는 x를 인덱스로 하여 그 뒤에있는 값들을 지칭한다.
    if(x<=y) {
      println(y)
      println(ys)
      x :: xs
    }
    else
      y::testOperator(x,ys)
}


class Operator(x:Int)
{
  def + (x:Int, y:Int) : Int = {
    x + y
  }

  def GetNumber() =
  {
      x
  }

  def + (y:Operator) : Int =
    x + y.GetNumber()
}

def sum(x :Operator, y:Operator) : Int =
  x.GetNumber() + y.GetNumber()

/*
* var 는 getter / setter 모두 생겨 변수의 재초기화를 할 수 있으나
* val 은 immutable 타입으로 getter만 생기기떄문에 할당은 불가능하고
* 재정의는 가능하다
* */

/*
the construction operation ::
this x :: xs operation gives a new list with the first element x,
followed by the elements of xs

 */
val fruit = List("apples", "oranges","pears");
fruit(0)
fruit.head
fruit.tail
fruit.tail.head

var nums = List(1,2,3,4,5)
val empty = List()
var nums2 = 1::(2::(3::(4::Nil)))
var num3 = 1::2::3::4::5::Nil
var num4 = 2::3::4::5::6::7::8::Nil

var op = new Operator(1)
var op2 = new Operator(2)

op + op2

sum(op)

//define List construction
testOperator(2, nums)

if(empty.isEmpty)
  empty


/////////////////////////////////////////////
//comprehension sequence

def even(from: Int, to: Int): List[Int] =
  for (i <- List.range(from, to) if i %2==0)
    yield i

 println(even(0,20))


