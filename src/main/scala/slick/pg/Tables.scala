package slick.pg
import slick.driver.PostgresDriver.api._
import slick.lifted.{Tag}

/**
  * slick访问postgresql
  * User: qiaolei
  * Date: 2016-06-07
  * Time: 11:24
  */
object Tables {
  case class user(id:Int,username:String)
  class Users(tag:Tag) extends Table[user](tag,"users_slick"){
    def id = column[Int]("id")
    def username=column[String]("username")

    def * = (id,username)<>(user.tupled,user.unapply)
  }
}
