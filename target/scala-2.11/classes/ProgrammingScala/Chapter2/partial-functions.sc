//偏函数,定义两个偏函数
val pf1:PartialFunction[Any,String]={case s:String =>"YES"}
val pf2:PartialFunction[Any,String]={case d:Double =>"YES"}
//将两个合成一个
val pf = pf1 orElse pf2
def tryPF(x:Any,f:PartialFunction[Any,String]):String=
    try{
      f(x).toString
    }catch {
      case _:MatchError=>"ERROR!"
    }
def d(x:Any,f:PartialFunction[Any,String])=f.isDefinedAt(x).toString
println("      |   pf1 - String  |   pf2 - Double  |    pf - All")
println("x     | def?  |  pf1(x) | def?  |  pf2(x) | def?  |  pf(x)")
println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++")
List("str", 3.14, 10) foreach { x =>
  printf("%-5s | %-5s | %-6s  | %-5s | %-6s  | %-5s | %-6s\n", x.toString,
    d(x,pf1), tryPF(x,pf1), d(x,pf2), tryPF(x,pf2), d(x,pf), tryPF(x,pf))
}