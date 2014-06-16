package com.crazyjvm.share.scala.fourth

import java.io.File
import scala.io.Source

/**
 * Created by chenchao on 14-6-15.
 */
object _2 extends App{
  import com.crazyjvm.share.scala.fourth.Helper._
  val f = new File("your file path")
  f.read

}

object Helper{
  implicit class FileEnhancer(f : File){
    def read(file : File) = Source.fromFile(file.getPath).mkString
  }
}
