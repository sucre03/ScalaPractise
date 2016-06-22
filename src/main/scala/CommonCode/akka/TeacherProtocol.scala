package CommonCode.akka

/**
  * Created by sucre on 16/5/11.
  */
/*
*@auther 乔磊
*@date 16/5/11
*/
object TeacherProtocol {
  case class QuoteRequest()
  case class QuoteReponse(quoteString:String)
}
