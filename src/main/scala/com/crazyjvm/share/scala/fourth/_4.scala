package com.crazyjvm.share.scala.fourth

/**
 * Created by chenchao on 14-6-17.
 */
object _4 extends App{
  implicit object Line extends LineOrdering
  val l1 = new Line(1.0)
  val l2 = new Line(2.0)

  val p = new Pair(l1,l2)
  println(s"smaller => ${p.smaller}")
}

trait LineOrdering extends Ordering[Line] {
  override def compare(x: Line, y: Line) =
    if (x.len < y.len) -1
    else if (x.len == y.len) 0
    else 1
}

class Pair[T : Ordering](val first : T, val second : T){
  def smaller(implicit ord : Ordering[T]) =
    if(ord.compare(first,second) < 0) first else second
}

class Line(val len : Double){
  override def toString() = "Length of line : " + len
}