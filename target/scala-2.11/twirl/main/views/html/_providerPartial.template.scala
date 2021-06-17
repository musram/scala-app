
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object _providerPartial_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object _providerPartial_Scope1 {
import be.objectify.deadbolt.scala._

class _providerPartial extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[com.feth.play.module.pa.PlayAuthenticate,Boolean,MessagesApi,AuthenticatedRequest[Any],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(playAuth: com.feth.play.module.pa.PlayAuthenticate, skipCurrent: Boolean = true)(implicit messagesApi: MessagesApi, request: AuthenticatedRequest[Any]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import com.feth.play.module.pa.views.html._

Seq[Any](format.raw/*3.154*/("""

"""),format.raw/*6.1*/("""
"""),format.raw/*7.1*/("""<script type="text/javascript">
function askOpenID(url) """),format.raw/*8.25*/("""{"""),format.raw/*8.26*/("""
	"""),format.raw/*9.2*/("""var openid = prompt("Please enter your OpenID:", "yourname.myopenid.com");
	if(openid) """),format.raw/*10.13*/("""{"""),format.raw/*10.14*/("""
		"""),format.raw/*11.3*/("""window.location.href = url + "?p=" + encodeURIComponent(openid);
	"""),format.raw/*12.2*/("""}"""),format.raw/*12.3*/("""
"""),format.raw/*13.1*/("""}"""),format.raw/*13.2*/("""
"""),format.raw/*14.1*/("""</script>

"""),_display_(/*16.2*/play/*16.6*/.core.j.JavaHelpers.withContext(request)/*16.46*/ { jContext =>_display_(Seq[Any](format.raw/*16.60*/("""
    """),_display_(/*17.6*/forProviders(playAuth, skipCurrent)/*17.41*/ { p =>_display_(Seq[Any](format.raw/*17.48*/("""
        """),_display_(/*18.10*/defining(p.getKey().head.toUpper + p.getKey().tail)/*18.61*/ { label =>_display_(Seq[Any](format.raw/*18.72*/("""
            """),_display_(/*19.14*/if(p.getKey() == "openid")/*19.40*/ {_display_(Seq[Any](format.raw/*19.42*/("""
                """),format.raw/*20.17*/("""<a href="javascript:void(0);" class="btn btn-link-1 btn-link-1-"""),_display_(/*20.81*/p/*20.82*/.getKey()),format.raw/*20.91*/("""" onclick="askOpenID('"""),_display_(/*20.114*/p/*20.115*/.getUrl()),format.raw/*20.124*/("""');"><i class="fa fa-"""),_display_(/*20.146*/p/*20.147*/.getKey()),format.raw/*20.156*/(""""></i> """),_display_(/*20.164*/label),format.raw/*20.169*/("""</a>
            """)))}/*21.15*/else/*21.20*/{_display_(Seq[Any](format.raw/*21.21*/("""
                """),format.raw/*22.17*/("""<a href=""""),_display_(/*22.27*/p/*22.28*/.getUrl()),format.raw/*22.37*/("""" class="btn btn-link-1 btn-link-1-"""),_display_(/*22.73*/p/*22.74*/.getKey()),format.raw/*22.83*/(""""><i class="fa fa-"""),_display_(/*22.102*/p/*22.103*/.getKey()),format.raw/*22.112*/(""""></i> """),_display_(/*22.120*/label),format.raw/*22.125*/("""</a>
            """)))}),format.raw/*23.14*/("""
        """)))}),format.raw/*24.10*/("""
    """)))}),format.raw/*25.6*/("""
""")))}))
      }
    }
  }

  def render(playAuth:com.feth.play.module.pa.PlayAuthenticate,skipCurrent:Boolean,messagesApi:MessagesApi,request:AuthenticatedRequest[Any]): play.twirl.api.HtmlFormat.Appendable = apply(playAuth,skipCurrent)(messagesApi,request)

  def f:((com.feth.play.module.pa.PlayAuthenticate,Boolean) => (MessagesApi,AuthenticatedRequest[Any]) => play.twirl.api.HtmlFormat.Appendable) = (playAuth,skipCurrent) => (messagesApi,request) => apply(playAuth,skipCurrent)(messagesApi,request)

  def ref: this.type = this

}


}
}

/**/
object _providerPartial extends _providerPartial_Scope0._providerPartial_Scope1._providerPartial
              /*
                  -- GENERATED --
                  DATE: Tue May 30 13:58:27 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/_providerPartial.scala.html
                  HASH: 795b051c7789c4841580b934defde5aa5517747b
                  MATRIX: 705->40|996->192|1024->239|1051->240|1134->296|1162->297|1190->299|1305->386|1334->387|1364->390|1457->456|1485->457|1513->458|1541->459|1569->460|1607->472|1619->476|1668->516|1720->530|1752->536|1796->571|1841->578|1878->588|1938->639|1987->650|2028->664|2063->690|2103->692|2148->709|2239->773|2249->774|2279->783|2330->806|2341->807|2372->816|2422->838|2433->839|2464->848|2500->856|2527->861|2564->880|2577->885|2616->886|2661->903|2698->913|2708->914|2738->923|2801->959|2811->960|2841->969|2888->988|2899->989|2930->998|2966->1006|2993->1011|3042->1029|3083->1039|3119->1045
                  LINES: 23->3|28->3|30->6|31->7|32->8|32->8|33->9|34->10|34->10|35->11|36->12|36->12|37->13|37->13|38->14|40->16|40->16|40->16|40->16|41->17|41->17|41->17|42->18|42->18|42->18|43->19|43->19|43->19|44->20|44->20|44->20|44->20|44->20|44->20|44->20|44->20|44->20|44->20|44->20|44->20|45->21|45->21|45->21|46->22|46->22|46->22|46->22|46->22|46->22|46->22|46->22|46->22|46->22|46->22|46->22|47->23|48->24|49->25
                  -- GENERATED --
              */
          