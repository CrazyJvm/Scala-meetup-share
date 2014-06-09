package com.crazyjvm.share.scala.second

/**
 * Created by chenchao on 14-6-9.
 */
class Point(val x : Int = 0 , val y : Int = 0) {

  override def toString = ("Point : x is " + x + ", y is " + y)

}

object Point{
  def apply(x : Int = 0, y : Int = 0) = new Point(x, y)
}