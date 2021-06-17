package views.form

import javax.inject.{Inject, Singleton}

import play.api.data.Form
import play.api.data.Forms._
import play.api.i18n.MessagesApi

case class DashBoard(accept: Boolean)

@Singleton
class DashBoardForm @Inject() (implicit val messagesApi: MessagesApi) {
  val Instance = Form {
    mapping(
      "accept" -> boolean
    )(DashBoard.apply)(DashBoard.unapply)
  }
}