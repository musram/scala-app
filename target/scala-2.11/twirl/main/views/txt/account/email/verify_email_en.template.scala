
package views.txt.account.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object verify_email_en_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.txt._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class verify_email_en extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.71*/("""Howdy """),_display_(/*1.78*/name),format.raw/*1.82*/(""", 


To verify your e-mail address, follow this link now:
"""),_display_(/*5.2*/verificationUrl),format.raw/*5.17*/("""

"""),format.raw/*7.1*/("""Cheers,
The PlayAuthenticate Team"""))
      }
    }
  }

  def render(verificationUrl:String,token:String,name:String,email:String): play.twirl.api.TxtFormat.Appendable = apply(verificationUrl,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.TxtFormat.Appendable) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)

  def ref: this.type = this

}


}

/**/
object verify_email_en extends verify_email_en_Scope0.verify_email_en
              /*
                  -- GENERATED --
                  DATE: Tue May 30 13:58:27 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/account/email/verify_email_en.scala.txt
                  HASH: 2a94b4b4570ecb7376c355bc7a2c6556142c098e
                  MATRIX: 576->1|739->70|772->77|796->81|880->140|915->155|943->157
                  LINES: 20->1|25->1|25->1|25->1|29->5|29->5|31->7
                  -- GENERATED --
              */
          