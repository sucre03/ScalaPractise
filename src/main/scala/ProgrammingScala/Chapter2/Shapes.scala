package ProgrammingScala.Chapter2

/**
  * case修饰的类要有参数，class与case class的区别参见
  * http://www.iteblog.com/archives/1508
  * copy 方法允许你在创建 case 类的新实例时，只给出与原对象不同部分的参数
  * Created by sucre on 16/4/2.
  */
case class Point(x:Double =0.0,y:Double=0.0) {
  def shift(deltax:Double =0.0,deltay:Double=0.0)=copy(x+deltax,y+deltay)
  //验证看Shapes.sc
}
abstract class Shape(){
  /**
    * draw 带两个参数列表，其中一个参数列表带着一个表示绘制偏移量的参数
    * 另一个参数列表是我们之前用过的函数参数。
    */
  def draw(offset:Point=Point(0.0,0.0))(f:String=>Unit):Unit=
      f(s"draw(offset=$offset),{this.toString}")
}
case class Circle(center:Point,radius:Double) extends Shape
case class Rectangle(lowerLeft:Point,height:Double,width:Double) extends Shape