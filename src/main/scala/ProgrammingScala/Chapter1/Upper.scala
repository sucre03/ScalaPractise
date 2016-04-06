package scala.ProgrammingScala.Chapter1

/**
  * Created by sucre on 16/4/2.
  */
object Upper {
  def main(args: Array[String]) = {
    val output = args.map(_.toUpperCase()).mkString(" ")
    println(output)
  }
}
