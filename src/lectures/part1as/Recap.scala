package lectures.part1as

import scala.annotation.tailrec
import scala.concurrent.ExecutionContext
/* *
Basics of Scala and OO/
 */
object Recap extends App {

  // instructions vs expressions
  /* instructions are fundamental operative of meparitive programming languages like python, java, c++
  * and are executed in order/sequence
  *
  * programs through expressions by building expressions on top of other expressions.
  * */
  val acondition:Boolean = false

  val aconditionedVal = if(acondition) 42 else 56
//compile infer types
val aCodeBlock = {
    if(acondition) 42 else 56
}

  //unit

  val theUnit = println("hello") //returns Unit, sideeffect

  //functions

  def aFunction(x: Int) = x+1

  //@tailrec
  /*we already know that tail recursion makes recursive functions not use additional stack frames when calling them recursively.

That used to cause a lot of stack overflow errors,But with Taylor rec they are converted to iterations in the jaivin by code.*/

  @tailrec
  def factorial(n:Int, accumulator: Int):Int =
  {
    if(n>=0)accumulator else factorial(n-1,n*accumulator)
  }

  //inheritance , the single class polymorphism
//OO programming
  class Animal
  class Dog extends Animal

  val aDog: Animal = new Dog //subtyping polymorphism

  trait Carnivore{
    def eat(a: Animal) :Unit
  }

  class Crocodile extends Animal with Carnivore{
    override def eat(a: Animal): Unit = println("food!")
  }

  //method Annotations

  val aCroc = new Crocodile
  aCroc.eat(aDog)

  aCroc eat(aDog)  //can also be written like this, natural language, compile will rewrite it like above line

//anonymous classes

  val aCarnivore  = new Carnivore { //trait cannot be instantiated alone, let us provide a implementation on the spot to use it
    //actually compiler creates a new anonymous class for us by extending carnivore and overriding the method either here on the spot
    override def eat(a: Animal): Unit =  println("food food!!")
  }


  //generics

  abstract class MyList[+A]{

  }

  object MyList

  //case class

  case class Person(name: String, age :Int)

  //execptions. try/catch/finally

  val throwsExecption = throw new RuntimeException

  val aPotentialFailure = try {
    throwsExecption
  }
  catch {
    case e: Exception => println("execption")
  }
  finally{
    println("some logs")

  }
//functional programming

  val incrementer =  new Function[Int,Int] {
    override def apply(v1: Int): Int = v1 + 1
  }

  incrementer(1)


  val anonymousincrementor = (x:Int) => x + 1

List(1,2,3).map(anonymousincrementor)

  //for comprehension

  val pairs = for {
    listInt <- List(1,2,3)
    listChar <- List('a','b')
  }yield listChar + "-"+listInt // char and ints

  //scala collections, maps, Arrays, Lists, vectors, Maps, Tuples

  val aMap = Map(1->"abc")

  //collection Option, Try




}
