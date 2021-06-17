
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object _recaptchaFieldPartial_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object _recaptchaFieldPartial_Scope1 {
import com.nappin.play.recaptcha.{RecaptchaVerifier, RecaptchaErrorCode, WidgetHelper}

class _recaptchaFieldPartial extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template8[Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},String,Option[Int],Boolean,Boolean,WidgetHelper,Request[AnyContent],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /****************************************************************************************
* High-level API: Renders a Google Recaptcha Widget, using the Play Forms API.
*
* @param form              The current form
* @param fieldName         The logical field name
* @param tabindex          The tabindex of the field (if any)
* @param includeNoScript   Whether to include the noscript block, default is true
* @param isRequired        Whether the field is to be shown as required (default is true)
* @param widgetHelper      (Implicit) Helper utility needed for accessing settings, urls, etc in the widget
* @param request           (Implicit) The current request
* @param messages          (Implicit) The current I18n messages
****************************************************************************************/
  def apply/*15.2*/(form: Form[_], fieldName: String, tabindex: Option[Int] = None, includeNoScript: Boolean = true,
isRequired: Boolean = true)(implicit widgetHelper: WidgetHelper, request: Request[AnyContent], messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*18.2*/messageOrDefault/*18.18*/(key: String, default: String) = {{ if (messages.isDefinedAt(key)) { messages(key) } else { default } }};def /*19.2*/errorCode/*19.11*/ = {{ form.error(RecaptchaVerifier.formErrorKey).map(e => { Some(e.message) }).getOrElse(None) }};def /*20.2*/recaptchaError/*20.16*/ = {{ errorCode.filter(code => !RecaptchaErrorCode.isInternalErrorCode(code)) }};
Seq[Any](format.raw/*16.115*/("""

"""),format.raw/*18.121*/("""
"""),format.raw/*19.107*/("""
"""),format.raw/*20.95*/("""

"""),format.raw/*22.1*/("""<div class="form-group """),_display_(/*22.25*/if(errorCode.isDefined)/*22.48*/ {_display_(Seq[Any](format.raw/*22.50*/("""has-error""")))}),format.raw/*22.60*/("""">
    <label for=""""),_display_(/*23.18*/fieldName),format.raw/*23.27*/("""" class="control-label">"""),_display_(/*23.52*/messages(fieldName)),format.raw/*23.71*/("""</label>
    <div class="row">
        <div class="col-md-7">"""),_display_(/*25.32*/recaptcha/*25.41*/.recaptchaWidget(tabindex = tabindex, includeNoScript = includeNoScript)),format.raw/*25.113*/("""</div>
    </div>
    """),_display_(/*27.6*/errorCode/*27.15*/ match/*27.21*/ {/*28.9*/case Some(RecaptchaErrorCode.captchaIncorrect) =>/*28.58*/ {_display_(Seq[Any](format.raw/*28.60*/("""
            """),format.raw/*29.13*/("""<span class="help-block">"""),_display_(/*29.39*/messageOrDefault("error.captchaIncorrect", "Incorrect, please try again")),format.raw/*29.112*/("""</span>
        """)))}/*31.9*/case Some(RecaptchaErrorCode.recaptchaNotReachable) =>/*31.63*/ {_display_(Seq[Any](format.raw/*31.65*/("""
            """),format.raw/*32.13*/("""<span class="help-block">"""),_display_(/*32.39*/messageOrDefault("error.recaptchaNotReachable", "Unable to contact Recaptcha")),format.raw/*32.117*/("""</span>
        """)))}/*34.9*/case Some(RecaptchaErrorCode.apiError) =>/*34.50*/ {_display_(Seq[Any](format.raw/*34.52*/("""
            """),format.raw/*35.13*/("""<span class="help-block">"""),_display_(/*35.39*/messageOrDefault("error.apiError", "Invalid response from Recaptcha")),format.raw/*35.108*/("""</span>
        """)))}/*37.9*/case Some(RecaptchaErrorCode.responseMissing) =>/*37.57*/ {_display_(Seq[Any](format.raw/*37.59*/("""
            """),format.raw/*38.13*/("""<span class="help-block">"""),_display_(/*38.39*/messages("constraint.required")),format.raw/*38.70*/("""</span>
        """)))}/*40.9*/case _ =>/*40.18*/ {_display_(Seq[Any](format.raw/*40.20*/("""
            """),format.raw/*41.13*/("""<span class="help-block text-muted">"""),_display_(/*41.50*/messages("constraint.required")),format.raw/*41.81*/("""</span>
        """)))}}),format.raw/*43.6*/("""
"""),format.raw/*44.1*/("""</div>"""))
      }
    }
  }

  def render(form:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},fieldName:String,tabindex:Option[Int],includeNoScript:Boolean,isRequired:Boolean,widgetHelper:WidgetHelper,request:Request[AnyContent],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(form,fieldName,tabindex,includeNoScript,isRequired)(widgetHelper,request,messages)

  def f:((Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},String,Option[Int],Boolean,Boolean) => (WidgetHelper,Request[AnyContent],Messages) => play.twirl.api.HtmlFormat.Appendable) = (form,fieldName,tabindex,includeNoScript,isRequired) => (widgetHelper,request,messages) => apply(form,fieldName,tabindex,includeNoScript,isRequired)(widgetHelper,request,messages)

  def ref: this.type = this

}


}
}

