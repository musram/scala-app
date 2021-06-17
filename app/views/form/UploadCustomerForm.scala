package views.form

import javax.inject.{Inject, Singleton}

import play.api.data.Form
import play.api.data.Forms._
import play.api.i18n.MessagesApi

case class UploadCustomerData( name: String, updateExistingRecords: Boolean)

@Singleton
class UploadCustomerForm @Inject() (implicit val messagesApi: MessagesApi) {
  val Instance = Form {
    mapping(
      "file" -> nonEmptyText,
      "updateExistingRecords" -> boolean
    )(UploadCustomerData.apply)(UploadCustomerData.unapply)
  }
}