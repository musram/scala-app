
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signup_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object signup_Scope1 {
import services.UserService
import views.form._
import play.api.mvc._
import play.api.data._
import be.objectify.deadbolt.scala.AuthenticatedRequest
import com.nappin.play.recaptcha.WidgetHelper

class signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template8[com.feth.play.module.pa.PlayAuthenticate,UserService,Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},AuthenticatedRequest[Any],MessagesApi,Messages,WebJarAssets,WidgetHelper,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*8.2*/(playAuth: com.feth.play.module.pa.PlayAuthenticate, userService: UserService, signupForm: Form[_])(implicit request: AuthenticatedRequest[Any], messagesApi: MessagesApi, messages: Messages, webJarAssets: WebJarAssets, widgetHelper: WidgetHelper):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import b3.vertical.fieldConstructor
import com.feth.play.module.pa.views.html._

Seq[Any](format.raw/*8.248*/("""

"""),format.raw/*13.1*/("""
"""),_display_(/*14.2*/main(userService, messagesApi("playauthenticate.signup.title"),"signup")/*14.74*/ {_display_(Seq[Any](format.raw/*14.76*/("""
    """),_display_(/*15.6*/if(signupForm.hasGlobalErrors)/*15.36*/ {_display_(Seq[Any](format.raw/*15.38*/("""
        """),format.raw/*16.9*/("""<p class="alert alert-danger">"""),_display_(/*16.40*/signupForm/*16.50*/.globalError.get.message),format.raw/*16.74*/("""</p>
    """)))}),format.raw/*17.6*/("""
    """),format.raw/*18.5*/("""<div class="inner-bg">
        <div class="container">
            <div class="row">
                <div class="col-sm-6 col-sm-offset-3 form-box">
                    <div class="form-top">
                        <div class="form-top-left">
                            <h3>"""),_display_(/*24.34*/messagesApi("playauthenticate.signup.title")),format.raw/*24.78*/("""</h3>
                            <p>Enter your new account information to sign up:</p>
                        </div>
                        <div class="form-top-right">
                            <i class="fa fa-key"></i>
                        </div>
                    </div>
                    <div class="form-bottom">
                        """),format.raw/*32.62*/("""
                        """),_display_(/*33.26*/b3/*33.28*/.vertical.form(routes.Application.doSignup, 'class -> "form-vertical", 'role -> "form")/*33.115*/ { implicit vfc =>_display_(Seq[Any](format.raw/*33.133*/("""
                            """),_display_(/*34.30*/b3/*34.32*/.inputWrapped("text", signupForm("name"), '_label -> messagesApi("playauthenticate.signup.name"), '_showConstraints -> false, 'placeholder -> "John Doe")/*34.185*/  { input =>_display_(Seq[Any](format.raw/*34.197*/("""
                                """),format.raw/*35.33*/("""<div class="input-group">
                                    <span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
                                    """),_display_(/*37.38*/input),format.raw/*37.43*/("""
                                """),format.raw/*38.33*/("""</div>
                            """)))}),format.raw/*39.30*/("""
                            """),_display_(/*40.30*/b3/*40.32*/.inputWrapped("email", signupForm("email"), '_label -> messagesApi("playauthenticate.login.email.placeholder"), '_showConstraints -> false, 'placeholder -> "example@mail.com")/*40.207*/ { input =>_display_(Seq[Any](format.raw/*40.218*/("""
                                """),format.raw/*41.33*/("""<div class="input-group">
                                    <span class="input-group-addon"><span class="glyphicon glyphicon-envelope"></span></span>
                                    """),_display_(/*43.38*/input),format.raw/*43.43*/("""
                                """),format.raw/*44.33*/("""</div>
                            """)))}),format.raw/*45.30*/("""
                            """),_display_(/*46.30*/b3/*46.32*/.inputWrapped("password", signupForm("password"), '_label -> messagesApi("playauthenticate.login.password.placeholder"), '_showConstraints -> false, 'placeholder -> "Password")/*46.208*/ { input =>_display_(Seq[Any](format.raw/*46.219*/("""
                                """),format.raw/*47.33*/("""<div class="input-group">
                                    <span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
                                    """),_display_(/*49.38*/input),format.raw/*49.43*/("""
                                """),format.raw/*50.33*/("""</div>
                            """)))}),format.raw/*51.30*/("""
                            """),_display_(/*52.30*/b3/*52.32*/.inputWrapped("password", signupForm("repeatPassword"), '_label -> messagesApi("playauthenticate.login.password.repeat"), '_showConstraints -> false, 'placeholder -> "Password", '_error -> signupForm.error("password"))/*52.250*/ { input =>_display_(Seq[Any](format.raw/*52.261*/("""
                                """),format.raw/*53.33*/("""<div class="input-group">
                                    <span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
                                    """),_display_(/*55.38*/input),format.raw/*55.43*/("""
                                """),format.raw/*56.33*/("""</div>
                            """)))}),format.raw/*57.30*/("""
                            """),_display_(/*58.30*/_recaptchaFieldPartial(form=signupForm, fieldName="playauthenticate.signup.captcha")/*58.114*/(widgetHelper, request.asInstanceOf[Request[AnyContent]], messages)),format.raw/*58.181*/("""
                            """),_display_(/*59.30*/b3/*59.32*/.submit('class -> "btn btn-default")/*59.68*/ {_display_(Seq[Any](format.raw/*59.70*/("""
                                """),_display_(/*60.34*/messagesApi("playauthenticate.signup.now")),format.raw/*60.76*/("""
                            """)))}),format.raw/*61.30*/("""
                        """)))}),format.raw/*62.26*/("""
                    """),format.raw/*63.21*/("""</div>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6 col-sm-offset-3 social-login">
                    <div class="social-login-buttons">
                        """),_display_(/*69.26*/messagesApi("playauthenticate.login.oauth")),format.raw/*69.69*/("""
                        """),format.raw/*70.66*/("""
                        """),_display_(/*71.26*/_providerPartial(playAuth, skipCurrent=false)),format.raw/*71.71*/("""
                    """),format.raw/*72.21*/("""</div>
                </div>
            </div>
        </div>
    </div>
""")))}),format.raw/*77.2*/("""
"""))
      }
    }
  }

  def render(playAuth:com.feth.play.module.pa.PlayAuthenticate,userService:UserService,signupForm:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},request:AuthenticatedRequest[Any],messagesApi:MessagesApi,messages:Messages,webJarAssets:WebJarAssets,widgetHelper:WidgetHelper): play.twirl.api.HtmlFormat.Appendable = apply(playAuth,userService,signupForm)(request,messagesApi,messages,webJarAssets,widgetHelper)

  def f:((com.feth.play.module.pa.PlayAuthenticate,UserService,Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}) => (AuthenticatedRequest[Any],MessagesApi,Messages,WebJarAssets,WidgetHelper) => play.twirl.api.HtmlFormat.Appendable) = (playAuth,userService,signupForm) => (request,messagesApi,messages,webJarAssets,widgetHelper) => apply(playAuth,userService,signupForm)(request,messagesApi,messages,webJarAssets,widgetHelper)

  def ref: this.type = this

}


}
}

/**/
object signup extends signup_Scope0.signup_Scope1.signup
              /*
                  -- GENERATED --
                  DATE: Tue May 30 13:58:26 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/signup.scala.html
                  HASH: 20532abfe89707a32faf88937e9309fe610a890a
                  MATRIX: 951->203|1388->449|1417->550|1445->552|1526->624|1566->626|1598->632|1637->662|1677->664|1713->673|1771->704|1790->714|1835->738|1875->748|1907->753|2211->1030|2276->1074|2658->1465|2711->1491|2722->1493|2819->1580|2876->1598|2933->1628|2944->1630|3107->1783|3158->1795|3219->1828|3431->2013|3457->2018|3518->2051|3585->2087|3642->2117|3653->2119|3838->2294|3888->2305|3949->2338|4165->2527|4191->2532|4252->2565|4319->2601|4376->2631|4387->2633|4573->2809|4623->2820|4684->2853|4896->3038|4922->3043|4983->3076|5050->3112|5107->3142|5118->3144|5346->3362|5396->3373|5457->3406|5669->3591|5695->3596|5756->3629|5823->3665|5880->3695|5974->3779|6063->3846|6120->3876|6131->3878|6176->3914|6216->3916|6277->3950|6340->3992|6401->4022|6458->4048|6507->4069|6761->4296|6825->4339|6878->4405|6931->4431|6997->4476|7046->4497|7152->4573
                  LINES: 30->8|37->8|39->13|40->14|40->14|40->14|41->15|41->15|41->15|42->16|42->16|42->16|42->16|43->17|44->18|50->24|50->24|58->32|59->33|59->33|59->33|59->33|60->34|60->34|60->34|60->34|61->35|63->37|63->37|64->38|65->39|66->40|66->40|66->40|66->40|67->41|69->43|69->43|70->44|71->45|72->46|72->46|72->46|72->46|73->47|75->49|75->49|76->50|77->51|78->52|78->52|78->52|78->52|79->53|81->55|81->55|82->56|83->57|84->58|84->58|84->58|85->59|85->59|85->59|85->59|86->60|86->60|87->61|88->62|89->63|95->69|95->69|96->70|97->71|97->71|98->72|103->77
                  -- GENERATED --
              */
          