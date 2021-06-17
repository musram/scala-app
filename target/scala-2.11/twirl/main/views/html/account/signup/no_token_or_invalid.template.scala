
package views.html.account.signup

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object no_token_or_invalid_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object no_token_or_invalid_Scope1 {
import services.UserService
import play.api.mvc._
import be.objectify.deadbolt.scala._

class no_token_or_invalid extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[UserService,AuthenticatedRequest[Any],MessagesApi,WebJarAssets,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(userService: UserService)(implicit request: AuthenticatedRequest[Any], messagesApi: MessagesApi, webJarAssets: WebJarAssets):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.127*/("""

"""),_display_(/*7.2*/main(userService, messagesApi("playauthenticate.token.error.title"))/*7.70*/ {_display_(Seq[Any](format.raw/*7.72*/("""
	"""),format.raw/*8.2*/("""<h1>"""),_display_(/*8.7*/messagesApi("playauthenticate.token.error.title")),format.raw/*8.56*/("""</h1>
	<p>"""),_display_(/*9.6*/messagesApi("playauthenticate.token.error.message")),format.raw/*9.57*/("""</p>
""")))}),format.raw/*10.2*/("""
"""))
      }
    }
  }

  def render(userService:UserService,request:AuthenticatedRequest[Any],messagesApi:MessagesApi,webJarAssets:WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(userService)(request,messagesApi,webJarAssets)

  def f:((UserService) => (AuthenticatedRequest[Any],MessagesApi,WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (userService) => (request,messagesApi,webJarAssets) => apply(userService)(request,messagesApi,webJarAssets)

  def ref: this.type = this

}


}
}

/**/
object no_token_or_invalid extends no_token_or_invalid_Scope0.no_token_or_invalid_Scope1.no_token_or_invalid
              /*
                  -- GENERATED --
                  DATE: Tue May 30 13:58:27 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/account/signup/no_token_or_invalid.scala.html
                  HASH: f939812319cd7a034af7f867fd71aa0d1ec7b303
                  MATRIX: 755->92|976->217|1004->220|1080->288|1119->290|1147->292|1177->297|1246->346|1282->357|1353->408|1389->414
                  LINES: 25->5|30->5|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|35->10
                  -- GENERATED --
              */
          