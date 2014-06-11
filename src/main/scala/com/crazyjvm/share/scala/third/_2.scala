package com.crazyjvm.share.scala.third

/**
 * Created by chenchao on 14-6-11.
 */
object Factorial extends App{
  def doFactorial(n : Int) : Long = {
    1 to n reduceLeft(_ * _) toLong
    //1.to(n).reduceLeft(_ * _).toLong()
  }
}