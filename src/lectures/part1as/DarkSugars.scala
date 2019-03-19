package lectures.part1as

object DarkSugars exoends App {

  def singleArgMethod(arg:Int):String = s"$arg little"


  //single abstract method

  trait Action{
    def act(x:Int):Int
  }


  val anInstance:Action = new Action{
  override def act(x:Int):Int => x+1
}

  val aFunkyInstance: Action = (x:Int)=>x+1

  val aFunkyInstance1: Action = override def act(x:Int):Int => x+1


  //syntax sugar for :: , #::

  val prependList = 2 :: List(3,4) //compiler rewrites as List(3,4).:: 2

  //scala spec decides the last associativity of method
 // if it ends in : it is right associative

  class MyStream[T]{
    def -->:(value:T):MyStream = this
  }

val myStream  1-->:2 -->:3-->: new MyStream[Int]


  // infix

  class Composite[A,B]

  val abc: Int Composite String = ???

 class ->[A,B]
  val towards : Int ->String =??? // such notations we see in functional programming




}
