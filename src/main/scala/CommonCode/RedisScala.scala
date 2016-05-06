package CommonCode

import com.redis.RedisClient

/**
  * Created by sucre on 16/4/28.
  */
/*
*@auther 乔磊
*@date 16/4/28
*/
object RedisScala extends App{
  val rd = new RedisClient("localhost",6379)
  this.RedisString(rd);

  def RedisString(rd:RedisClient)={
    rd.set("book","scala")
    println("language = " + rd.get("book").getOrElse("nothing"))
  }
  def RedisList(rd:RedisClient): Unit ={
    rd.lpush("book-list","scala")
    rd.lpush("book-list","java")
    rd.lpush("book-list","python")
  }
}
