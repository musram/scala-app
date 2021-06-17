
package views.html.account.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object verify_email_en_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class verify_email_en extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.71*/("""
"""),format.raw/*2.1*/("""Howdy """),_display_(/*2.8*/name),format.raw/*2.12*/(""",
<br />
<br />
<p>
	To verify your e-mail address, <a href=""""),_display_(/*6.43*/verificationUrl),format.raw/*6.58*/("""">now follow this link</a>.
</p>
<br />
<p>
	Cheers,<br /> 
	<i>The PlayAuthenticate Team</i>
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
object verify_email_en extends verify_email_en_Scope0.verify_email_en
              /*
                  -- GENERATED --
                  DATE: Tue May 30 13:58:27 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/account/email/verify_email_en.scala.html
                  HASH: 9a88ff3450384129700bd3412aa4cf600efd739d
                  MATRIX: 582->1|746->70|773->71|805->78|829->82|917->144|952->159
                  LINES: 20->1|25->1|26->2|26->2|26->2|30->6|30->6
                  -- GENERATED --
              */
          