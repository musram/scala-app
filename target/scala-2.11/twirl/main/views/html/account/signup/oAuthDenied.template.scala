
package views.html.account.signup

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object oAuthDenied_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object oAuthDenied_Scope1 {
import services.UserService
import play.api.mvc._
import be.objectify.deadbolt.scala._

class oAuthDenied extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[UserService,String,AuthenticatedRequest[Any],MessagesApi,WebJarAssets,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(userService: UserService, providerKey: String)(implicit request: AuthenticatedRequest[Any], messagesApi: MessagesApi, webJarAssets: WebJarAssets):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.148*/("""

"""),_display_(/*7.2*/main(userService, messagesApi("playauthenticate.oauth.access.denied.title"))/*7.78*/ {_display_(Seq[Any](format.raw/*7.80*/("""
	"""),format.raw/*8.2*/("""<h1>"""),_display_(/*8.7*/messagesApi("playauthenticate.oauth.access.denied.title")),format.raw/*8.64*/("""</h1>
	<p>"""),_display_(/*9.6*/messagesApi("playauthenticate.oauth.access.denied.explanation")),format.raw/*9.69*/("""<br/></p>
	<p>"""),_display_(/*10.6*/messagesApi("playauthenticate.oauth.access.denied.alternative")),format.raw/*10.69*/("""<a href=""""),_display_(/*10.79*/routes/*10.85*/.Application.signup),format.raw/*10.104*/("""">"""),_display_(/*10.107*/messagesApi("playauthenticate.oauth.access.denied.alternative.cta")),format.raw/*10.174*/("""</a>.</p>
""")))}),format.raw/*11.2*/("""
"""))
      }
    }
  }

  def render(userService:UserService,providerKey:String,request:AuthenticatedRequest[Any],messagesApi:MessagesApi,webJarAssets:WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(userService,providerKey)(request,messagesApi,webJarAssets)

  def f:((UserService,String) => (AuthenticatedRequest[Any],MessagesApi,WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (userService,providerKey) => (request,messagesApi,webJarAssets) => apply(userService,providerKey)(request,messagesApi,webJarAssets)

  def ref: this.type = this

}


}
}

/**/
object oAuthDenied extends oAuthDenied_Scope0.oAuthDenied_Scope1.oAuthDenied
              /*
                  -- GENERATED --
                  DATE: Tue May 30 13:58:27 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/account/signup/oAuthDenied.scala.html
                  HASH: bb01f94ed16455c06096bcb5c5e0109b76202186
                  MATRIX: 738->92|980->238|1008->241|1092->317|1131->319|1159->321|1189->326|1266->383|1302->394|1385->457|1426->472|1510->535|1547->545|1562->551|1603->570|1634->573|1723->640|1764->651
                  LINES: 25->5|30->5|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|35->10|35->10|35->10|35->10|35->10|35->10|35->10|36->11
                  -- GENERATED --
              */
          