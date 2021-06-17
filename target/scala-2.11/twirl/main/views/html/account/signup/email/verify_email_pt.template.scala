
package views.html.account.signup.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object verify_email_pt_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class verify_email_pt extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.71*/("""
"""),format.raw/*2.1*/("""Olá """),_display_(/*2.6*/name),format.raw/*2.10*/(""",
<br />
<br />
<p>
	Recentemente registou-se no PlayAuthenticate.<br />
	<br />
	Siga esta ligação para <a href=""""),_display_(/*8.35*/verificationUrl),format.raw/*8.50*/("""">activar a sua conta</a> agora.
</p>
<br />
<p>
	Obrigado,<br /> 
	<i>A equipa do PlayAuthenticate</i>
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
object verify_email_pt extends verify_email_pt_Scope0.verify_email_pt
              /*
                  -- GENERATED --
                  DATE: Tue May 30 13:58:27 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/account/signup/email/verify_email_pt.scala.html
                  HASH: c43314e4a493f945adae670f3d11f047a91dfbc6
                  MATRIX: 589->1|753->70|781->72|811->77|835->81|982->202|1017->217
                  LINES: 20->1|25->1|26->2|26->2|26->2|32->8|32->8
                  -- GENERATED --
              */
          