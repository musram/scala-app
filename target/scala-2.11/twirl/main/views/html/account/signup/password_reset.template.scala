
package views.html.account.signup

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object password_reset_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object password_reset_Scope1 {
import services.UserService
import views.form._
import play.api.mvc._
import be.objectify.deadbolt.scala._

class password_reset extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[UserService,Form[PasswordReset],AuthenticatedRequest[Any],MessagesApi,Messages,WebJarAssets,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(userService: UserService, resetForm: Form[PasswordReset])(implicit request: AuthenticatedRequest[Any], messagesApi: MessagesApi, messages: Messages, webJarAssets: WebJarAssets):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import b3.vertical.fieldConstructor
import com.feth.play.module.pa.views.html._

Seq[Any](format.raw/*6.179*/("""

"""),format.raw/*11.1*/("""
"""),_display_(/*12.2*/main(userService, messagesApi("playauthenticate.password.reset.title"))/*12.73*/ {_display_(Seq[Any](format.raw/*12.75*/("""
    """),_display_(/*13.6*/if(resetForm.hasGlobalErrors)/*13.35*/ {_display_(Seq[Any](format.raw/*13.37*/("""
        """),format.raw/*14.9*/("""<p class="alert alert-danger">"""),_display_(/*14.40*/resetForm/*14.49*/.globalError.get.message),format.raw/*14.73*/("""</p>
    """)))}),format.raw/*15.6*/("""
"""),format.raw/*16.1*/("""<div class="content overflow-hidden">
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
                    <form class="js-validation-register form-horizontal push-50-t push-50" action=""""),_display_(/*32.101*/routes/*32.107*/.Signup.doResetPassword),format.raw/*32.130*/("""" method="post">
                        """),_display_(/*33.26*/CSRF/*33.30*/.formField),format.raw/*33.40*/("""
                        """),_display_(/*34.26*/b3/*34.28*/.hidden(resetForm("token"), '_label -> "", '_showConstraints -> false)),format.raw/*34.98*/("""
                        """),format.raw/*35.25*/("""<div class="form-group">
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
    <small class="text-muted font-w600"><span class="js-year-copy"></span> &copy; SMYD 1.0</small>
</div>
<!-- END Reminder Footer -->


<!-- Page JS Plugins -->
<script type="text/javascript" src=""""),_display_(/*74.38*/routes/*74.44*/.Assets.versioned("js/plugins/jquery-validation/jquery.validate.min.js")),format.raw/*74.116*/(""""></script>

<script type="text/javascript" src=""""),_display_(/*76.38*/routes/*76.44*/.Assets.versioned("js/pages/base_pages_register.js")),format.raw/*76.96*/(""""></script>
""")))}),format.raw/*77.2*/("""


"""))
      }
    }
  }

  def render(userService:UserService,resetForm:Form[PasswordReset],request:AuthenticatedRequest[Any],messagesApi:MessagesApi,messages:Messages,webJarAssets:WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(userService,resetForm)(request,messagesApi,messages,webJarAssets)

  def f:((UserService,Form[PasswordReset]) => (AuthenticatedRequest[Any],MessagesApi,Messages,WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (userService,resetForm) => (request,messagesApi,messages,webJarAssets) => apply(userService,resetForm)(request,messagesApi,messages,webJarAssets)

  def ref: this.type = this

}


}
}

/**/
object password_reset extends password_reset_Scope0.password_reset_Scope1.password_reset
              /*
                  -- GENERATED --
                  DATE: Wed May 31 16:23:25 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/account/signup/password_reset.scala.html
                  HASH: 4a04f1021d70c146f8865dfddfbfa9c7decd1935
                  MATRIX: 789->113|1157->290|1186->391|1214->393|1294->464|1334->466|1366->472|1404->501|1444->503|1480->512|1538->543|1556->552|1601->576|1641->586|1669->587|2727->1617|2743->1623|2788->1646|2857->1688|2870->1692|2901->1702|2954->1728|2965->1730|3056->1800|3109->1825|4985->3674|5000->3680|5094->3752|5171->3802|5186->3808|5259->3860|5302->3873
                  LINES: 26->6|33->6|35->11|36->12|36->12|36->12|37->13|37->13|37->13|38->14|38->14|38->14|38->14|39->15|40->16|56->32|56->32|56->32|57->33|57->33|57->33|58->34|58->34|58->34|59->35|98->74|98->74|98->74|100->76|100->76|100->76|101->77
                  -- GENERATED --
              */
          