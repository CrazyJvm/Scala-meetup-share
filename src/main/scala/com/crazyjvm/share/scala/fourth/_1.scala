package com.crazyjvm.share.scala.fourth

import java.io.File
import scala.io.Source

/**
 * Created by chenchao on 14-6-15.
 */
object _1 {

  implicit def file2RichFile(file : File) = new RichFile(file)

}

class RichFile(val file : File){
  def read = Source.fromFile(file.getPath).mkString
}

