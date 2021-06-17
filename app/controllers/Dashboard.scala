package controllers

import javax.inject._

import actions.NoCache
import be.objectify.deadbolt.scala.DeadboltActions
import com.feth.play.module.pa.PlayAuthenticate
import com.nappin.play.recaptcha.{RecaptchaVerifier, WidgetHelper}
import constants.SecurityRoleKey
import play.api.mvc._
import services.UserService
import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.routing.JavaScriptReverseRouter
import play.core.j.JavaHelpers
import play.mvc.Http.RequestBody
import providers.MyAuthProvider
import views.form._

@Singleton
class Dashboard @Inject() (implicit
                             val messagesApi: MessagesApi,
                             val verifier: RecaptchaVerifier,
                             widgetHelper: WidgetHelper,
                             webJarAssets: WebJarAssets,
                             deadbolt: DeadboltActions,
                             auth: PlayAuthenticate,
                             userService: UserService,
                             authProvider: MyAuthProvider,
                             formContext: FormContext) extends Controller with I18nSupport {

  import scala.concurrent._
  import ExecutionContext.Implicits.global

  //-------------------------------------------------------------------
  // public
  //-------------------------------------------------------------------
  def dashboard = deadbolt.WithAuthRequest()() { implicit request =>
    Future {
      Ok(views.html.dashboard(userService, formContext.dashboardForm.Instance))
    }
  }


}
