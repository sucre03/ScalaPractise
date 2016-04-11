1 to 10
1 until 10
1 to 10 by 3
10 to 1 by -3
1L to 10L by 3
1.1f to 10.3f by 3
1.1f to 10.3f by 3.1f
1.1f to 10.3f by 0.3f
1.1 to 10.3 by 3.1
'a' to 'g' by 3
BigInt(1) to BigInt(10) by 3
BigDecimal(1.1) to BigDecimal(10.1) by 3.1
//s函数的应用
val name = "James"
s"Hello,$name"
//这里要用到的是{},而不(),要注意
s"1+1=${1+1}"

//在scala中参数化类型(java中泛型)用[]表示
val strings:List[String]=List("one","two","three")
//Any代表任意类型
val anys:List[Any]=List(1,"one",2,"two")