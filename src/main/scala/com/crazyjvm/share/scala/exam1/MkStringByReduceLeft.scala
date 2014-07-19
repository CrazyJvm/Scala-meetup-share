package com.crazyjvm.share.scala.exam1

/**
 * Created by chenchao on 14-7-19.
 */
object MkStringByReduceLeft extends App{

  def mkString[T](s: Seq[T], sep: String = ", ") : String =
    s.map(_.toString).reduceLeft(_.toString + sep + _.toString)

  val a = Array("AA", "BB", "CC", "DD")

  println(mkString(a))

}
