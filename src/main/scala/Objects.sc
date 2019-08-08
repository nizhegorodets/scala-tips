/*
An object is a class that has exactly one instance. It is created lazily when it is referenced, like a lazy val.
As a top-level value, an object is a singleton.
As a member of an enclosing class or as a local value, it behaves exactly like a lazy val.
 */

// empty object
object Test {}
Test

// object with a methods
object Test2 {
  def name: String = "Dmitry"
}
Test2.name

object Test3{
  def hello(name: String): String = "Hello, " + name
}
Test3.hello("Dmitry")

// objects with a fields
object Test4 {
  // immutable
  val name = "Dmitry"
  // mutable
  var age = 18

  def hello(other: String): String = name + " better than " + other
  def changeAge(newAge: Int): Unit = age = newAge
  def showAge: Int = age
}
Test4.hello("you")
Test4.changeAge(42)
Test4.showAge

// difference between field and method

object Test7 {
  val simpleField = {
    println("Evaluating simpleField")
    42
  }
  def noParameterMethod = {
    println("Evaluating noParameterMethod")
    42
  }
}

Test7
// never evaluated again
Test7.simpleField

// evaluated every time
Test7.noParameterMethod
Test7.noParameterMethod