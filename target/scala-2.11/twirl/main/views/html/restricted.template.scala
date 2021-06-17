
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object restricted_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object restricted_Scope1 {
import services.UserService
import generated._
import generated.Tables._
import play.api.mvc._
import be.objectify.deadbolt.scala._

class restricted extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[UserService,Option[UserRow],AuthenticatedRequest[Any],MessagesApi,WebJarAssets,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(userService: UserService, localUser: Option[UserRow] = None)(implicit request: AuthenticatedRequest[Any], messagesApi: MessagesApi, webJarAssets: WebJarAssets):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.162*/("""

"""),_display_(/*9.2*/main(userService, messagesApi("playauthenticate.navigation.restricted"), "restricted")/*9.88*/ {_display_(Seq[Any](format.raw/*9.90*/("""

"""),format.raw/*11.1*/("""<h1>"""),_display_(/*11.6*/messagesApi("playauthenticate.navigation.restricted")),format.raw/*11.59*/("""</h1>
<p>
    """),_display_(/*13.6*/messagesApi("playauthenticate.restricted.secrets")),format.raw/*13.56*/("""
"""),format.raw/*14.1*/("""</p>
""")))}))
      }
    }
  }

  def render(userService:UserService,localUser:Option[UserRow],request:AuthenticatedRequest[Any],messagesApi:MessagesApi,webJarAssets:WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(userService,localUser)(request,messagesApi,webJarAssets)

  def f:((UserService,Option[UserRow]) => (AuthenticatedRequest[Any],MessagesApi,WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (userService,localUser) => (request,messagesApi,webJarAssets) => apply(userService,localUser)(request,messagesApi,webJarAssets)

  def ref: this.type = this

}


}
}

/**/
object restricted extends restricted_Scope0.restricted_Scope1.restricted
              /*
                  -- GENERATED --
                  DATE: Thu Jun 01 15:17:56 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/restricted.scala.html
                  HASH: 2ba911cb035c37008fe9f9462870fcb22476d5e2
                  MATRIX: 774->139|1030->299|1058->302|1152->388|1191->390|1220->392|1251->397|1325->450|1366->465|1437->515|1465->516
                  LINES: 27->7|32->7|34->9|34->9|34->9|36->11|36->11|36->11|38->13|38->13|39->14
                  -- GENERATED --
              */
          