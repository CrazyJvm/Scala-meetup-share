package com.crazyjvm.share.scala.second

/**
 * Created by chenchao on 14-6-9.
 */

class OrderdedPoint(x: Int, y: Int) extends java.awt.Point(x, y) with math.Ordered[java.awt.Point] {
  def compare(that: java.awt.Point): Int = {
    if (this.x <= that.x) {
      if (this.x == that.x) {
        if (this.y < that.y) -1
        else if (this.y > that.y) 1
        else 0
      } else -1
    } else 1
  }
  val (_x , _y) = (getX , getY)
  override def toString = _x + "," + _y
}

/*
val x1 = new OrderdedPoint(2, -1)
val x2 = new OrderdedPoint(2, 1)

println(x1 < x2)
println(x1 > x2)
*/