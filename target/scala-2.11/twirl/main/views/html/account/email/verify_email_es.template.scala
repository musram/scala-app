
package views.html.account.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object verify_email_es_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class verify_email_es extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.71*/("""
"""),format.raw/*2.1*/("""Hola """),_display_(/*2.7*/name),format.raw/*2.11*/(""",
<br />
<br />
<p>
	Para validar su email siga el siguiente <a href=""""),_display_(/*6.52*/verificationUrl),format.raw/*6.67*/("""">enlace</a>.
</p>
<br />
<p>
	Le saluda,<br /> 
	<i>El equipo de PlayAuthenticate</i>
</p>
"""))
      }
    }
  }

  def render(verificationUrl:String,token:String,name:String,email:String): play.twirl.api.HtmlFormat.Appendable = apply(verificationUrl,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)

  def ref: this.type = this

}


}

/**/
object verify_email_es extends verify_email_es_Scope0.verify_email_es
              /*
                  -- GENERATED --
                  DATE: Tue May 30 13:58:27 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/account/email/verify_email_es.scala.html
                  HASH: 812fe3ac7b7d538520f2b71ca1718b65d59edee3
                  MATRIX: 582->1|746->70|773->71|804->77|828->81|925->152|960->167
                  LINES: 20->1|25->1|26->2|26->2|26->2|30->6|30->6
                  -- GENERATED --
              */
          