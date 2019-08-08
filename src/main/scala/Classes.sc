/*
Classes in Scala are blueprints for creating objects. They can contain methods, values, variables, types, objects, traits,
and classes which are collectively called members.
 */

class Person {
  val firstName = "Dmitry"
  val lastName = "Anikin"
  def name = s"$firstName  $lastName"
}

val p = new Person
p.name

// with constructor
class Person2(first: String, last: String) {
  val firstName = first
  val lastName = last
  def name = firstName + " " + lastName
}

val p2 = new Person2("Dmitry", "Anikin")
p2.name