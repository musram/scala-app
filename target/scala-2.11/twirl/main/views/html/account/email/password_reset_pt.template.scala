
package views.html.account.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object password_reset_pt_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class password_reset_pt extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String, token: String, name: String, email: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""
"""),format.raw/*2.1*/("""Olá """),_display_(/*2.6*/name),format.raw/*2.10*/(""",
<br />
<br />
<p>
	Você ou alguém pediu uma nova palavra passe para a sua conta.<br />
	Se não foi você ou não foi sua intenção, pode ignorar esta mensagem.<br />
</p>
<p>
	Se deseja uma nova palavra passe, terá somente que <a href=""""),_display_(/*10.63*/url),format.raw/*10.66*/("""">seguir este endereço para criar uma nova palavra passe</a>.
</p>
<p>
	Obrigado,<br /> 
	<i>A equipa do PlayAuthenticate</i>
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
object password_reset_pt extends password_reset_pt_Scope0.password_reset_pt
              /*
                  -- GENERATED --
                  DATE: Tue May 30 13:58:27 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/account/email/password_reset_pt.scala.html
                  HASH: 8f8c075a60fa5f6dc5e6bc9ef3486f49edbacced
                  MATRIX: 586->1|738->58|766->60|796->65|820->69|1091->313|1115->316
                  LINES: 20->1|25->1|26->2|26->2|26->2|34->10|34->10
                  -- GENERATED --
              */
          