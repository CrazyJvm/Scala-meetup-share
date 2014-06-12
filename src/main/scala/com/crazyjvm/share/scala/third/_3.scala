package com.crazyjvm.share.scala.third

/**
 * Created by chenchao on 14-6-11.
 */
object Max extends App{
  def max(array : Array[Int]) : Int = {
    array.reduceLeft((x,y) => if(x >= y) x else y)
    //or you can use reduceRight
    //array.reduceRight((y,x) => if(x >= y) x else y)
  }
}
