
package views.html.account.signup

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object unverified_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object unverified_Scope1 {
import services.UserService
import play.api.mvc._
import be.objectify.deadbolt.scala._

class unverified extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[UserService,AuthenticatedRequest[Any],MessagesApi,WebJarAssets,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(userProvider: UserService)(implicit request: AuthenticatedRequest[Any], messagesApi: MessagesApi, webJarAssets: WebJarAssets):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.128*/("""

"""),_display_(/*7.2*/main(userProvider, messagesApi("playauthenticate.verify.email.title"))/*7.72*/ {_display_(Seq[Any](format.raw/*7.74*/("""
	"""),format.raw/*8.2*/("""<h1>"""),_display_(/*8.7*/messagesApi("playauthenticate.verify.email.title")),format.raw/*8.57*/("""</h1>
	<p>
		"""),_display_(/*10.4*/messagesApi("playauthenticate.verify.email.requirement")),format.raw/*10.60*/("""</br>
		"""),_display_(/*11.4*/messagesApi("playauthenticate.verify.email.cta")),format.raw/*11.52*/("""
		"""),format.raw/*12.3*/("""<br/>
	</p>
""")))}),format.raw/*14.2*/("""
"""))
      }
    }
  }

  def render(userProvider:UserService,request:AuthenticatedRequest[Any],messagesApi:MessagesApi,webJarAssets:WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(userProvider)(request,messagesApi,webJarAssets)

  def f:((UserService) => (AuthenticatedRequest[Any],MessagesApi,WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (userProvider) => (request,messagesApi,webJarAssets) => apply(userProvider)(request,messagesApi,webJarAssets)

  def ref: this.type = this

}


}
}

/**/
object unverified extends unverified_Scope0.unverified_Scope1.unverified
              /*
                  -- GENERATED --
                  DATE: Tue May 30 13:58:27 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/account/signup/unverified.scala.html
                  HASH: ee29807276cef651bf2a13466cf7217970e2df43
                  MATRIX: 728->92|950->218|978->221|1056->291|1095->293|1123->295|1153->300|1223->350|1263->364|1340->420|1375->429|1444->477|1474->480|1517->493
                  LINES: 25->5|30->5|32->7|32->7|32->7|33->8|33->8|33->8|35->10|35->10|36->11|36->11|37->12|39->14
                  -- GENERATED --
              */
          