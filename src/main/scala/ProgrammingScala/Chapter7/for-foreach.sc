val list = List("One","Two","Three")
for{
  l<-list
} println(l)
list foreach println
//与Map的比较
for{
  l <- list
} yield l.toUpperCase

list map (_.toUpperCase)

//flatMap

for{
  l <- list
  s <- l
} yield s"$s-${s.toUpper}"
list.flatMap(x=>x)
list.map(x=>x).flatten

//withFilter判断是否为小写
list flatMap(_.toSeq withFilter(_.isLower) map (c=>s"$c-${c.toUpper}"))