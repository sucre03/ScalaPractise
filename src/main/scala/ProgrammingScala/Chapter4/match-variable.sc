for{
  x<-Seq(1,2,2.3,"one","two","three")
}{
  val str = x match {
    case 1 =>"this is 1"
    case _:Int=>s"this is $x"
    case _:Double=>s"this is $x"
    case "one"=>"this is one"
    case _:String=>s"this is $x"
    case _=>s"unexpected value $x"
  }
  println(str)
}


def checkY(y:Int)={
  for{
    x<-Seq(300,900,600)
  }{
    val str = x match {
        //这里要注意,这里的y具体说应该是常量所以要用到``来进行处理
      case `y`=>"found y"
      case _:Int=>s"found $x"
    }
    println(str)
  }

}
checkY(900)