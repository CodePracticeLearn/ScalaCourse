package lectures.part1as

import scala.annotation.tailrec

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
}
