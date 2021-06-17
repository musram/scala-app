
package views.html.account

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ask_link_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object ask_link_Scope1 {
import services.UserService
import views.form._
import play.api.mvc._
import be.objectify.deadbolt.scala._

class ask_link extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[UserService,Form[Accept],com.feth.play.module.pa.user.AuthUser,AuthenticatedRequest[Any],MessagesApi,Messages,WebJarAssets,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(userService: UserService, acceptForm: Form[Accept], newAccount: com.feth.play.module.pa.user.AuthUser)(implicit request: AuthenticatedRequest[Any], messagesApi: MessagesApi, messages: Messages, webJarAssets: WebJarAssets):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import b3.vertical.fieldConstructor
import com.feth.play.module.pa.views.html._
def /*12.2*/label/*12.7*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*12.11*/("""
	"""),_display_(/*13.3*/_providerIcon(newAccount.getProvider())),format.raw/*13.42*/(""" """),_display_(/*13.44*/messagesApi("playauthenticate.link.account.question", newAccount)),format.raw/*13.109*/("""
""")))};
Seq[Any](format.raw/*6.224*/("""

"""),format.raw/*11.1*/("""
"""),format.raw/*14.2*/("""

"""),_display_(/*16.2*/main(userService, messagesApi("playauthenticate.link.account.title"))/*16.71*/ {_display_(Seq[Any](format.raw/*16.73*/("""
    """),_display_(/*17.6*/if(acceptForm.hasGlobalErrors)/*17.36*/ {_display_(Seq[Any](format.raw/*17.38*/("""
        """),format.raw/*18.9*/("""<p class="alert alert-danger">"""),_display_(/*18.40*/acceptForm/*18.50*/.globalError.get.message),format.raw/*18.74*/("""</p>
    """)))}),format.raw/*19.6*/("""
    """),format.raw/*20.5*/("""<div class="row">
        <div class="col-sm-6 col-sm-offset-3 form-box">
            <div class="form-top">
                <div class="form-top-left">
                    <h3>"""),_display_(/*24.26*/messagesApi("playauthenticate.link.account.title")),format.raw/*24.76*/("""</h3>
                </div>
                <div class="form-top-right">
                    <i class="fa fa-key"></i>
                </div>
            </div>
            <div class="form-bottom">
                """),_display_(/*31.18*/b3/*31.20*/.vertical.form(routes.Account.doLink)/*31.57*/ { implicit vfc =>_display_(Seq[Any](format.raw/*31.75*/("""
                    """),_display_(/*32.22*/b3/*32.24*/.radio(
                        acceptForm("accept"),
                        options = Seq(
                            "true"-> messagesApi("playauthenticate.link.account.true"),
                            "false"->messagesApi("playauthenticate.link.account.false")
                        ),
                        '_label -> label, '_showConstraints -> false)),format.raw/*38.70*/("""
                    """),_display_(/*39.22*/b3/*39.24*/.submit('class -> "btn btn-default")/*39.60*/ {_display_(Seq[Any](format.raw/*39.62*/("""
                        """),_display_(/*40.26*/messagesApi("playauthenticate.link.account.ok")),format.raw/*40.73*/("""
                    """)))}),format.raw/*41.22*/("""
                """)))}),format.raw/*42.18*/("""
            """),format.raw/*43.13*/("""</div>
        </div>
    </div>
""")))}),format.raw/*46.2*/("""
"""))
      }
    }
  }

  def render(userService:UserService,acceptForm:Form[Accept],newAccount:com.feth.play.module.pa.user.AuthUser,request:AuthenticatedRequest[Any],messagesApi:MessagesApi,messages:Messages,webJarAssets:WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(userService,acceptForm,newAccount)(request,messagesApi,messages,webJarAssets)

  def f:((UserService,Form[Accept],com.feth.play.module.pa.user.AuthUser) => (AuthenticatedRequest[Any],MessagesApi,Messages,WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (userService,acceptForm,newAccount) => (request,messagesApi,messages,webJarAssets) => apply(userService,acceptForm,newAccount)(request,messagesApi,messages,webJarAssets)

  def ref: this.type = this

}


}
}

/**/
object ask_link extends ask_link_Scope0.ask_link_Scope1.ask_link
              /*
                  -- GENERATED --
                  DATE: Tue May 30 13:58:27 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/account/ask_link.scala.html
                  HASH: 9e049facfc8a0d90110c68696047f99c6b6ff4fe
                  MATRIX: 795->113|1191->438|1204->443|1285->447|1314->450|1374->489|1403->491|1490->556|1532->335|1561->436|1589->558|1618->561|1696->630|1736->632|1768->638|1807->668|1847->670|1883->679|1941->710|1960->720|2005->744|2045->754|2077->759|2282->937|2353->987|2597->1204|2608->1206|2654->1243|2710->1261|2759->1283|2770->1285|3156->1650|3205->1672|3216->1674|3261->1710|3301->1712|3354->1738|3422->1785|3475->1807|3524->1825|3565->1838|3629->1872
                  LINES: 26->6|32->12|32->12|34->12|35->13|35->13|35->13|35->13|37->6|39->11|40->14|42->16|42->16|42->16|43->17|43->17|43->17|44->18|44->18|44->18|44->18|45->19|46->20|50->24|50->24|57->31|57->31|57->31|57->31|58->32|58->32|64->38|65->39|65->39|65->39|65->39|66->40|66->40|67->41|68->42|69->43|72->46
                  -- GENERATED --
              */
          