
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object login_Scope1 {
import services.UserService
import play.api.mvc._
import play.api.data._
import be.objectify.deadbolt.scala.AuthenticatedRequest
import views.form._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[com.feth.play.module.pa.PlayAuthenticate,UserService,Form[Login],AuthenticatedRequest[Any],MessagesApi,Messages,WebJarAssets,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(playAuth: com.feth.play.module.pa.PlayAuthenticate, userService: UserService, loginForm: Form[Login])(implicit request: AuthenticatedRequest[Any], messagesApi: MessagesApi, messages: Messages, webJarAssets: WebJarAssets):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import b3.vertical.fieldConstructor
import com.feth.play.module.pa.views.html._

Seq[Any](format.raw/*7.223*/("""

"""),format.raw/*12.1*/("""
"""),_display_(/*13.2*/main(userService, messagesApi("playauthenticate.login.title"),"login")/*13.72*/ {_display_(Seq[Any](format.raw/*13.74*/("""
    """),_display_(/*14.6*/if(loginForm.hasGlobalErrors)/*14.35*/ {_display_(Seq[Any](format.raw/*14.37*/("""
        """),format.raw/*15.9*/("""<p class="alert alert-danger">"""),_display_(/*15.40*/loginForm/*15.49*/.globalError.get.message),format.raw/*15.73*/("""</p>
    """)))}),format.raw/*16.6*/("""
    """),format.raw/*17.5*/("""<!-- Login Content -->
    <div class="content overflow-hidden">
        <div class="row">
            <div class="col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3 col-lg-4 col-lg-offset-4">
                <!-- Login Block -->
                <div class="block block-themed animated fadeIn">
                    <div class="block-header bg-primary">
                        <ul class="block-options">
                            <li>
                                <a href="javascript:void(0);" onclick="window.location.href = jsRoutes.controllers.Signup.forgotPassword($('#email').val() || null).absoluteURL();">"""),_display_(/*26.182*/messagesApi("playauthenticate.login.forgot.password")),format.raw/*26.235*/("""</a>
                            </li>
                        </ul>
                        <h3 class="block-title">Login</h3>
                    </div>
                    <div class="block-content block-content-full block-content-narrow">
                        <!-- Login Title -->
                        <h1 class="h2 font-w600 push-30-t push-5">OneUI</h1>
                        <p>Welcome, please login.</p>
                        <!-- END Login Title -->

                        <!-- Login Form -->
                        <!-- jQuery Validation (.js-validation-login class is initialized in js/pages/base_pages_login.js) -->
                        <!-- For more examples you can check out https://github.com/jzaefferer/jquery-validation -->
                        <form class="js-validation-login form-horizontal push-30-t push-50" action=""""),_display_(/*40.102*/routes/*40.108*/.Application.doLogin),format.raw/*40.128*/("""" method="post">
                            """),_display_(/*41.30*/CSRF/*41.34*/.formField),format.raw/*41.44*/("""
                            """),format.raw/*42.29*/("""<div class="form-group">
                                <div class="col-xs-12">
                                    <div class="form-material form-material-primary floating">
                                        <input class="form-control" type="email" id="login-username" name="email">
                                        <label for="login-username">Email</label>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-xs-12">
                                    <div class="form-material form-material-primary floating">
                                        <input class="form-control" type="password" id="login-password" name="password">
                                        <label for="login-password">Password</label>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-xs-12">
                                    <label class="css-input switch switch-sm switch-primary">
                                        <input type="checkbox" id="login-remember-me" name="login-remember-me"><span></span> Remember Me?
                                    </label>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-xs-12 col-sm-6 col-md-4">
                                    <button class="btn btn-block btn-primary" type="submit"><i class="si si-login pull-right"></i> Log in</button>
                                </div>
                            </div>
                        </form>
                        <!-- END Login Form -->
                    </div>
                </div>
                <!-- END Login Block -->
            </div>
        </div>
    </div>
    <!-- END Login Content -->


<!-- Reminder Footer -->
<div class="push-10-t text-center animated fadeInUp">
    <small class="text-muted font-w600"><span class="js-year-copy"></span> &copy; SMYD 1.0</small>
</div>
<!-- END Reminder Footer -->


<!-- Page JS Plugins -->
<script type="text/javascript" src=""""),_display_(/*89.38*/routes/*89.44*/.Assets.versioned("js/plugins/jquery-validation/jquery.validate.min.js")),format.raw/*89.116*/(""""></script>

<script type="text/javascript" src=""""),_display_(/*91.38*/routes/*91.44*/.Assets.versioned("js/pages/base_pages_login.js")),format.raw/*91.93*/(""""></script>
""")))}),format.raw/*92.2*/("""

"""))
      }
    }
  }

  def render(playAuth:com.feth.play.module.pa.PlayAuthenticate,userService:UserService,loginForm:Form[Login],request:AuthenticatedRequest[Any],messagesApi:MessagesApi,messages:Messages,webJarAssets:WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(playAuth,userService,loginForm)(request,messagesApi,messages,webJarAssets)

  def f:((com.feth.play.module.pa.PlayAuthenticate,UserService,Form[Login]) => (AuthenticatedRequest[Any],MessagesApi,Messages,WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (playAuth,userService,loginForm) => (request,messagesApi,messages,webJarAssets) => apply(playAuth,userService,loginForm)(request,messagesApi,messages,webJarAssets)

  def ref: this.type = this

}


}
}

/**/
object login extends login_Scope0.login_Scope1.login
              /*
                  -- GENERATED --
                  DATE: Wed May 31 16:21:23 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/login.scala.html
                  HASH: 4de351b10e36c9bd5d9ac1b66bfec7a267f06bd9
                  MATRIX: 822->156|1234->377|1263->478|1291->480|1370->550|1410->552|1442->558|1480->587|1520->589|1556->598|1614->629|1632->638|1677->662|1717->672|1749->677|2394->1294|2469->1347|3355->2205|3371->2211|3413->2231|3486->2277|3499->2281|3530->2291|3587->2320|5966->4672|5981->4678|6075->4750|6152->4800|6167->4806|6237->4855|6280->4868
                  LINES: 27->7|34->7|36->12|37->13|37->13|37->13|38->14|38->14|38->14|39->15|39->15|39->15|39->15|40->16|41->17|50->26|50->26|64->40|64->40|64->40|65->41|65->41|65->41|66->42|113->89|113->89|113->89|115->91|115->91|115->91|116->92
                  -- GENERATED --
              */
          