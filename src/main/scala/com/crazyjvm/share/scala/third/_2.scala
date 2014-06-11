package com.crazyjvm.share.scala.third

/**
 * Created by chenchao on 14-6-11.
 */
object Factorial extends App{
  def doFactorial(n : Int) : Long = {
    assert(n > 1, "n must larger than 1 !")
    1 to n reduceLeft(_ * _) toLong
    //1.to(n).reduceLeft(_ * _).toLong()
  }
}