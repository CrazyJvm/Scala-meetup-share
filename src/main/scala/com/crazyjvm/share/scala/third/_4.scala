package com.crazyjvm.share.scala.third

/**
 * Created by chenchao on 14-6-12.
 */
object ListPattern extends App{
  def m(l : List[Int]){
    l match {
      case (List(1,_*)) => println("beginning with 1")
      case (List(_,2,_)) => println("contains 2")
      case (List(_,3)) => println("end with 3")
      case _ => println("not match")
    }
  }
}
