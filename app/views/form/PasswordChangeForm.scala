package views.form

import javax.inject.{Inject, Singleton}

import play.api.data.Form
import play.api.data.Forms._
import play.api.i18n.MessagesApi

case class PasswordChange(password: String, repeatPassword: String)

@Singleton
class PasswordChangeForm @Inject() (implicit val messagesApi: MessagesApi) {
  val Instance = Form {
    mapping(
      "register-password" -> nonEmptyText(minLength = 5),
      "register-password2" -> nonEmptyText(minLength = 5)
    )(PasswordChange.apply)(PasswordChange.unapply).
      verifying(messagesApi("playauthenticate.change_password.error.passwords_not_same"),
        data => data.password != null && !data.password.isEmpty && data.password.equals(data.repeatPassword))
  }
}