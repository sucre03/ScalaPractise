def isEven(n:Int)=n%2==0
List(1,2,3,4) filter isEven foreach println

def isEvenOne(n:Int,m:Int)=n%m==0
//Map(1->3,4->1,6->2).filter((_._1,_._2))

//::是操作
val list = List(1,2,3,5)
print('a'::list)
//任何名字以 : 结尾的方法均与其右边的对象绑定，
// 它们并不与左侧对象绑定。
//以上等同于
val list1 = List(6,7,8)
print(list1.::('b'))
//:::用于list之间的合并
print(list:::list1)