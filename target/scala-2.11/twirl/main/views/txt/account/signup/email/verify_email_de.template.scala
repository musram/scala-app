
package views.txt.account.signup.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object verify_email_de_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.txt._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class verify_email_de extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.71*/("""Hey """),_display_(/*1.76*/name),format.raw/*1.80*/(""",


Du hast dich kürzlich bei PlayAuthenticate registriert.

Folge diesem Link um dein Konto jetzt zu aktivieren:

"""),_display_(/*8.2*/verificationUrl),format.raw/*8.17*/("""

"""),format.raw/*10.1*/("""Grüße,
Das PlayAuthenticate-Team"""))
      }
    }
  }

  def render(verificationUrl:String,token:String,name:String,email:String): play.twirl.api.TxtFormat.Appendable = apply(verificationUrl,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.TxtFormat.Appendable) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)

  def ref: this.type = this

}


}

/**/
object verify_email_de extends verify_email_de_Scope0.verify_email_de
              /*
                  -- GENERATED --
                  DATE: Tue May 30 13:58:27 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/account/signup/email/verify_email_de.scala.txt
                  HASH: 7b6b8882d9a8874ac900f5ef843f511c4db24240
                  MATRIX: 583->1|746->70|777->75|801->79|942->195|977->210|1006->212
                  LINES: 20->1|25->1|25->1|25->1|32->8|32->8|34->10
                  -- GENERATED --
              */
          