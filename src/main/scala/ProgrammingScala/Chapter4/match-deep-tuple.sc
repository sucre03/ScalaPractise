import jdk.nashorn.internal.ir.WithNode

//序列中序号的使用方法,主要用到了Seq.zipWithIndex方法
val itemsCosts = Seq(("Pencil", 0.52), ("Paper", 1.35), ("Notebook", 2.43))
val itemsCostsIndices = itemsCosts.zipWithIndex
for(itemsCostsIndex<-itemsCostsIndices) {
  itemsCostsIndex match {
    case ((item, price), index) => println(s"$index:the $item is $price")
  }
}
