
package views.txt.account.signup.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object verify_email_pl_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.txt._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class verify_email_pl extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.71*/("""Cześć """),_display_(/*1.78*/name),format.raw/*1.82*/(""",


Twoje konto w PlayAuthenticate zostało utworzone.

Aby je aktywować, użyj ten link
"""),_display_(/*7.2*/verificationUrl),format.raw/*7.17*/("""

"""),format.raw/*9.1*/("""Pozdrawiamy,
Ekipa PlayAuthenticate"""))
      }
    }
  }

  def render(verificationUrl:String,token:String,name:String,email:String): play.twirl.api.TxtFormat.Appendable = apply(verificationUrl,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.TxtFormat.Appendable) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)

  def ref: this.type = this

}


}

/**/
object verify_email_pl extends verify_email_pl_Scope0.verify_email_pl
              /*
                  -- GENERATED --
                  DATE: Tue May 30 13:58:27 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/account/signup/email/verify_email_pl.scala.txt
                  HASH: a2593454c4264f7ba9ee11192824b758a7f737ca
                  MATRIX: 583->1|746->70|779->77|803->81|916->169|951->184|979->186
                  LINES: 20->1|25->1|25->1|25->1|31->7|31->7|33->9
                  -- GENERATED --
              */
          