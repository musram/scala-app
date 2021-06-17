
package views.txt.account.signup.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object verify_email_es_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.txt._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class verify_email_es extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.71*/("""Hola """),_display_(/*1.77*/name),format.raw/*1.81*/(""",


Se acaba de apuntar a PlayAuthenticate.

Siga el siguiente enlace para activar su cuenta:
"""),_display_(/*7.2*/verificationUrl),format.raw/*7.17*/("""

"""),format.raw/*9.1*/("""Saludos,
El equipo de PlayAuthenticate.
"""))
      }
    }
  }

  def render(verificationUrl:String,token:String,name:String,email:String): play.twirl.api.TxtFormat.Appendable = apply(verificationUrl,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.TxtFormat.Appendable) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)

  def ref: this.type = this

}


}

/**/
object verify_email_es extends verify_email_es_Scope0.verify_email_es
              /*
                  -- GENERATED --
                  DATE: Tue May 30 13:58:27 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/account/signup/email/verify_email_es.scala.txt
                  HASH: 7d0e3b00d1b094849151655f1056078858f109f1
                  MATRIX: 583->1|746->70|778->76|802->80|922->175|957->190|985->192
                  LINES: 20->1|25->1|25->1|25->1|31->7|31->7|33->9
                  -- GENERATED --
              */
          