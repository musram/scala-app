
package views.html.account

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object link_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object link_Scope1 {
import services.UserService
import play.api.mvc._
import be.objectify.deadbolt.scala._

class link extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[UserService,com.feth.play.module.pa.PlayAuthenticate,AuthenticatedRequest[Any],MessagesApi,WebJarAssets,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(userService: UserService, playAuth: com.feth.play.module.pa.PlayAuthenticate)(implicit request: AuthenticatedRequest[Any], messagesApi: MessagesApi, webJarAssets: WebJarAssets):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.179*/("""

"""),_display_(/*7.2*/main(userService, messagesApi("playauthenticate.link.account.title"))/*7.71*/ {_display_(Seq[Any](format.raw/*7.73*/("""
    """),format.raw/*8.5*/("""<h1>"""),_display_(/*8.10*/messagesApi("playauthenticate.link.account.title")),format.raw/*8.60*/("""</h1>
    <p>"""),_display_(/*9.9*/_providerPartial(playAuth)),format.raw/*9.35*/("""<br/>
    </p>
""")))}),format.raw/*11.2*/("""
"""))
      }
    }
  }

  def render(userService:UserService,playAuth:com.feth.play.module.pa.PlayAuthenticate,request:AuthenticatedRequest[Any],messagesApi:MessagesApi,webJarAssets:WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(userService,playAuth)(request,messagesApi,webJarAssets)

  def f:((UserService,com.feth.play.module.pa.PlayAuthenticate) => (AuthenticatedRequest[Any],MessagesApi,WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (userService,playAuth) => (request,messagesApi,webJarAssets) => apply(userService,playAuth)(request,messagesApi,webJarAssets)

  def ref: this.type = this

}


}
}

/**/
object link extends link_Scope0.link_Scope1.link
              /*
                  -- GENERATED --
                  DATE: Tue May 30 13:58:27 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/account/link.scala.html
                  HASH: f1e11c95bb8cb0bc315e85041fedbaf8a73badff
                  MATRIX: 744->92|1017->269|1045->272|1122->341|1161->343|1192->348|1223->353|1293->403|1332->417|1378->443|1424->459
                  LINES: 25->5|30->5|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|36->11
                  -- GENERATED --
              */
          