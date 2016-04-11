case class Address(street:String,city:String,country:String)
case class Person(name:String,age:Int,address:Address)
val alice = Person("Alice",25,Address("1 Scala Lane", "Chicago", "USA"))
val bob     = Person("Bob",     29, Address("2 Java Ave.",  "Miami",   "USA"))
val charlie = Person("Charlie", 32, Address("3 Python Ct.", "Boston",  "USA"))

for(person<-Seq(alice,bob,charlie)){
  person match {
    case Person("Alice",25,Address(_,"Chicago",_)) =>println("hi,alice")
    case Person("Bob", 29, Address("2 Java Ave.", "Miami", "USA")) =>
      println("Hi Bob!")
    case Person(name,age,_)=>println(println(s"Who are you, $age year-old person named $name?"))
  }
  //@的使用
  person match {
    case p @ Person("Alice",25,Address(_,"Chicago",_)) =>println(s"hi,alice,$p")
    case p@Person("Bob", 29, a@Address(street,city,country)) =>
      println(s"Hi Bob!you are ${p.age} and live ${a.street},${a.city},${a.country}")
    case p@Person(name,age,_)=>println(println(s"Who are you, ${p.age} year-old person named ${p.name}?"))
  }
  //如果不从实例中提取属性,直接使用p:Person
  person match {
    case p:Person =>println(s"hi,alice,$p")
    case Person("Bob", 29, Address("2 Java Ave.", "Miami", "USA")) =>
      println("Hi Bob!")
    case Person(name,age,_)=>println(println(s"Who are you, $age year-old person named $name?"))
  }

}