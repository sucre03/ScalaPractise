package CommonCode.akka

import CommonCode.TeacherProtocol.{QuoteReponse, QuoteRequest}
import akka.actor.{Actor, ActorLogging}

import scala.util.Random

/**
  * Created by sucre on 16/5/11.
  */
/*
*@auther 乔磊
*@date 16/5/11
*/
class TeacherActor extends Actor with ActorLogging{
  val quotes = List(
      "Moderation is for cowards",
      "Anything worth doing is worth overdoing",
      "The trouble is you think you have time",
      "You never gonna know if you never even try")
  def receive ={
    case QuoteRequest =>{
      val quoteResponse = QuoteReponse(quotes(Random.nextInt(quotes.size)))
      log.info(quoteResponse.toString)
    }
  }
}
