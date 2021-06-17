
package views.html.account

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
  def apply/*5.2*/(userService: UserService)(implicit request: AuthenticatedRequest[Any], messagesApi: MessagesApi, webJarAssets: WebJarAssets):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.127*/("""

"""),_display_(/*7.2*/main(userService, messagesApi("playauthenticate.verify.account.title"))/*7.73*/ {_display_(Seq[Any](format.raw/*7.75*/("""
	"""),format.raw/*8.2*/("""<h1>"""),_display_(/*8.7*/messagesApi("playauthenticate.verify.account.title")),format.raw/*8.59*/("""</h1>
	<p>"""),_display_(/*9.6*/messagesApi("playauthenticate.verify.account.before")),format.raw/*9.59*/(""" """),format.raw/*9.60*/("""<a href=""""),_display_(/*9.70*/routes/*9.76*/.Account.verifyEmail),format.raw/*9.96*/("""">"""),_display_(/*9.99*/messagesApi("playauthenticate.verify.account.first")),format.raw/*9.151*/("""</a>.<br/></p>
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
object unverified extends unverified_Scope0.unverified_Scope1.unverified
              /*
                  -- GENERATED --
                  DATE: Tue May 30 13:58:27 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/account/unverified.scala.html
                  HASH: a8a6532135c84cb3ade9c47dccd694a8d2c5b2f6
                  MATRIX: 721->92|942->217|970->220|1049->291|1088->293|1116->295|1146->300|1218->352|1254->363|1327->416|1355->417|1391->427|1405->433|1445->453|1474->456|1547->508|1593->524
                  LINES: 25->5|30->5|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|34->9|34->9|34->9|34->9|34->9|35->10
                  -- GENERATED --
              */
          