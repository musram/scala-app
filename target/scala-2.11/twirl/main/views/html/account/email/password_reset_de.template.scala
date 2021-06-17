
package views.html.account.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object password_reset_de_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class password_reset_de extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String, token: String, name: String, email: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""
"""),format.raw/*2.1*/("""Hey """),_display_(/*2.6*/name),format.raw/*2.10*/(""",
<br />
<br />
<p>
	du oder jemand anderes hat die Möglichkeit zum Zurücksetzen deines Passwortes genutzt.<br />
	Falls dies nicht du selbst oder deine Absicht war, kannst du diese E-Mail einfach ignorieren.<br />
</p>
<p>
	Falls du dein Passwort zurücksetzen möchtest, <a href=""""),_display_(/*10.58*/url),format.raw/*10.61*/("""">musst du nur diesem Link folgen</a>.
</p>
<p>
	Grüße,<br /> 
	<i>Das PlayAuthenticate-Team</i>
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
object password_reset_de extends password_reset_de_Scope0.password_reset_de
              /*
                  -- GENERATED --
                  DATE: Tue May 30 13:58:27 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/account/email/password_reset_de.scala.html
                  HASH: e77cb6b40c00743244db1349b8da04fb0440bafa
                  MATRIX: 586->1|738->58|765->59|795->64|819->68|1127->349|1151->352
                  LINES: 20->1|25->1|26->2|26->2|26->2|34->10|34->10
                  -- GENERATED --
              */
          