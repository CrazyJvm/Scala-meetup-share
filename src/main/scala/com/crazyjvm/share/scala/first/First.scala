package com.crazyjvm.share.scala.first

/**
 * Created by chenchao on 14-6-8.
 */
object First extends App{

  //1
  def signum(num : Int) : Int = if (num > 0) 1 else if (num < 0 ) -1 else 0

  //2
  for(j <- Range(10,-1,-1)) println(j)
  //following statement is just for demo. please do not consider performance
  //for(i <- 0 to 10 reverse) println(i)

  //3
  def countdown(n : Int){
    assert(n > 1, "n must larger than 1")
    for(i <- 0 until n) println(i)
  }

  //4
  def swap(array : Array[Int]) = {
    for (idx <- 0 until (if (array.length % 2 == 0) array.length else array.length - 1, 2)) {
      val tmp = array(idx)
      array(idx) = array(idx + 1)
      array(idx + 1) = tmp
    }
    array
  }

  //5
  def wordcount(content : String) : Map[String, Int]= {
    val counts = scala.collection.mutable.Map[String, Int]()
    for(word <- content.split(' ')){
      if (counts.contains(word))
        counts(word) = counts(word) + 1
      else
        counts += (word -> 1)
    }
    counts.toMap
  }

}
