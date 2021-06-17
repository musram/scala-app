
package views.txt.account.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object password_reset_pl_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.txt._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class password_reset_pl extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String, token: String, name: String, email: String):play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""Cześć """),_display_(/*1.66*/name),format.raw/*1.70*/(""",


Poproszono o zmianę hasła dla Twojego konta.
Jeśli to nie Ty, zrelaksuj się i zignoruj tę wiadomość.

Jeśli jednak naprawdę chcesz zmienić hasło skorzystaj z tego linku aby to zrobić:
"""),_display_(/*8.2*/url),format.raw/*8.5*/("""

"""),format.raw/*10.1*/("""Pozdrawiamy,
Ekipa PlayAuthenticate"""))
      }
    }
  }

  def render(url:String,token:String,name:String,email:String): play.twirl.api.TxtFormat.Appendable = apply(url,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.TxtFormat.Appendable) = (url,token,name,email) => apply(url,token,name,email)

  def ref: this.type = this

}


}

/**/
object password_reset_pl extends password_reset_pl_Scope0.password_reset_pl
              /*
                  -- GENERATED --
                  DATE: Tue May 30 13:58:27 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/account/email/password_reset_pl.scala.txt
                  HASH: 84355accc399f8892d68afb2a7518ab8f4e63956
                  MATRIX: 580->1|731->58|764->65|788->69|1002->258|1024->261|1053->263
                  LINES: 20->1|25->1|25->1|25->1|32->8|32->8|34->10
                  -- GENERATED --
              */
          