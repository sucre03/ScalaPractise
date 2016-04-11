val nonEmptySeq = Seq(1,2,3,4)
val emptySeq = Seq.empty[Int]
val nonEmptyMap = Map("one"->1,"two"->2,"three"->3)
//+:是从右往左进行匹配,匹配 List 的最后一个元素，
// 然后从后往前依次访问各元素：
def seqToString[T](seq:Seq[T]):String = seq match {
  case head +:tail=>s"($head+:${seqToString(tail)})"
  case Nil=>"(Nil)"
}
for(seq<-Seq(nonEmptySeq,emptySeq,nonEmptyMap.toSeq)){
    println(seqToString(seq))
}