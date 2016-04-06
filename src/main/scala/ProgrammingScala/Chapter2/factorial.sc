def factorial(i:Int):Long={
  def fact(i:Int,accumuloator:Int):Long={
    if(i<=1) accumuloator
    else fact(i-1,i*accumuloator)
  }
  fact(i,1)
}
(0 to 5) foreach (i =>println(factorial(i)))