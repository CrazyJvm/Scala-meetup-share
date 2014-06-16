package com.crazyjvm.share.scala.fourth

import java.io.File
import scala.io.Source

/**
 * Created by chenchao on 14-6-15.
 */
object _1 extends App{
  import com.crazyjvm.share.scala.fourth.ImplicitContext1._
  //put your code here and you can convert from File to RichFile directly
  val f = new File("your file path")
  f.read()
}

class RichFile(val file : File){
  def read = Source.fromFile(file.getPath).mkString
}

object ImplicitContext1 {
  implicit def file2RichFile(file : File) = new RichFile(file)
}

