package CommonCode.akka

import CommonCode.TeacherActor
import CommonCode.TeacherProtocol.QuoteRequest
import akka.actor.{ActorSystem, Props}

/**
  * Created by sucre on 16/5/11.
  */
/*
*@auther 乔磊
*@date 16/5/11
*/
object StudentSimulatorApp extends App{
  val actorSystem =ActorSystem("UniversityMessageSystem")
  val teacherActorRef = actorSystem.actorOf(Props[TeacherActor],name="teacherActor")
  teacherActorRef ! QuoteRequest
  Thread.sleep(2000)
  actorSystem.shutdown()
}
