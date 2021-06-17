
package views.txt.account.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object password_reset_pt_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.txt._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class password_reset_pt extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String, token: String, name: String, email: String):play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""Olá """),_display_(/*1.64*/name),format.raw/*1.68*/(""",


Você ou alguém pediu uma nova palavra passe para a sua conta.
Se não foi você ou não foi sua intenção, pode ignorar esta mensagem.

Se deseja uma nova palavra passe, terá somente que seguir este endereço para criar uma nova palavra passe:
"""),_display_(/*8.2*/url),format.raw/*8.5*/("""

"""),format.raw/*10.1*/("""Obrigado,
A equipa do PlayAuthenticate"""))
      }
    }
  }

  def render(url:String,token:String,name:String,email:String): play.twirl.api.TxtFormat.Appendable = apply(url,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.TxtFormat.Appendable) = (url,token,name,email) => apply(url,token,name,email)

  def ref: this.type = this

}


}

/**/
object password_reset_pt extends password_reset_pt_Scope0.password_reset_pt
              /*
                  -- GENERATED --
                  DATE: Tue May 30 13:58:27 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/account/email/password_reset_pt.scala.txt
                  HASH: 0b36f0fbb296c4260f7edc7e8547a2a12f31bee7
                  MATRIX: 580->1|731->58|762->63|786->67|1062->318|1084->321|1115->325
                  LINES: 20->1|25->1|25->1|25->1|32->8|32->8|34->10
                  -- GENERATED --
              */
          