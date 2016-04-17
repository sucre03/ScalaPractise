//主要说明模式匹配的深度应用
case class Address(street:String,city:String,country:String)
case class Person(name:String,age:Int)

val as = Seq(
  Address("1 Scala Lane", "Anytown", "USA"),
  Address("2 Clojure Lane", "Othertown", "USA"))
val ps = Seq(
  Person("Buck Trends", 29),
  Person("Clo Jure", 28))

val pas = ps zip as
pas map{
  case(Person(name,age),Address(street,city,country))=>
    s"$name (age:$age) lives at $street,in $country"
}