/****************************************************************************************
* High-level API: Renders a Google Recaptcha Widget, using the Play Forms API.
*
* @param form              The current form
* @param fieldName         The logical field name
* @param tabindex          The tabindex of the field (if any)
* @param includeNoScript   Whether to include the noscript block, default is true
* @param isRequired        Whether the field is to be shown as required (default is true)
* @param widgetHelper      (Implicit) Helper utility needed for accessing settings, urls, etc in the widget
* @param request           (Implicit) The current request
* @param messages          (Implicit) The current I18n messages
****************************************************************************************/
object _recaptchaFieldPartial extends _recaptchaFieldPartial_Scope0._recaptchaFieldPartial_Scope1._recaptchaFieldPartial
              /*
                  -- GENERATED --
                  DATE: Tue May 30 13:58:27 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/_recaptchaFieldPartial.scala.html
                  HASH: e0783e7d7f1959bdd90d4a7f0873b7179b473777
                  MATRIX: 1657->909|1948->1124|1973->1140|2090->1245|2108->1254|2218->1352|2241->1366|2352->1121|2383->1243|2413->1350|2442->1445|2471->1447|2522->1471|2554->1494|2594->1496|2635->1506|2682->1526|2712->1535|2764->1560|2804->1579|2893->1641|2911->1650|3005->1722|3054->1745|3072->1754|3087->1760|3097->1771|3155->1820|3195->1822|3236->1835|3289->1861|3384->1934|3419->1960|3482->2014|3522->2016|3563->2029|3616->2055|3716->2133|3751->2159|3801->2200|3841->2202|3882->2215|3935->2241|4026->2310|4061->2336|4118->2384|4158->2386|4199->2399|4252->2425|4304->2456|4339->2482|4357->2491|4397->2493|4438->2506|4502->2543|4554->2574|4602->2597|4630->2598
                  LINES: 36->15|41->18|41->18|41->19|41->19|41->20|41->20|42->16|44->18|45->19|46->20|48->22|48->22|48->22|48->22|48->22|49->23|49->23|49->23|49->23|51->25|51->25|51->25|53->27|53->27|53->27|53->28|53->28|53->28|54->29|54->29|54->29|55->31|55->31|55->31|56->32|56->32|56->32|57->34|57->34|57->34|58->35|58->35|58->35|59->37|59->37|59->37|60->38|60->38|60->38|61->40|61->40|61->40|62->41|62->41|62->41|63->43|64->44
                  -- GENERATED --
              */
          