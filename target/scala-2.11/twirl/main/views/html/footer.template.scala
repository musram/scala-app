
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object footer_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class footer extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<footer id="page-footer" class="content-mini content-mini-full font-s12 bg-gray-lighter clearfix">
    <div class="pull-right">
        Crafted with <i class="fa fa-heart text-city"></i> by <a class="font-w600" href="http://goo.gl/vNS3I" target="_blank">pixelcave</a>
    </div>
    <div class="pull-left">
        <a class="font-w600" href="http://goo.gl/6LF10W" target="_blank">SMYD</a> &copy; <span class="js-year-copy"></span>
    </div>
</footer>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object footer extends footer_Scope0.footer
              /*
                  -- GENERATED --
                  DATE: Tue May 30 22:14:38 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/footer.scala.html
                  HASH: 06863247830de02d9c6802b9f7d86273d4ad1da0
                  MATRIX: 611->0
                  LINES: 25->1
                  -- GENERATED --
              */
          