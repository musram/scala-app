
package views.txt.account.email

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object verify_email_pt_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.txt._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class verify_email_pt extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.71*/("""Olá """),_display_(/*1.76*/name),format.raw/*1.80*/(""", 


Para verificar o seu endereço de email, siga esta ligação agora:
"""),_display_(/*5.2*/verificationUrl),format.raw/*5.17*/("""

"""),format.raw/*7.1*/("""Obrigado,
A equipa do PlayAuthenticate"""))
      }
    }
  }

  def render(verificationUrl:String,token:String,name:String,email:String): play.twirl.api.TxtFormat.Appendable = apply(verificationUrl,token,name,email)

  def f:((String,String,String,String) => play.twirl.api.TxtFormat.Appendable) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)

  def ref: this.type = this

}


}

/**/
object verify_email_pt extends verify_email_pt_Scope0.verify_email_pt
              /*
                  -- GENERATED --
                  DATE: Tue May 30 13:58:27 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/account/email/verify_email_pt.scala.txt
                  HASH: 9a190e65cfaf9155131d822df3d661b5706bbb8b
                  MATRIX: 576->1|739->70|770->75|794->79|894->154|929->169|959->173
                  LINES: 20->1|25->1|25->1|25->1|29->5|29->5|31->7
                  -- GENERATED --
              */
          