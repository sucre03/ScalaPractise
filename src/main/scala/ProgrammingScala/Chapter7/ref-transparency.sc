//使用Either来处理异常的发生
def addInt(one:String,two:String):Either[NumberFormatException,Int]=
try{
    Right(one.toInt+two.toInt)
}catch {
  case nfe:NumberFormatException=>Left(nfe)
}
addInt("1","2")
addInt("1","x")
addInt("x","2")
