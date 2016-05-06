case class Address(city:String,state:String,zip:String)
case class Employee(name:String,salary:Double,address:Address)
abstract class Payroll{
  def netPay(employee:Employee):Double={
    val fedTaxes =calcFedTaxes(employee.salary)
    val stateTaxes = calcStateTaxes(employee.salary,employee.address)
    employee.salary - fedTaxes - stateTaxes
  }
  def calcFedTaxes(salary:Double):Double
  def calcStateTaxes(salary:Double,address:Address):Double
}
//重写父类的抽象方法时,可以忽略掉override
object Payroll2016 extends Payroll{
  val stateRate =Map(
    "XX"->0.05,
    "YY"->0.03,
    "ZZ"->0.0
  )
  def calcFedTaxes(salary: Double): Double = salary *0.25

  def calcStateTaxes(salary: Double, address: Address): Double = {
    salary *stateRate(address.state)
  }
}
val tom = Employee("Tom",10000.0,Address("Mytom","XX","12345"))
val jane = Employee("Jane",10203.0,Address("BigCity","YY","34568"))

Payroll2016.netPay(tom)
Payroll2016.netPay(jane)