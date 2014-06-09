package com.crazyjvm.share.scala.second

/**
 * Created by chenchao on 14-6-9.
 */
class Person(name : String) {
  val _name = name.split("\\s+")  //use \\s+ if there are more than one spaces
  val firstName = _name(0)
  val lastName = _name(1)

  //we can override toString
  override def toString = s"first name is $firstName, and last name is $lastName"
}
