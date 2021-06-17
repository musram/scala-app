
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object index_Scope1 {
import play.api.Play.current
import play.Configuration
import services.UserService
import play.api.mvc._
import be.objectify.deadbolt.scala._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[UserService,AuthenticatedRequest[Any],MessagesApi,WebJarAssets,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(userService: UserService)(implicit request: AuthenticatedRequest[Any], messagesApi: MessagesApi, webJarAssets: WebJarAssets):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.127*/("""

"""),_display_(/*9.2*/main(userService, messagesApi("playauthenticate.index.title"))/*9.64*/ {_display_(Seq[Any](format.raw/*9.66*/("""

"""),format.raw/*11.1*/("""<!-- Main jumbotron for a primary marketing message or call to action -->
<div class="jumbotron">
    <h1>"""),_display_(/*13.10*/messagesApi("playauthenticate.index.intro")),format.raw/*13.53*/("""</h1>
    <p>"""),_display_(/*14.9*/messagesApi("playauthenticate.index.intro_2")),format.raw/*14.54*/(""" """),format.raw/*14.55*/("""<br/>"""),_display_(/*14.61*/messagesApi("playauthenticate.index.intro_3")),format.raw/*14.106*/("""</p>
</div>

<!-- Example row of columns -->
<div class="row">
    <div class="col-xs-6 col-sm-4">
        <h2>"""),_display_(/*20.14*/messagesApi("playauthenticate.index.heading")),format.raw/*20.59*/("""</h2>
        <p>Cupcake ipsum dolor sit amet. Pastry pie powder biscuit bear claw. Jelly-o chocolate bar sweet roll sugar plum chocolate. Biscuit brownie chupa chups macaroon ice cream halvah sugar plum oat cake ice cream.</p>
        <p><a class="btn" href="#">"""),_display_(/*22.37*/messagesApi("playauthenticate.index.details")),format.raw/*22.82*/(""" """),format.raw/*22.83*/("""&raquo;</a></p>
    </div>
    <div class="col-xs-6 col-sm-4">
        <h2>"""),_display_(/*25.14*/messagesApi("playauthenticate.index.heading")),format.raw/*25.59*/("""</h2>
        <p>Applicake macaroon caramels gummi bears pastry. Cake liquorice carrot cake chocolate lollipop dessert. Halvah fruitcake marshmallow pie gummi bears pie marzipan.</p>
        <p><a class="btn" href="#">"""),_display_(/*27.37*/messagesApi("playauthenticate.index.details")),format.raw/*27.82*/(""" """),format.raw/*27.83*/("""&raquo;</a></p>
    </div>
    <div class="col-xs-6 col-sm-4">
        <h2>"""),_display_(/*30.14*/messagesApi("playauthenticate.index.heading")),format.raw/*30.59*/("""</h2>
        <p>Wafer halvah jujubes lollipop liquorice jelly-o pastry. Pie halvah toffee. Candy canes donut sugar plum. Chocolate cake powder tart liquorice cotton candy pudding sweet.</p>
        <p><a class="btn" href="#">"""),_display_(/*32.37*/messagesApi("playauthenticate.index.details")),format.raw/*32.82*/(""" """),format.raw/*32.83*/("""&raquo;</a></p>
    </div>
</div>


""")))}))
      }
    }
  }

  def render(userService:UserService,request:AuthenticatedRequest[Any],messagesApi:MessagesApi,webJarAssets:WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(userService)(request,messagesApi,webJarAssets)

  def f:((UserService) => (AuthenticatedRequest[Any],MessagesApi,WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (userService) => (request,messagesApi,webJarAssets) => apply(userService)(request,messagesApi,webJarAssets)

  def ref: this.type = this

}


}
}

/**/
object index extends index_Scope0.index_Scope1.index
              /*
                  -- GENERATED --
                  DATE: Thu Jun 01 21:37:37 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/index.scala.html
                  HASH: e6f87dc4c1da9d8492249b3c9b80bdca2d2d1b46
                  MATRIX: 753->149|974->274|1002->277|1072->339|1111->341|1140->343|1274->450|1338->493|1378->507|1444->552|1473->553|1506->559|1573->604|1712->716|1778->761|2069->1025|2135->1070|2164->1071|2267->1147|2333->1192|2579->1411|2645->1456|2674->1457|2777->1533|2843->1578|3097->1805|3163->1850|3192->1851
                  LINES: 27->7|32->7|34->9|34->9|34->9|36->11|38->13|38->13|39->14|39->14|39->14|39->14|39->14|45->20|45->20|47->22|47->22|47->22|50->25|50->25|52->27|52->27|52->27|55->30|55->30|57->32|57->32|57->32
                  -- GENERATED --
              */
          