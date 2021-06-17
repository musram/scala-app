
package views.txt.account.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object password_reset_es_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.txt._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class password_reset_es extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String, token: String, name: String, email: String):play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""Hola """),_display_(/*1.65*/name),format.raw/*1.69*/(""",


Alguien ha solicitado restablecer la contraseña de su cuenta.
Si no ha sido Usted o si no ha sido esta su intención, relájese e ignore este email.

Si lo que quiere es cambiar su contraseña, lo único que necesita hacer es seguir el siguiente enlace:
"""),_display_(/*8.2*/url),format.raw/*8.5*/("""

"""),format.raw/*10.1*/("""Atentamente,
El equipo de PlayAuthenticate
"""))
      }
    }
  }

  def render(url:String,token:String,name:String,email:String): play.twirl.api.TxtFormat.Appendable = apply(url,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.TxtFormat.Appendable) = (url,token,name,email) => apply(url,token,name,email)

  def ref: this.type = this

}


}

/**/
object password_reset_es extends password_reset_es_Scope0.password_reset_es
              /*
                  -- GENERATED --
                  DATE: Tue May 30 13:58:27 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/account/email/password_reset_es.scala.txt
                  HASH: 9d1e1d41262dae96f4c3ca79ca4679da3ca710d9
                  MATRIX: 580->1|731->58|763->64|787->68|1067->323|1089->326|1118->328
                  LINES: 20->1|25->1|25->1|25->1|32->8|32->8|34->10
                  -- GENERATED --
              */
          