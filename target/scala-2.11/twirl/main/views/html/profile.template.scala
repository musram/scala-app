
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profile_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object profile_Scope1 {
import services.UserService
import services.PluggableUserService._
import generated._
import generated.Tables._
import play.api.mvc._
import be.objectify.deadbolt.scala._

class profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[com.feth.play.module.pa.PlayAuthenticate,UserRow,AuthenticatedRequest[Any],MessagesApi,UserService,WebJarAssets,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*8.2*/(playAuth: com.feth.play.module.pa.PlayAuthenticate, localUser: UserRow)(implicit request: AuthenticatedRequest[Any], messagesApi: MessagesApi, userService: UserService, webJarAssets: WebJarAssets):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import com.feth.play.module.pa.views.html._
import utils.FormatUtils._

Seq[Any](format.raw/*8.199*/("""

"""),format.raw/*12.1*/("""
"""),_display_(/*13.2*/main(userService, messagesApi("playauthenticate.profile.title"),"profile")/*13.76*/ {_display_(Seq[Any](format.raw/*13.78*/("""

"""),format.raw/*15.1*/("""<div class="block block-rounded block-bordered">
    <div class="block-header bg-gray-lighter">
        <ul class="block-options">
            <li>
                <button type="button"><i class="si si-settings"></i></button>
            </li>
        </ul>
        <h3 class="block-title"><h1>"""),_display_(/*22.38*/messagesApi("playauthenticate.profile.title")),format.raw/*22.83*/("""</h1>
        </h3>
    </div>
    <div class="block-content">
        <div class="row text-center">
            <div class="col-sm-6 col-lg-3">
                <div class="block">
                    <div class="block-content">
                        <p><code>Your name is</code></p>
                    </div>
                </div>
            </div>
            <div class="col-sm-6 col-lg-3">
                <div class="block">
                    <div class="block-content">
                        <p>"""),_display_(/*37.29*/localUser/*37.38*/.username),format.raw/*37.47*/("""</p>
                    </div>
                </div>
            </div>
        </div>
        <div class="row text-center">
            <div class="col-sm-6 col-lg-3">
                <div class="block">
                    <div class="block-content">
                        <p><code>your email address is</code></p>
                    </div>
                </div>
            </div>
            <div class="col-sm-6 col-lg-3">
                <div class="block">
                    <div class="block-content">
                        <p>"""),_display_(/*53.29*/if(!localUser.email)/*53.49*/ {_display_(Seq[Any](format.raw/*53.51*/("""<em>&lt;unknown&gt;</em>.""")))}/*53.78*/else/*53.83*/{_display_(Seq[Any](format.raw/*53.84*/("""
                            """),_display_(/*54.30*/localUser/*54.39*/.email),format.raw/*54.45*/(""".
                            <i>
                                """),_display_(/*56.34*/if(!localUser.emailValidated && localUser.email)/*56.82*/ {_display_(Seq[Any](format.raw/*56.84*/("""
                                """),format.raw/*57.33*/("""(<a href=""""),_display_(/*57.44*/routes/*57.50*/.Account.verifyEmail),format.raw/*57.70*/("""">unverified - click to verify</a>)
                                """)))}/*58.35*/else/*58.40*/{_display_(Seq[Any](format.raw/*58.41*/("""
                                """),format.raw/*59.33*/("""(verified)
                                """)))}),format.raw/*60.34*/("""</i>
                            """)))}),format.raw/*61.30*/("""
                        """),format.raw/*62.25*/("""</p>
                    </div>
                </div>
            </div>
        </div>
        <div>
            """),_display_(/*68.14*/if(localUser.firstName && localUser.lastName)/*68.59*/ {_display_(Seq[Any](format.raw/*68.61*/("""
                """),format.raw/*69.17*/("""<div class="row text-center">
                    <div class="col-sm-6 col-lg-3">
                        <div class="block">
                            <div class="block-content">
                                <p><code>our first name is</code></p>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6 col-lg-3">
                        <div class="block">
                            <div class="block-content">
                                <p>"""),_display_(/*80.37*/localUser/*80.46*/.firstName),format.raw/*80.56*/("""></p>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row text-center">
                    <div class="col-sm-6 col-lg-3">
                        <div class="block">
                            <div class="block-content">
                                <p><code>your last name is</code></p>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6 col-lg-3">
                        <div class="block">
                            <div class="block-content">
                                <p>"""),_display_(/*96.37*/localUser/*96.46*/.lastName),format.raw/*96.55*/("""></p>
                            </div>
                        </div>
                    </div>
                </div>
            """)))}),format.raw/*101.14*/("""
        """),format.raw/*102.9*/("""</div>
        """),_display_(/*103.10*/play/*103.14*/.core.j.JavaHelpers.withContext(request)/*103.54*/ { jContext =>_display_(Seq[Any](format.raw/*103.68*/("""
        """),_display_(/*104.10*/currentAuth(playAuth)/*104.31*/ { auth =>_display_(Seq[Any](format.raw/*104.41*/("""
            """),format.raw/*105.13*/("""<div class="row text-center">
                <div class="col-sm-6 col-lg-3">
                    <div class="block">
                        <div class="block-content">
                            <p><code>"""),_display_(/*109.39*/messagesApi("playauthenticate.profile.logged")),format.raw/*109.85*/("""</code></p>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6 col-lg-3">
                    <div class="block">
                        <div class="block-content">
                            <p>"""),_display_(/*116.33*/_providerIcon(auth.getProvider())),format.raw/*116.66*/("""</p>
                        </div>
                    </div>
                </div>
            </div>
            """),_display_(/*121.14*/if(auth.expires() != -1)/*121.38*/{_display_(Seq[Any](format.raw/*121.39*/("""
                """),format.raw/*122.17*/("""<div class="row text-center">
                    <div class="col-sm-6 col-lg-3">
                        <div class="block">
                            <div class="block-content">
                                <p><code>Your user ID is</code></p>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6 col-lg-3">
                        <div class="block">
                            <div class="block-content">
                                <p>"""),_display_(/*133.37*/auth/*133.41*/.getId()),format.raw/*133.49*/("""</p>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row text-center">
                    <div class="col-sm-6 col-lg-3">
                        <div class="block">
                            <div class="block-content">
                                <p><code>and expires at</code></p>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6 col-lg-3">
                        <div class="block">
                            <div class="block-content">
                                <p>"""),_display_(/*149.37*/auth/*149.41*/.expires()),format.raw/*149.51*/("""</p>
                            </div>
                        </div>
                    </div>
                </div>

            """)))}/*155.15*/else/*155.20*/{_display_(Seq[Any](format.raw/*155.21*/("""
                """),format.raw/*156.17*/("""<div class="row text-center">
                    <div class="col-sm-6 col-lg-3">
                        <div class="block">
                            <div class="block-content">
                                <p>"""),_display_(/*160.37*/messagesApi("playauthenticate.profile.session_endless")),format.raw/*160.92*/("""</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-6 col-lg-3">
                        <div class="block">
                            <div class="block-content">
                                <p>"""),_display_(/*167.37*/auth/*167.41*/.getId()),format.raw/*167.49*/("""></p>
                            </div>
                        </div>
                    </div>
                </div>


            """)))}),format.raw/*174.14*/("""
        """)))}),format.raw/*175.10*/("""
        """)))}),format.raw/*176.10*/("""
        """),format.raw/*177.9*/("""<div class="row text-center">
            <div class="col-sm-6 col-lg-3">
                <div class="block">
                    <div class="block-content">
                        <p><a href=""""),_display_(/*181.38*/routes/*181.44*/.Account.changePassword),format.raw/*181.67*/("""">"""),_display_(/*181.70*/messagesApi("playauthenticate.profile.password_change")),format.raw/*181.125*/("""</a></p>
                    </div>
                </div>
            </div>
        </div>


    </div>
</div>

""")))}),format.raw/*191.2*/("""


"""))
      }
    }
  }

  def render(playAuth:com.feth.play.module.pa.PlayAuthenticate,localUser:UserRow,request:AuthenticatedRequest[Any],messagesApi:MessagesApi,userService:UserService,webJarAssets:WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(playAuth,localUser)(request,messagesApi,userService,webJarAssets)

  def f:((com.feth.play.module.pa.PlayAuthenticate,UserRow) => (AuthenticatedRequest[Any],MessagesApi,UserService,WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (playAuth,localUser) => (request,messagesApi,userService,webJarAssets) => apply(playAuth,localUser)(request,messagesApi,userService,webJarAssets)

  def ref: this.type = this

}


}
}

