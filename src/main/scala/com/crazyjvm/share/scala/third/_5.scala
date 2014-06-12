package com.crazyjvm.share.scala.third

/**
 * Created by chenchao on 14-6-12.
 */
object ListFilter extends App{

  def _find(list : List[Int])(block : List[Int] => List[Int]) : List[Int] = block(list)

  def find = _find(List(1,2,3,4,5,6,7,8))_

  find(xs => xs.filter(_ != 0).filter(_ % 2 == 0))
  find(xs => xs.filter(_ > 2))
  find(xs => xs.map(2 * _))

}
