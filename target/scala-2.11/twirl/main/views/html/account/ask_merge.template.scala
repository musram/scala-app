
package views.html.account

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ask_merge_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object ask_merge_Scope1 {
import services.UserService
import views.form._
import play.api.mvc._
import be.objectify.deadbolt.scala._

class ask_merge extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template8[UserService,Form[Accept],com.feth.play.module.pa.user.AuthUser,com.feth.play.module.pa.user.AuthUser,AuthenticatedRequest[Any],MessagesApi,Messages,WebJarAssets,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(userService: UserService, acceptForm: Form[Accept], aUser: com.feth.play.module.pa.user.AuthUser, bUser: com.feth.play.module.pa.user.AuthUser)(implicit request: AuthenticatedRequest[Any], messagesApi: MessagesApi, messages: Messages, webJarAssets: WebJarAssets):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import b3.vertical.fieldConstructor
import com.feth.play.module.pa.views.html._
def /*12.2*/label/*12.7*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*12.11*/("""
	"""),_display_(/*13.3*/messagesApi("playauthenticate.merge.accounts.question", aUser, bUser)),format.raw/*13.72*/("""
""")))};
Seq[Any](format.raw/*6.265*/("""

"""),format.raw/*11.1*/("""
"""),format.raw/*14.2*/("""

"""),_display_(/*16.2*/main(userService, messagesApi("playauthenticate.merge.accounts.title"))/*16.73*/ {_display_(Seq[Any](format.raw/*16.75*/("""
    """),_display_(/*17.6*/if(acceptForm.hasGlobalErrors)/*17.36*/ {_display_(Seq[Any](format.raw/*17.38*/("""
        """),format.raw/*18.9*/("""<p class="alert alert-danger">"""),_display_(/*18.40*/acceptForm/*18.50*/.globalError.get.message),format.raw/*18.74*/("""</p>
    """)))}),format.raw/*19.6*/("""
    """),format.raw/*20.5*/("""<div class="row">
        <div class="col-sm-6 col-sm-offset-3 form-box">
            <div class="form-top">
                <div class="form-top-left">
                    <h3>"""),_display_(/*24.26*/messagesApi("playauthenticate.merge.accounts.title")),format.raw/*24.78*/("""</h3>
                </div>
                <div class="form-top-right">
                    <i class="fa fa-key"></i>
                </div>
            </div>
            <div class="form-bottom">
                """),_display_(/*31.18*/b3/*31.20*/.vertical.form(routes.Account.doMerge)/*31.58*/ { implicit vfc =>_display_(Seq[Any](format.raw/*31.76*/("""
                    """),_display_(/*32.22*/b3/*32.24*/.radio(
                        acceptForm("accept"),
                        options = Seq(
                            "true"-> messagesApi("playauthenticate.merge.accounts.true"),
                            "false"->messagesApi("playauthenticate.merge.accounts.false")
                        ),
                        '_label -> label,
                        '_showConstraints -> false)),format.raw/*39.52*/("""
                    """),_display_(/*40.22*/b3/*40.24*/.submit('class -> "btn btn-default")/*40.60*/ {_display_(Seq[Any](format.raw/*40.62*/("""
                        """),_display_(/*41.26*/messagesApi("playauthenticate.merge.accounts.ok")),format.raw/*41.75*/("""
                    """)))}),format.raw/*42.22*/("""
                """)))}),format.raw/*43.18*/("""
            """),format.raw/*44.13*/("""</div>
        </div>
    </div>
""")))}),format.raw/*47.2*/("""
"""))
      }
    }
  }

  def render(userService:UserService,acceptForm:Form[Accept],aUser:com.feth.play.module.pa.user.AuthUser,bUser:com.feth.play.module.pa.user.AuthUser,request:AuthenticatedRequest[Any],messagesApi:MessagesApi,messages:Messages,webJarAssets:WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(userService,acceptForm,aUser,bUser)(request,messagesApi,messages,webJarAssets)

  def f:((UserService,Form[Accept],com.feth.play.module.pa.user.AuthUser,com.feth.play.module.pa.user.AuthUser) => (AuthenticatedRequest[Any],MessagesApi,Messages,WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (userService,acceptForm,aUser,bUser) => (request,messagesApi,messages,webJarAssets) => apply(userService,acceptForm,aUser,bUser)(request,messagesApi,messages,webJarAssets)

  def ref: this.type = this

}


}
}

/**/
object ask_merge extends ask_merge_Scope0.ask_merge_Scope1.ask_merge
              /*
                  -- GENERATED --
                  DATE: Tue May 30 13:58:27 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/account/ask_merge.scala.html
                  HASH: 97eaa7786e6d21ac62ab7b6a0025838ada20dd9f
                  MATRIX: 836->113|1273->479|1286->484|1367->488|1396->491|1486->560|1528->376|1557->477|1585->562|1614->565|1694->636|1734->638|1766->644|1805->674|1845->676|1881->685|1939->716|1958->726|2003->750|2043->760|2075->765|2280->943|2353->995|2597->1212|2608->1214|2655->1252|2711->1270|2760->1292|2771->1294|3185->1687|3234->1709|3245->1711|3290->1747|3330->1749|3383->1775|3453->1824|3506->1846|3555->1864|3596->1877|3660->1911
                  LINES: 26->6|32->12|32->12|34->12|35->13|35->13|37->6|39->11|40->14|42->16|42->16|42->16|43->17|43->17|43->17|44->18|44->18|44->18|44->18|45->19|46->20|50->24|50->24|57->31|57->31|57->31|57->31|58->32|58->32|65->39|66->40|66->40|66->40|66->40|67->41|67->41|68->42|69->43|70->44|73->47
                  -- GENERATED --
              */
          