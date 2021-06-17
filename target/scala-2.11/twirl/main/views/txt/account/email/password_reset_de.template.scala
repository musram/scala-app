
package views.txt.account.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object password_reset_de_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.txt._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class password_reset_de extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String, token: String, name: String, email: String):play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""Hey """),_display_(/*1.64*/name),format.raw/*1.68*/(""",


du oder jemand anderes hat die Möglichkeit zum Zurücksetzen deines Passwortes genutzt.
Falls dies nicht du selbst oder deine Absicht war, kannst du diese E-Mail einfach ignorieren.

Falls du dein Passwort zurücksetzen möchtest, musst du nur diesem Link folgen:

"""),_display_(/*9.2*/url),format.raw/*9.5*/("""

"""),format.raw/*11.1*/("""Grüße,
Das PlayAuthenticate-Team"""))
      }
    }
  }

  def render(url:String,token:String,name:String,email:String): play.twirl.api.TxtFormat.Appendable = apply(url,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.TxtFormat.Appendable) = (url,token,name,email) => apply(url,token,name,email)

  def ref: this.type = this

}


}

/**/
object password_reset_de extends password_reset_de_Scope0.password_reset_de
              /*
                  -- GENERATED --
                  DATE: Tue May 30 13:58:27 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/account/email/password_reset_de.scala.txt
                  HASH: 3580a1f3167ed1ff67e1a877e0e2fcaf5951dd9e
                  MATRIX: 580->1|731->58|762->63|786->67|1078->334|1100->337|1129->339
                  LINES: 20->1|25->1|25->1|25->1|33->9|33->9|35->11
                  -- GENERATED --
              */
          