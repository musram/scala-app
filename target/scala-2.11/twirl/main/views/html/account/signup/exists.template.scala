
package views.html.account.signup

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object exists_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object exists_Scope1 {
import services.UserService
import play.api.mvc._
import be.objectify.deadbolt.scala._

class exists extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[UserService,AuthenticatedRequest[Any],MessagesApi,WebJarAssets,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(userService: UserService)(implicit request: AuthenticatedRequest[Any], messagesApi: MessagesApi, webJarAssets: WebJarAssets):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.127*/("""

"""),_display_(/*7.2*/main(userService, messagesApi("playauthenticate.user.exists.title"))/*7.70*/ {_display_(Seq[Any](format.raw/*7.72*/("""
	"""),format.raw/*8.2*/("""<h1>"""),_display_(/*8.7*/messagesApi("playauthenticate.user.exists.title")),format.raw/*8.56*/("""</h1>
	<p>"""),_display_(/*9.6*/messagesApi("playauthenticate.user.exists.message")),format.raw/*9.57*/("""</p>
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
object exists extends exists_Scope0.exists_Scope1.exists
              /*
                  -- GENERATED --
                  DATE: Tue May 30 13:58:27 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/account/signup/exists.scala.html
                  HASH: 57cbc09d63f5dce35ca53e8b8eb9586719f06d55
                  MATRIX: 716->92|937->217|965->220|1041->288|1080->290|1108->292|1138->297|1207->346|1243->357|1314->408|1350->414
                  LINES: 25->5|30->5|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|35->10
                  -- GENERATED --
              */
          