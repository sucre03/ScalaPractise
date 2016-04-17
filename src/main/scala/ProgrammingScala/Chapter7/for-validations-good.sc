//scalaz的使用可以使程序在异常发生继续后面的操作
import scalaz._, std.AllInstances._
def positive(i: Int): Validation[List[String], Int] = {
  if (i > 0) Success(i)
  else Failure(List(s"Nonpositive integer $i"))
}


positive(5) +++ positive(10) +++ positive(25)
positive(5) +++ positive(-10) +++ positive(25) +++ positive(-30)