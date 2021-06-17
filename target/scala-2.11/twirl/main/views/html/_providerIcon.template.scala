
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object _providerIcon_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class _providerIcon extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(providerKey: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.23*/("""
"""),format.raw/*2.1*/("""<img alt=""""),_display_(/*2.12*/providerKey),format.raw/*2.23*/(""" """),format.raw/*2.24*/("""icon" title=""""),_display_(/*2.38*/providerKey),format.raw/*2.49*/("""" src=""""),_display_(/*2.57*/routes/*2.63*/.Assets.versioned("icons/"+providerKey+"-24x24.png")),format.raw/*2.115*/("""">"""))
      }
    }
  }

  def render(providerKey:String): play.twirl.api.HtmlFormat.Appendable = apply(providerKey)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (providerKey) => apply(providerKey)

  def ref: this.type = this

}


}

/**/
object _providerIcon extends _providerIcon_Scope0._providerIcon
              /*
                  -- GENERATED --
                  DATE: Tue May 30 13:58:27 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/_providerIcon.scala.html
                  HASH: 6fb6958b13673b98da7d8e1a8c5a51e5934f1bd4
                  MATRIX: 543->1|659->22|686->23|723->34|754->45|782->46|822->60|853->71|887->79|901->85|974->137
                  LINES: 20->1|25->1|26->2|26->2|26->2|26->2|26->2|26->2|26->2|26->2|26->2
                  -- GENERATED --
              */
          