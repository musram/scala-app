
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object uploadcustomerdata_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object uploadcustomerdata_Scope1 {
import services.UserService
import views.form._
import play.api.mvc._
import play.api.data._
import be.objectify.deadbolt.scala.AuthenticatedRequest
import com.nappin.play.recaptcha.WidgetHelper

class uploadcustomerdata extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[UserService,Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},AuthenticatedRequest[Any],MessagesApi,Messages,WebJarAssets,WidgetHelper,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*8.2*/(userService: UserService, UploadCustomerForm: Form[_])(implicit request: AuthenticatedRequest[Any], messagesApi: MessagesApi, messages: Messages, webJarAssets: WebJarAssets, widgetHelper: WidgetHelper):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import b3.horizontal.fieldConstructor
import com.feth.play.module.pa.views.html._

Seq[Any](format.raw/*8.204*/("""

"""),_display_(/*13.2*/main(userService, messagesApi("playauthenticate.index.title"))/*13.64*/ {_display_(Seq[Any](format.raw/*13.66*/("""

"""),format.raw/*15.1*/("""<!-- Page Header -->
<div class="content bg-gray-lighter">
    <div class="row items-push">
        <div class="col-sm-7">
            <h1 class="page-heading">
                """),_display_(/*20.18*/messagesApi("playauthenticate.uploadcustomerdata.title")),format.raw/*20.74*/("""</small>
            </h1>
        </div>
        <div class="col-sm-5 text-right hidden-xs">
            <ol class="breadcrumb push-10-t">
                <li>Admin</li>
                <li><a class="link-effect" href="">Upload</a></li>
            </ol>
        </div>
    </div>
</div>
<!-- END Page Header -->


<!-- Page Content -->
<div class="content content-narrow">
    <!-- Forms Row -->
    <div class="row">
        <div class="col-lg-12">
            <!-- Bootstrap Forms Validation -->
            <h2 class="content-heading"></h2>
            <div class="block">
                <div class="block-header">
                    <ul class="block-options">
                        <li>
                            <button type="button"><i class="si si-settings"></i></button>
                        </li>
                    </ul>
                    <h3 class="block-title"></h3>
                </div>
                <div class="block-content block-content-narrow">
                    <!-- jQuery Validation (.js-validation-bootstrap class is initialized in js/pages/base_forms_validation.js) -->
                    <!-- For more examples you can check out https://github.com/jzaefferer/jquery-validation -->

                    <form class="js-validation-bootstrap form-horizontal" action=""""),_display_(/*54.84*/routes/*54.90*/.Upload.doUpload),format.raw/*54.106*/("""" enctype = "multipart/form-data" method="post">
                        """),_display_(/*55.26*/CSRF/*55.30*/.formField),format.raw/*55.40*/("""
                        """),format.raw/*56.25*/("""<div class="form-group">
                            <label class="col-md-4 control-label" for="val-username">Download the template. The file format (xls, xlsx, ods)<span class="text-danger">*</span></label>
                            <div class="col-md-7">
                                <img style="max-width:50px;min-width:30px" src=""""),_display_(/*59.82*/routes/*59.88*/.Assets.versioned("img/various/ExcelTemplate.jpeg")),format.raw/*59.139*/(""""">
                                <a href=""""),_display_(/*60.43*/routes/*60.49*/.Assets.versioned("static/SMYD.b0ecdefca720-1.xlsx")),format.raw/*60.101*/("""" class="btn btn-success push-5-r push-10" ><i class="fa fa-download"></i> Download</a>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-md-4 control-label" for="val-username">Upload the file <span class="text-danger">*</span></label>
                            <div class="col-md-7">
                                <input class="form-control" type="file" id="val-username" name="file" placeholder="Choose a nice username..">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-md-4 control-label" for="val-email">New Records in the uploaded file will get created and Existing Records in the file will be updated </label>
                            <div class="col-md-7">
                                <input class="form-control" type="checkbox" id="val-email" name="updateExistingRecords" placeholder="Enter your valid email..">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-8 col-md-offset-4">
                                <button class="btn btn-success push-5-r push-10" type="submit"><i class="fa fa-upload"></i>Upload</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <!-- Forms Row -->
</div>
<!-- END Page Content -->
""")))}),format.raw/*88.2*/("""


"""))
      }
    }
  }

  def render(userService:UserService,UploadCustomerForm:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},request:AuthenticatedRequest[Any],messagesApi:MessagesApi,messages:Messages,webJarAssets:WebJarAssets,widgetHelper:WidgetHelper): play.twirl.api.HtmlFormat.Appendable = apply(userService,UploadCustomerForm)(request,messagesApi,messages,webJarAssets,widgetHelper)

  def f:((UserService,Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}) => (AuthenticatedRequest[Any],MessagesApi,Messages,WebJarAssets,WidgetHelper) => play.twirl.api.HtmlFormat.Appendable) = (userService,UploadCustomerForm) => (request,messagesApi,messages,webJarAssets,widgetHelper) => apply(userService,UploadCustomerForm)(request,messagesApi,messages,webJarAssets,widgetHelper)

  def ref: this.type = this

}


}
}

/**/
object uploadcustomerdata extends uploadcustomerdata_Scope0.uploadcustomerdata_Scope1.uploadcustomerdata
              /*
                  -- GENERATED --
                  DATE: Fri Jun 02 08:55:29 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/uploadcustomerdata.scala.html
                  HASH: 21283dfcbb6da759f2ff54717e284b1dd7aab576
                  MATRIX: 946->203|1341->405|1370->509|1441->571|1481->573|1510->575|1715->753|1792->809|3129->2119|3144->2125|3182->2141|3283->2215|3296->2219|3327->2229|3380->2254|3747->2594|3762->2600|3835->2651|3908->2697|3923->2703|3997->2755|5623->4351
                  LINES: 30->8|37->8|39->13|39->13|39->13|41->15|46->20|46->20|80->54|80->54|80->54|81->55|81->55|81->55|82->56|85->59|85->59|85->59|86->60|86->60|86->60|114->88
                  -- GENERATED --
              */
          