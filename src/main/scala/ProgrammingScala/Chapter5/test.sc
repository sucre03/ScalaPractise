//调用该方法时，系统会将代码所在局部作用域中的某一隐式值传入此方法
//下面的代码是将由implicit修饰的currentTaxRate传到方法中
def calcTax(amount:Float)(implicit rate:Float)=amount*rate
implicit val currentTaxRate = 0.08F
val tax = calcTax(5000F)