/**/
object profile extends profile_Scope0.profile_Scope1.profile
              /*
                  -- GENERATED --
                  DATE: Wed May 31 11:30:25 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/profile.scala.html
                  HASH: 1216934f7bba26c56dc50e912011461b9b6d62d0
                  MATRIX: 837->179|1200->376|1229->451|1257->453|1340->527|1380->529|1409->531|1731->826|1797->871|2335->1382|2353->1391|2383->1400|2956->1946|2985->1966|3025->1968|3070->1995|3083->2000|3122->2001|3179->2031|3197->2040|3224->2046|3318->2113|3375->2161|3415->2163|3476->2196|3514->2207|3529->2213|3570->2233|3658->2303|3671->2308|3710->2309|3771->2342|3846->2386|3911->2420|3964->2445|4107->2561|4161->2606|4201->2608|4246->2625|4806->3158|4824->3167|4855->3177|5553->3848|5571->3857|5601->3866|5768->4001|5805->4010|5849->4026|5863->4030|5913->4070|5966->4084|6004->4094|6035->4115|6084->4125|6126->4138|6362->4346|6430->4392|6723->4657|6778->4690|6924->4808|6958->4832|6998->4833|7044->4850|7603->5381|7617->5385|7647->5393|8342->6060|8356->6064|8388->6074|8543->6210|8557->6215|8597->6216|8643->6233|8889->6451|8966->6506|9280->6792|9294->6796|9324->6804|9493->6941|9535->6951|9577->6961|9614->6970|9837->7165|9853->7171|9898->7194|9929->7197|10007->7252|10153->7367
                  LINES: 28->8|34->8|36->12|37->13|37->13|37->13|39->15|46->22|46->22|61->37|61->37|61->37|77->53|77->53|77->53|77->53|77->53|77->53|78->54|78->54|78->54|80->56|80->56|80->56|81->57|81->57|81->57|81->57|82->58|82->58|82->58|83->59|84->60|85->61|86->62|92->68|92->68|92->68|93->69|104->80|104->80|104->80|120->96|120->96|120->96|125->101|126->102|127->103|127->103|127->103|127->103|128->104|128->104|128->104|129->105|133->109|133->109|140->116|140->116|145->121|145->121|145->121|146->122|157->133|157->133|157->133|173->149|173->149|173->149|179->155|179->155|179->155|180->156|184->160|184->160|191->167|191->167|191->167|198->174|199->175|200->176|201->177|205->181|205->181|205->181|205->181|205->181|215->191
                  -- GENERATED --
              */
          