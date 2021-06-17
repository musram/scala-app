
package views.html.account

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object password_change_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object password_change_Scope1 {
import services.UserService
import views.form._
import play.api.mvc._
import be.objectify.deadbolt.scala._

class password_change extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[UserService,Form[PasswordChange],AuthenticatedRequest[Any],MessagesApi,Messages,WebJarAssets,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(userService: UserService, changeForm: Form[PasswordChange])(implicit request: AuthenticatedRequest[Any], messagesApi: MessagesApi, messages: Messages, webJarAssets: WebJarAssets):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import b3.vertical.fieldConstructor
import com.feth.play.module.pa.views.html._

Seq[Any](format.raw/*6.181*/("""

"""),format.raw/*11.1*/("""
"""),_display_(/*12.2*/main(userService, messagesApi("playauthenticate.change.password.title"))/*12.74*/ {_display_(Seq[Any](format.raw/*12.76*/("""
    """),_display_(/*13.6*/if(changeForm.hasGlobalErrors)/*13.36*/ {_display_(Seq[Any](format.raw/*13.38*/("""
        """),format.raw/*14.9*/("""<p class="alert alert-danger">"""),_display_(/*14.40*/changeForm/*14.50*/.globalError.get.message),format.raw/*14.74*/("""</p>
    """)))}),format.raw/*15.6*/("""
    """),format.raw/*16.5*/("""<div class="content overflow-hidden">
        <div class="row">
            <div class="col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3 col-lg-4 col-lg-offset-4">
                <!-- Register Block -->
                <div class="block block-themed animated fadeIn">
                    <div class="block-header bg-primary">
                        <h3 class="block-title">Change Password</h3>
                    </div>
                    <div class="block-content block-content-full block-content-narrow">
                        <!-- Register Title -->
                        <h1 class="h2 font-w600 push-30-t push-5">SMYD</h1>
                        <!-- END Register Title -->

                        <!-- Register Form -->
                        <!-- jQuery Validation (.js-validation-register class is initialized in js/pages/base_pages_register.js) -->
                        <!-- For more examples you can check out https://github.com/jzaefferer/jquery-validation -->
                        <form class="js-validation-register form-horizontal push-50-t push-50" action=""""),_display_(/*32.105*/routes/*32.111*/.Account.doChangePassword),format.raw/*32.136*/("""" method="post">
                            """),_display_(/*33.30*/CSRF/*33.34*/.formField),format.raw/*33.44*/("""
                            """),format.raw/*34.29*/("""<div class="form-group">
                                <div class="col-xs-12">
                                    <div class="form-material form-material-success">
                                        <input class="form-control" type="password" id="register-password" name="register-password" placeholder="Choose a strong password..">
                                        <label for="register-password">Password</label>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-xs-12">
                                    <div class="form-material form-material-success">
                                        <input class="form-control" type="password" id="register-password2" name="register-password2" placeholder="..and confirm it">
                                        <label for="register-password2">Confirm Password</label>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-xs-12 col-sm-6 col-md-5">
                                    <button class="btn btn-block bg-primary" type="submit"> Submit</button>
                                </div>
                            </div>
                        </form>
                        <!-- END Register Form -->
                    </div>
                </div>
                <!-- END Register Block -->
            </div>
        </div>
    </div>
    <!-- END Register Content -->


<!-- Reminder Footer -->
<div class="push-10-t text-center animated fadeInUp">
    <small class="text-muted font-w600"><span class="js-year-copy"></span> &copy; OneUI 3.1</small>
</div>
<!-- END Reminder Footer -->

<!-- Page JS Plugins -->
<script type="text/javascript" src=""""),_display_(/*73.38*/routes/*73.44*/.Assets.versioned("js/plugins/jquery-validation/jquery.validate.min.js")),format.raw/*73.116*/(""""></script>

<script type="text/javascript" src=""""),_display_(/*75.38*/routes/*75.44*/.Assets.versioned("js/pages/base_pages_register.js")),format.raw/*75.96*/(""""></script>
""")))}))
      }
    }
  }

  def render(userService:UserService,changeForm:Form[PasswordChange],request:AuthenticatedRequest[Any],messagesApi:MessagesApi,messages:Messages,webJarAssets:WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(userService,changeForm)(request,messagesApi,messages,webJarAssets)

  def f:((UserService,Form[PasswordChange]) => (AuthenticatedRequest[Any],MessagesApi,Messages,WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (userService,changeForm) => (request,messagesApi,messages,webJarAssets) => apply(userService,changeForm)(request,messagesApi,messages,webJarAssets)

  def ref: this.type = this

}


}
}

/**/
object password_change extends password_change_Scope0.password_change_Scope1.password_change
              /*
                  -- GENERATED --
                  DATE: Wed May 31 16:12:13 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/account/password_change.scala.html
                  HASH: b18c4096e182febc42df18b00f95184c75d46612
                  MATRIX: 786->113|1156->292|1185->393|1213->395|1294->467|1334->469|1366->475|1405->505|1445->507|1481->516|1539->547|1558->557|1603->581|1643->591|1675->596|2793->1686|2809->1692|2856->1717|2929->1763|2942->1767|2973->1777|3030->1806|5023->3772|5038->3778|5132->3850|5209->3900|5224->3906|5297->3958
                  LINES: 26->6|33->6|35->11|36->12|36->12|36->12|37->13|37->13|37->13|38->14|38->14|38->14|38->14|39->15|40->16|56->32|56->32|56->32|57->33|57->33|57->33|58->34|97->73|97->73|97->73|99->75|99->75|99->75
                  -- GENERATED --
              */
          