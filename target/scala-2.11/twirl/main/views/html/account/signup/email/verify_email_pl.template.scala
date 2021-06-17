
package views.html.account.signup.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object verify_email_pl_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class verify_email_pl extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.71*/("""
"""),format.raw/*2.1*/("""Cześć """),_display_(/*2.8*/name),format.raw/*2.12*/(""",
<br />
<br />
<p>
    Twoje konto w PlayAuthenticate zostało utworzone.<br />
    <br />
    Użyj ten link, <a href=""""),_display_(/*8.30*/verificationUrl),format.raw/*8.45*/("""">aby je aktywować</a> natychmiast.
</p>
<br />
<p>
    Pozdrawiamy,<br />
    <i>Ekipa PlayAuthenticate</i>
</p>"""))
      }
    }
  }

  def render(verificationUrl:String,token:String,name:String,email:String): play.twirl.api.HtmlFormat.Appendable = apply(verificationUrl,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)

  def ref: this.type = this

}


}

/**/
object verify_email_pl extends verify_email_pl_Scope0.verify_email_pl
              /*
                  -- GENERATED --
                  DATE: Tue May 30 13:58:27 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/account/signup/email/verify_email_pl.scala.html
                  HASH: b54d6c57427d7dc23a2ffc6288d7e38809081854
                  MATRIX: 589->1|753->70|780->71|812->78|836->82|982->202|1017->217
                  LINES: 20->1|25->1|26->2|26->2|26->2|32->8|32->8
                  -- GENERATED --
              */
          