package ProgrammingScala.Chapter3

import scala.io.Source
import scala.util.control.NonFatal

/**
  * Created by sucre on 16/4/6.
  */
object TryCatch {
  def main(args: Array[String]) {
    args foreach(arg=>countLines(arg))
    args foreach(countLiness(_))
  }

  def countLines(fileName:String)={
    println()
    var source:Option[Source]=None
    try{
      source=Some(Source.fromFile(fileName))
      val size=source.get.getLines().size
      println(s"file $fileName has $size lines")
    }catch {
      case NonFatal(ex)=>println(s"Non fatal exception!$ex")
    }finally {
      for(s<-source){
        println(s"closing $fileName...")
        s.close()
      }

    }

  }
  def countLiness(fileName:String)={
    val s = Some(Source.fromFile(fileName))
    print(s"filesize is : ${s.get.getLines().size}")
    s.get.close()
  }

}
