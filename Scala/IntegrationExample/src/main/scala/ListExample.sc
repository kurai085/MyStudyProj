
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


def isort(xs: List[Int]):List[Int] = xs match{
  case List() => List()
  case y :: ys => insert(y,isort(ys))
}

def insert(x:Int, xs:List[Int]):List[Int] = xs match{
  case List() => List(x)
  case y:: ys=> if(x <= y) x::xs else y::insert(x,ys)
}

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

var nums = List(1,2,3,4)
val empty = List()
var nums2 = 1::(2::(3::(4::Nil)))
//define List construction


if(empty.isEmpty)
  empty


/////////////////////////////////////////////
//comprehension sequence

def even(from: Int, to: Int): List[Int] =
  for (i <- List.range(from, to) if i %2==0)
    yield i

 println(even(0,20))


