
package views.txt.account.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object password_reset_en_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.txt._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class password_reset_en extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String, token: String, name: String, email: String):play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""Howdy """),_display_(/*1.66*/name),format.raw/*1.70*/(""",


You or someone else requested a password reset for your account.
If this was not you or your intention, just relax and ignore this email.

If you wish to reset your password, all you need to do is follow this link to reset your password:
"""),_display_(/*8.2*/url),format.raw/*8.5*/("""

"""),format.raw/*10.1*/("""Cheers,
The PlayAuthenticate Team"""))
      }
    }
  }

  def render(url:String,token:String,name:String,email:String): play.twirl.api.TxtFormat.Appendable = apply(url,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.TxtFormat.Appendable) = (url,token,name,email) => apply(url,token,name,email)

  def ref: this.type = this

}


}

/**/
object password_reset_en extends password_reset_en_Scope0.password_reset_en
              /*
                  -- GENERATED --
                  DATE: Tue May 30 13:58:27 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/account/email/password_reset_en.scala.txt
                  HASH: 01c9341e42b9fb3d4cfda2de4edd5b6859a66d16
                  MATRIX: 580->1|731->58|764->65|788->69|1056->312|1078->315|1107->317
                  LINES: 20->1|25->1|25->1|25->1|32->8|32->8|34->10
                  -- GENERATED --
              */
          