val m = Map(1->2,3->5,5->8)
m.get(5) match {
  case Some(n)=>s"the value is $n"
  case None=>"exception"
}
