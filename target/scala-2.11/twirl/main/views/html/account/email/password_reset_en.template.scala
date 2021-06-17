
package views.html.account.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object password_reset_en_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class password_reset_en extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String, token: String, name: String, email: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""
"""),format.raw/*2.1*/("""Howdy """),_display_(/*2.8*/name),format.raw/*2.12*/(""",
<br />
<br />
<p>
	You or someone else requested a password reset for your account.<br />
	If that was not you or your intention, just relax and ignore this email.<br />
</p>
<p>
	If you wish to reset your password, all you need to do is <a href=""""),_display_(/*10.70*/url),format.raw/*10.73*/("""">follow this link to reset your password</a>.
</p>
<p>
	Cheers,<br /> 
	<i>The PlayAuthenticate Team</i>
</p>"""))
      }
    }
  }

  def render(url:String,token:String,name:String,email:String): play.twirl.api.HtmlFormat.Appendable = apply(url,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (url,token,name,email) => apply(url,token,name,email)

  def ref: this.type = this

}


}

/**/
object password_reset_en extends password_reset_en_Scope0.password_reset_en
              /*
                  -- GENERATED --
                  DATE: Tue May 30 13:58:27 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/account/email/password_reset_en.scala.html
                  HASH: da93c76d65bd6441da451ae2820c642fe36135a9
                  MATRIX: 586->1|738->58|765->59|797->66|821->70|1098->320|1122->323
                  LINES: 20->1|25->1|26->2|26->2|26->2|34->10|34->10
                  -- GENERATED --
              */
          