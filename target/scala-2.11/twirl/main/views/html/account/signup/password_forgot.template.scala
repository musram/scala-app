
package views.html.account.signup

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object password_forgot_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object password_forgot_Scope1 {
import services.UserService
import views.form._
import play.api.mvc._
import be.objectify.deadbolt.scala._

class password_forgot extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[UserService,Form[ForgotPassword],AuthenticatedRequest[Any],MessagesApi,Messages,WebJarAssets,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(userService: UserService, emailForm: Form[ForgotPassword])(implicit request: AuthenticatedRequest[Any], messagesApi: MessagesApi, messages: Messages, webJarAssets: WebJarAssets):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import b3.vertical.fieldConstructor
import com.feth.play.module.pa.views.html._

Seq[Any](format.raw/*6.180*/("""

"""),format.raw/*11.1*/("""
"""),_display_(/*12.2*/main(userService, messagesApi("playauthenticate.password.forgot.title"))/*12.74*/ {_display_(Seq[Any](format.raw/*12.76*/("""
	"""),_display_(/*13.3*/if(emailForm.hasGlobalErrors)/*13.32*/ {_display_(Seq[Any](format.raw/*13.34*/("""
		"""),format.raw/*14.3*/("""<p class="alert alert-danger">
			"""),_display_(/*15.5*/emailForm/*15.14*/.globalError.get.message),format.raw/*15.38*/("""
		"""),format.raw/*16.3*/("""</p>
	""")))}),format.raw/*17.3*/("""

"""),format.raw/*19.1*/("""<!-- Reminder Content -->
<div class="content overflow-hidden">
	<div class="row">
		<div class="col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3 col-lg-4 col-lg-offset-4">
			<!-- Reminder Block -->
			<div class="block block-themed animated fadeIn">
				<div class="block-header bg-primary">
					<ul class="block-options">
						<li>
							<a href=""""),_display_(/*28.18*/routes/*28.24*/.Application.login),format.raw/*28.42*/("""" data-toggle="tooltip" data-placement="left" title="Log In"><i class="si si-login"></i></a>
						</li>
					</ul>
					<h3 class="block-title">Password Reminder</h3>
				</div>
				<div class="block-content block-content-full block-content-narrow">
					<!-- Reminder Title -->
					<h1 class="h2 font-w600 push-30-t push-5">OneUI</h1>
					<p>Please provide your account’s email and we will send you your password.</p>
					<!-- END Reminder Title -->

					<!-- Reminder Form -->
					<!-- jQuery Validation (.js-validation-reminder class is initialized in js/pages/base_pages_reminder.js) -->
					<!-- For more examples you can check out https://github.com/jzaefferer/jquery-validation -->
					<form class="js-validation-reminder form-horizontal push-30-t push-50" action=""""),_display_(/*42.86*/routes/*42.92*/.Signup.doForgotPassword),format.raw/*42.116*/("""" method="post">
						"""),_display_(/*43.8*/CSRF/*43.12*/.formField),format.raw/*43.22*/("""
						"""),format.raw/*44.7*/("""<div class="form-group">
							<div class="col-xs-12">
								<div class="form-material form-material-primary floating">
									<input class="form-control" type="email" id="reminder-email" name="email">
									<label for="reminder-email">Email</label>
								</div>
							</div>
						</div>
						<div class="form-group">
							<div class="col-xs-12 col-sm-6 col-md-5">
								<button class="btn btn-block btn-primary" type="submit"><i class="si si-envelope-open pull-right"></i> Send Mail</button>
							</div>
						</div>
					</form>
					<!-- END Reminder Form -->
				</div>
			</div>
			<!-- END Reminder Block -->
		</div>
	</div>
</div>
<!-- END Reminder Content -->

<!-- Reminder Footer -->
<div class="push-10-t text-center animated fadeInUp">
	<small class="text-muted font-w600"><span class="js-year-copy"></span> &copy; SMYD 1.0</small>
</div>
<!-- END Reminder Footer -->

<!-- Page JS Plugins -->
<script type="text/javascript" src=""""),_display_(/*74.38*/routes/*74.44*/.Assets.versioned("js/plugins/jquery-validation/jquery.validate.min.js")),format.raw/*74.116*/(""""></script>

<script type="text/javascript" src=""""),_display_(/*76.38*/routes/*76.44*/.Assets.versioned("js/pages/base_pages_reminder.js")),format.raw/*76.96*/(""""></script>
""")))}),format.raw/*77.2*/("""





"""))
      }
    }
  }

  def render(userService:UserService,emailForm:Form[ForgotPassword],request:AuthenticatedRequest[Any],messagesApi:MessagesApi,messages:Messages,webJarAssets:WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(userService,emailForm)(request,messagesApi,messages,webJarAssets)

  def f:((UserService,Form[ForgotPassword]) => (AuthenticatedRequest[Any],MessagesApi,Messages,WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (userService,emailForm) => (request,messagesApi,messages,webJarAssets) => apply(userService,emailForm)(request,messagesApi,messages,webJarAssets)

  def ref: this.type = this

}


}
}

/**/
object password_forgot extends password_forgot_Scope0.password_forgot_Scope1.password_forgot
              /*
                  -- GENERATED --
                  DATE: Wed May 31 16:23:25 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/account/signup/password_forgot.scala.html
                  HASH: 860f588a828132f3e0d8840b65a0d9434758fa24
                  MATRIX: 793->113|1162->291|1191->392|1219->394|1300->466|1340->468|1369->471|1407->500|1447->502|1477->505|1538->540|1556->549|1601->573|1631->576|1668->583|1697->585|2079->940|2094->946|2133->964|2941->1745|2956->1751|3002->1775|3052->1799|3065->1803|3096->1813|3130->1820|4120->2783|4135->2789|4229->2861|4306->2911|4321->2917|4394->2969|4437->2982
                  LINES: 26->6|33->6|35->11|36->12|36->12|36->12|37->13|37->13|37->13|38->14|39->15|39->15|39->15|40->16|41->17|43->19|52->28|52->28|52->28|66->42|66->42|66->42|67->43|67->43|67->43|68->44|98->74|98->74|98->74|100->76|100->76|100->76|101->77
                  -- GENERATED --
              */
          