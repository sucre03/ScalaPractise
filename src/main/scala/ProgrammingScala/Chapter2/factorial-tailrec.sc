import scala.annotation.tailrec

def factorial(i:Int):Long={
  @tailrec
  //通过tailrec,编译器会告诉你代码是否正确地实现了尾递归
  def fact(i:Int,accumuloator:Int):Long={
    if(i<=1) accumuloator
    else fact(i-1,i*accumuloator)
  }
  fact(i,1)
}
(0 to 5) foreach (i =>println(factorial(i)))