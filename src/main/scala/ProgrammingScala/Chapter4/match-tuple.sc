val langs = Seq(("Scala",   "Martin", "Odersky"),
  ("Clojure", "Rich",   "Hickey"),
  ("Lisp",    "John",   "McCarthy"))
for(tuple<-langs){
  tuple match {
    case ("Scala",_,_)=>println("found scala")
    case (lang,first,last)=>println(s"found $lang,$first,$last")
  }
}