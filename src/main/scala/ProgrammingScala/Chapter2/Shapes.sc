import ProgrammingScala.Chapter2.Point

val p1 = new Point(x=3.3,y=4.4)
//注意如果这里用显示参数x y 那也可以写成
val p2 = new Point(y=4.4,x=3.3)
//如果不用显示参数，那就要按照Point的参数顺序写
val p3 = new Point(3.3,4.4)
val p4 = p1.copy(y=6.6)
val p5 = p1.copy(x=5.5)
//如果不指定参数默认按从前往后的顺序走
val p7 = p1.copy(8.8)
//平移
val p8 = p1.shift(1.1,2.2)