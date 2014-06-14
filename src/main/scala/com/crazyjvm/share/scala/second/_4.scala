package com.crazyjvm.share.scala.second

/**
 * Created by chenchao on 14-6-9.
 */
final class Point(val x: Int, val y: Int){
  override def toString = s"(x,y) : ($x,$y)"
}

abstract class Shape {
  def centerPoint: Point
  def className = this.getClass.getSimpleName
  override def toString =  s"Shape=> $className , Center=> $centerPoint"
}

class Rectangle(val topLeft: Point, val bottomRight: Point) extends Shape {
  override val centerPoint = new Point((bottomRight.x + topLeft.x) / 2, (bottomRight.y + topLeft.y) / 2)
}
class Circle(val centerPoint: Point, val radius: Int) extends Shape

object SSSS extends App{
  val rect = new Rectangle(new Point(0,0), new Point(10, 10))
  println(rect)
}

/*
test

val rect = new Rectangle(new Point(0,0), new Point(10, 10))
println(rect)

val circle = new Circle(new Point(5,5), 6)
println(circle)
*/