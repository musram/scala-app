
package views.html.account.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object password_reset_es_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class password_reset_es extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String, token: String, name: String, email: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""
"""),format.raw/*2.1*/("""Hola """),_display_(/*2.7*/name),format.raw/*2.11*/(""",
<br />
<br />
<p>
Alguien ha solicitado restablecer la contraseña de su cuenta.<br />
Si no ha sido Usted o si no ha sido esta su intención, relájese e ignore este email.<br />
</p>
<p>
Si lo que quiere es cambiar su contraseña, lo único que necesita hacer es seguir este <a href=""""),_display_(/*10.97*/url),format.raw/*10.100*/("""">enlace para restablecer su contraseña</a>.
</p>

<p>
Atentamente,<br /> 
<i>El equipo de PlayAuthenticate</i>
</p>
"""))
      }
    }
  }

  def render(url:String,token:String,name:String,email:String): play.twirl.api.HtmlFormat.Appendable = apply(url,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (url,token,name,email) => apply(url,token,name,email)

  def ref: this.type = this

}


}

/**/
object password_reset_es extends password_reset_es_Scope0.password_reset_es
              /*
                  -- GENERATED --
                  DATE: Tue May 30 13:58:27 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/account/email/password_reset_es.scala.html
                  HASH: 523f6be3da0a6a2344a5622540fbac5e8f164b28
                  MATRIX: 586->1|738->58|765->59|796->65|820->69|1131->353|1156->356
                  LINES: 20->1|25->1|26->2|26->2|26->2|34->10|34->10
                  -- GENERATED --
              */
          