val t=("Hello",1,2.3)
println("Print the whole tuple:"+t)
//使用t._n提取元素时,n是从1开始的
println("Print the first item:"+t._1)
println("Print the second item:"+t._2)
println("Print the third item:"+t._3)
val (t1,t2,t3) =("World",'!',0x22)
//这里也可以使用s函数
println(s"Print the first item:${t._1}")
println(s"Print the second item:${t._2}")
println(s"Print the third item:${t._3}")
println(t1+","+t2+","+t3)
val (t4,t5,t6) =Tuple3("World",'!',0x22)
println(t4+","+t5+","+t6)