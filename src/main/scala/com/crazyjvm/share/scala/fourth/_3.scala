package com.crazyjvm.share.scala.fourth

import java.io.File

/**
 * Created by chenchao on 14-6-16.
 */
object _3 extends App{
  //RichFile is already defined in _1.scala
  def _read(f : File)(implicit file : File => RichFile){
    f.read
  }
}


