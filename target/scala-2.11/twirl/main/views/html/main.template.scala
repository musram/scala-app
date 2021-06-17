
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object main_Scope1 {
import play.api.Play.current
import services.UserService
import play.api.mvc._
import play.core.j.JavaHelpers
import be.objectify.deadbolt.scala._
import constants._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template8[UserService,String,String,Html,Lang,AuthenticatedRequest[Any],MessagesApi,WebJarAssets,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*8.2*/(userService: UserService, title: String = " ", nav: String = "")(content: Html)(implicit lang: Lang, request: AuthenticatedRequest[Any], messagesApi: MessagesApi, webJarAssets: WebJarAssets):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import be.objectify.deadbolt.scala.views.html._

Seq[Any](format.raw/*8.193*/("""

"""),format.raw/*11.1*/("""
"""),format.raw/*12.1*/("""<!DOCTYPE html>
<html lang=""""),_display_(/*13.14*/lang/*13.18*/.code),format.raw/*13.23*/("""">
<head>
    <title>"""),_display_(/*15.13*/title),format.raw/*15.18*/("""</title>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Play Authenticate - an authentication module for the Play! Framework 2.0">
    <meta name="author" content="The Play Authenticate Team">

    <link rel="stylesheet" href=""""),_display_(/*22.35*/routes/*22.41*/.WebJarAssets.at(webJarAssets.locate("bootstrap.min.css"))),format.raw/*22.99*/("""">
    <link rel="stylesheet" href=""""),_display_(/*23.35*/routes/*23.41*/.WebJarAssets.at(webJarAssets.locate("font-awesome.min.css"))),format.raw/*23.102*/("""">
    <link rel="stylesheet" href=""""),_display_(/*24.35*/routes/*24.41*/.WebJarAssets.at(webJarAssets.locate("bootstrap-datepicker3.css"))),format.raw/*24.107*/("""">
    <link rel="stylesheet" id="css-main" href=""""),_display_(/*25.49*/routes/*25.55*/.Assets.versioned("css/oneui.css")),format.raw/*25.89*/("""">


    <link rel="stylesheet" href=""""),_display_(/*28.35*/routes/*28.41*/.Assets.versioned("js/plugins/sweetalert2/sweetalert2.min.css")),format.raw/*28.104*/("""">
    <link rel="stylesheet" href=""""),_display_(/*29.35*/routes/*29.41*/.Assets.versioned("js/plugins/datatables/jquery.dataTables.min.css")),format.raw/*29.109*/("""">



    <script type="text/javascript" src=""""),_display_(/*33.42*/routes/*33.48*/.WebJarAssets.at(webJarAssets.locate("jquery.min.js"))),format.raw/*33.102*/(""""></script>
    <script type="text/javascript" src=""""),_display_(/*34.42*/routes/*34.48*/.WebJarAssets.at(webJarAssets.locate("bootstrap.min.js"))),format.raw/*34.105*/(""""></script>
    <script type="text/javascript" src=""""),_display_(/*35.42*/routes/*35.48*/.WebJarAssets.at(webJarAssets.locate("bootstrap-datepicker.js"))),format.raw/*35.112*/(""""></script>


    <script type="text/javascript" src=""""),_display_(/*38.42*/routes/*38.48*/.Assets.versioned("js/core/jquery.slimscroll.min.js")),format.raw/*38.101*/(""""></script>
    <script type="text/javascript" src=""""),_display_(/*39.42*/routes/*39.48*/.Assets.versioned("js/core/jquery.scrollLock.min.js")),format.raw/*39.101*/(""""></script>
    <script type="text/javascript" src=""""),_display_(/*40.42*/routes/*40.48*/.Assets.versioned("js/core/jquery.appear.min.js")),format.raw/*40.97*/(""""></script>
    <script type="text/javascript" src=""""),_display_(/*41.42*/routes/*41.48*/.Assets.versioned("js/core/jquery.countTo.min.js")),format.raw/*41.98*/(""""></script>
    <script type="text/javascript" src=""""),_display_(/*42.42*/routes/*42.48*/.Assets.versioned("js/core/jquery.placeholder.min.js")),format.raw/*42.102*/(""""></script>
    <script type="text/javascript" src=""""),_display_(/*43.42*/routes/*43.48*/.Assets.versioned("js/core/js.cookie.min.js")),format.raw/*43.93*/(""""></script>
    <script type="text/javascript" src=""""),_display_(/*44.42*/routes/*44.48*/.Assets.versioned("js/app.js")),format.raw/*44.78*/(""""></script>




    <script type="text/javascript" src=""""),_display_(/*49.42*/routes/*49.48*/.Application.jsRoutes),format.raw/*49.69*/("""" defer="defer"></script>
</head>

<body>

"""),_display_(/*54.2*/subjectPresentOr()/*54.20*/ {_display_(Seq[Any](format.raw/*54.22*/("""
"""),_display_(/*55.2*/defining(userService.findInSession(JavaHelpers.createJavaContext(request).session()))/*55.87*/ { userOption =>_display_(Seq[Any](format.raw/*55.103*/("""
    """),_display_(/*56.6*/userOption/*56.16*/.map/*56.20*/ {  user =>_display_(Seq[Any](format.raw/*56.31*/("""
        """),format.raw/*57.9*/("""<!-- Page Container -->
        <!--
            Available Classes:

            'enable-cookies'             Remembers active color theme between pages (when set through color theme list)

            'sidebar-l'                  Left Sidebar and right Side Overlay
            'sidebar-r'                  Right Sidebar and left Side Overlay
            'sidebar-mini'               Mini hoverable Sidebar (> 991px)
            'sidebar-o'                  Visible Sidebar by default (> 991px)
            'sidebar-o-xs'               Visible Sidebar by default (< 992px)

            'side-overlay-hover'         Hoverable Side Overlay (> 991px)
            'side-overlay-o'             Visible Side Overlay by default (> 991px)

            'side-scroll'                Enables custom scrolling on Sidebar and Side Overlay instead of native scrolling (> 991px)

            'header-navbar-fixed'        Enables fixed header
        -->
        <div id="page-container" class="sidebar-l sidebar-o side-scroll header-navbar-fixed">

            <!-- Sidebar -->
            <nav id="sidebar">
                <!-- Sidebar Scroll Container -->
                <div id="sidebar-scroll">
                    <!-- Sidebar Content -->
                    <!-- Adding .sidebar-mini-hide to an element will hide it when the sidebar is in mini mode -->
                    <div class="sidebar-content">
                        <!-- Side Header -->
                        <div class="side-header side-content bg-white-op">
                            <!-- Layout API, functionality initialized in App() -> uiLayoutApi() -->
                            <button class="btn btn-link text-gray pull-right hidden-md hidden-lg" type="button" data-toggle="layout" data-action="sidebar_close">
                                <i class="fa fa-times"></i>
                            </button>
                            <!-- Themes functionality initialized in App() -> uiHandleTheme() -->
                            <div class="btn-group pull-right">
                                <button class="btn btn-link text-gray dropdown-toggle" data-toggle="dropdown" type="button">
                                    <i class="si si-drop"></i>
                                </button>
                                <ul class="dropdown-menu dropdown-menu-right font-s13 sidebar-mini-hide">
                                    <li>
                                        <a data-toggle="theme" data-theme="default" tabindex="-1" href="javascript:void(0)">
                                            <i class="fa fa-circle text-default pull-right"></i> <span class="font-w600">Default</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a data-toggle="theme" data-theme="assets/css/themes/amethyst.min.css" tabindex="-1" href="javascript:void(0)">
                                            <i class="fa fa-circle text-amethyst pull-right"></i> <span class="font-w600">Amethyst</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a data-toggle="theme" data-theme="assets/css/themes/city.min.css" tabindex="-1" href="javascript:void(0)">
                                            <i class="fa fa-circle text-city pull-right"></i> <span class="font-w600">City</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a data-toggle="theme" data-theme="assets/css/themes/flat.min.css" tabindex="-1" href="javascript:void(0)">
                                            <i class="fa fa-circle text-flat pull-right"></i> <span class="font-w600">Flat</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a data-toggle="theme" data-theme="assets/css/themes/modern.min.css" tabindex="-1" href="javascript:void(0)">
                                            <i class="fa fa-circle text-modern pull-right"></i> <span class="font-w600">Modern</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a data-toggle="theme" data-theme="assets/css/themes/smooth.min.css" tabindex="-1" href="javascript:void(0)">
                                            <i class="fa fa-circle text-smooth pull-right"></i> <span class="font-w600">Smooth</span>
                                        </a>
                                    </li>
                                </ul>
                            </div>
                            <a class="h5 text-white" href="index.html">
                                <i class="fa fa-circle-o-notch text-primary"></i> <span class="h4 font-w600 sidebar-mini-hide">ne</span>
                            </a>
                        </div>
                        <!-- END Side Header -->

                        <!-- Side Content -->
                        <div class="side-content">
                            <ul class="nav-main">
                                <li class=""""),_display_(/*138.45*/("active".when(nav == ""))),format.raw/*138.71*/("""">
                                <a class="active" href=""""),_display_(/*139.58*/routes/*139.64*/.Application.index()),format.raw/*139.84*/(""""><i class="si si-speedometer"></i><span class="sidebar-mini-hide">Dashboard</span></a>
                                </li>
                                <li>
                                    <a class="nav-submenu" data-toggle="nav-submenu" href="#"><i class="si si-badge"></i><span class="sidebar-mini-hide"> Manage Configuration</span></a>
                                    <ul>
                                        <li>
                                            <a href="">Widgets</a>
                                        </li>bu
                                    </ul>
                                </li>
                                <li>
                                    <a class="nav-submenu" data-toggle="nav-submenu" href="#"><i class="si si-grid"></i><span class="sidebar-mini-hide">Manage User</span></a>
                                    <ul>
                                        <li>
                                            <a href="">Styles</a>
                                        </li>

                                    </ul>
                                </li>
                                <li>
                                    <a class="nav-submenu" data-toggle="nav-submenu" href="#"><i class="si si-grid"></i><span class="sidebar-mini-hide">Uploads</span></a>
                                    <ul>
                                        <li class=""""),_display_(/*161.53*/("active".when(nav == "customerdata"))),format.raw/*161.91*/("""">
                                        <a href=""""),_display_(/*162.51*/routes/*162.57*/.Upload.upload()),format.raw/*162.73*/("""">Customer Data</a>
                                        </li>
                                    </ul>
                                </li>
                                <li>
                                    <a class="nav-submenu" data-toggle="nav-submenu" href="#"><i class="si si-grid"></i><span class="sidebar-mini-hide">Manage Promotion </span></a>
                                    <ul>
                                        <li class=""""),_display_(/*169.53*/("active".when(nav == "promotions"))),format.raw/*169.89*/("""">
                                        <a href="">Promotions</a>
                                        </li>
                                        <li class=""""),_display_(/*172.53*/("active".when(nav == "filters"))),format.raw/*172.86*/("""">
                                        <a href="">Filters</a>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                        <!-- END Side Content -->
                    </div>
                    <!-- Sidebar Content -->
                </div>
                <!-- END Sidebar Scroll Container -->
            </nav>
            <!-- END Sidebar -->

            <!-- Header -->
            <header id="header-navbar" class="content-mini content-mini-full">
                <!-- Header Navigation Right -->
                <ul class="nav-header pull-right">
                    <li>
                        <div class="btn-group">
                            <button class="btn btn-default btn-image dropdown-toggle" data-toggle="dropdown" type="button">
                                <img src="assets/img/avatars/avatar10.jpg" alt="Avatar"> """),_display_(/*194.91*/user/*194.95*/.username),format.raw/*194.104*/("""
                                """),format.raw/*195.33*/("""<span class="caret"></span>
                            </button>
                            <ul class="dropdown-menu dropdown-menu-right">
                                <li class="dropdown-header">Profile</li>
                                <li>
                                    <a tabindex="-1" href=""""),_display_(/*200.61*/routes/*200.67*/.Application.profile()),format.raw/*200.89*/("""">
                                        <i class="si si-user pull-right"></i>
                                        <span class="badge badge-success pull-right">1</span>Profile
                                    </a>
                                </li>
                                <li class="divider"></li>
                                <li class="dropdown-header">Actions</li>
                                <li>
                                    <a tabindex="-1" href=""""),_display_(/*208.61*/com/*208.64*/.feth.play.module.pa.controllers.routes.Authenticate.logout()),format.raw/*208.125*/("""">
                                        <i class="si si-logout pull-right"></i>Log out
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </li>
                </ul>
                <!-- END Header Navigation Right -->

                <!-- Header Navigation Left -->
                <ul class="nav-header pull-left">
                    <li class="hidden-md hidden-lg">
                        <!-- Layout API, functionality initialized in App() -> uiLayoutApi() -->
                        <button class="btn btn-default" data-toggle="layout" data-action="sidebar_toggle" type="button">
                            <i class="fa fa-navicon"></i>
                        </button>
                    </li>
                    <li class="hidden-xs hidden-sm">
                        <!-- Layout API, functionality initialized in App() -> uiLayoutApi() -->
                        <button class="btn btn-default" data-toggle="layout" data-action="sidebar_mini_toggle" type="button">
                            <i class="fa fa-ellipsis-v"></i>
                        </button>
                    </li>
                    <li>
                        <!-- Opens the Apps modal found at the bottom of the page, before including JS code -->
                        <button class="btn btn-default pull-right" data-toggle="modal" data-target="#apps-modal" type="button">
                            <i class="si si-grid"></i>
                        </button>
                    </li>
                    <li class="visible-xs">
                        <!-- Toggle class helper (for .js-header-search below), functionality initialized in App() -> uiToggleClass() -->
                        <button class="btn btn-default" data-toggle="class-toggle" data-target=".js-header-search" data-class="header-search-xs-visible" type="button">
                            <i class="fa fa-search"></i>
                        </button>
                    </li>
                    <li class="js-header-search header-search">
                        <form class="form-horizontal" action="base_pages_search.html" method="post">
                            <div class="form-material form-material-primary input-group remove-margin-t remove-margin-b">
                                <input class="form-control" type="text" id="base-material-text" name="base-material-text" placeholder="Search..">
                                <span class="input-group-addon"><i class="si si-magnifier"></i></span>
                            </div>
                        </form>
                    </li>
                    <li>
                        """),_display_(/*253.26*/request/*253.33*/.flash.get(FlashKey.FLASH_ERROR_KEY).map/*253.73*/ { errorMessage =>_display_(Seq[Any](format.raw/*253.91*/("""
                        """),format.raw/*254.25*/("""<!-- Danger Alert -->
                        <div class="alert alert-danger alert-dismissable">
                            <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                            <h20 class="font-w300 push-15">Error</h20>
                            <p>"""),_display_(/*258.33*/errorMessage),format.raw/*258.45*/("""</p>
                        </div>
                        """)))}),format.raw/*260.26*/("""
                    """),format.raw/*261.21*/("""</li>
                    <li>
                        """),_display_(/*263.26*/request/*263.33*/.flash.get(FlashKey.FLASH_MESSAGE_KEY).map/*263.75*/ { message =>_display_(Seq[Any](format.raw/*263.88*/("""
                        """),format.raw/*264.25*/("""<!-- Info Alert -->
                        <div class="alert alert-info alert-dismissable">
                            <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                            <h10 class="font-w300 push-15">Information</h10>
                            <p>"""),_display_(/*268.33*/message),format.raw/*268.40*/("""</p>
                        </div>
                        <!-- END Info Alert -->
                        """)))}),format.raw/*271.26*/("""

                    """),format.raw/*273.21*/("""</li>

                </ul>
                <!-- END Header Navigation Left -->
            </header>
            <!-- END Header -->

            <!-- Main Container -->
            <main id="main-container">
                <!-- Place here the Page Header(has breadcrump) and the page content -->
                 """),_display_(/*283.19*/content),format.raw/*283.26*/("""
                """),format.raw/*284.17*/("""<!-- END Page Content -->
            </main>
            <!-- END Main Container -->

            <!-- Footer -->
            <footer id="page-footer" class="content-mini content-mini-full font-s12 bg-gray-lighter clearfix">
                <div class="pull-right">
                    Crafted with <i class="fa fa-heart text-city"></i> by <a class="font-w600" href="http://goo.gl/vNS3I" target="_blank">pixelcave</a>
                </div>
                <div class="pull-left">
                    <a class="font-w600" href="http://goo.gl/6LF10W" target="_blank">OneUI 3.1</a> &copy; <span class="js-year-copy"></span>
                </div>
            </footer>
            <!-- END Footer -->
        </div>
        <!-- END Page Container -->

        <!-- Apps Modal -->
        <!-- Opens from the button in the header -->
        <div class="modal fade" id="apps-modal" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-sm modal-dialog modal-dialog-top">
                <div class="modal-content">
                    <!-- Apps Block -->
                    <div class="block block-themed block-transparent">
                        <div class="block-header bg-primary-dark">
                            <ul class="block-options">
                                <li>
                                    <button data-dismiss="modal" type="button"><i class="si si-close"></i></button>
                                </li>
                            </ul>
                            <h3 class="block-title">Apps</h3>
                        </div>
                        <div class="block-content">
                            <div class="row text-center">
                                <div class="col-xs-6">
                                    <a class="block block-rounded" href="base_pages_dashboard.html">
                                        <div class="block-content text-white bg-default">
                                            <i class="si si-speedometer fa-2x"></i>
                                            <div class="font-w600 push-15-t push-15">Backend</div>
                                        </div>
                                    </a>
                                </div>
                                <div class="col-xs-6">
                                    <a class="block block-rounded" href="frontend_home.html">
                                        <div class="block-content text-white bg-modern">
                                            <i class="si si-rocket fa-2x"></i>
                                            <div class="font-w600 push-15-t push-15">Frontend</div>
                                        </div>
                                    </a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- END Apps Block -->
                </div>
            </div>
        </div>
        <!-- END Apps Modal -->
       """)))}),format.raw/*342.9*/("""
    """)))}),format.raw/*343.6*/("""
""")))}/*344.2*/{_display_(Seq[Any](format.raw/*344.3*/("""

""")))}),format.raw/*346.2*/("""

"""),_display_(/*348.2*/subjectNotPresent()/*348.21*/ {_display_(Seq[Any](format.raw/*348.23*/("""
        """),format.raw/*349.9*/("""<main id="main-container">
            """),_display_(/*350.14*/request/*350.21*/.flash.get(FlashKey.FLASH_ERROR_KEY).map/*350.61*/ { errorMessage =>_display_(Seq[Any](format.raw/*350.79*/("""
            """),format.raw/*351.13*/("""<div class="row">
                <div class="col-sm-6 col-sm-offset-3">
                    <!-- Danger Alert -->
                    <div class="alert alert-danger alert-dismissable">
                        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                        <h3 class="font-w300 push-15">Error</h3>
                        <p>"""),_display_(/*357.29*/errorMessage),format.raw/*357.41*/("""</p>
                    </div>
                    <!-- END Danger Alert -->
                </div>
            </div>
            """)))}),format.raw/*362.14*/("""

            """),_display_(/*364.14*/request/*364.21*/.flash.get(FlashKey.FLASH_MESSAGE_KEY).map/*364.63*/ { message =>_display_(Seq[Any](format.raw/*364.76*/("""
            """),format.raw/*365.13*/("""<div class="row">
                <div class="col-sm-6 col-lg-3">
                    <!-- Info Alert -->
                    <div class="alert alert-info alert-dismissable">
                        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                        <h3 class="font-w300 push-15">Information</h3>
                        <p>"""),_display_(/*371.29*/message),format.raw/*371.36*/("""</p>
                    </div>
                    <!-- END Info Alert -->

                </div>
            </div>
            """)))}),format.raw/*377.14*/("""
            """),_display_(/*378.14*/content),format.raw/*378.21*/("""

            """),format.raw/*380.13*/("""<hr>


        </main> <!-- /container -->
""")))}),format.raw/*384.2*/("""
"""),format.raw/*385.1*/("""<!-- Page JS Code -->
<script type="text/javascript" src=""""),_display_(/*386.38*/routes/*386.44*/.Assets.versioned("js/pages/base_pages_dashboard.js")),format.raw/*386.97*/(""""></script>

<script type="text/javascript" src=""""),_display_(/*388.38*/routes/*388.44*/.Assets.versioned("js/plugins/bootstrap-notify/bootstrap-notify.min.js")),format.raw/*388.116*/(""""></script>
<script type="text/javascript" src=""""),_display_(/*389.38*/routes/*389.44*/.Assets.versioned("js/plugins/sweetalert2/es6-promise.auto.min.js")),format.raw/*389.111*/(""""></script>
<script type="text/javascript" src=""""),_display_(/*390.38*/routes/*390.44*/.Assets.versioned("js/plugins/sweetalert2/sweetalert2.min.js")),format.raw/*390.106*/(""""></script>


<script type="text/javascript" src=""""),_display_(/*393.38*/routes/*393.44*/.Assets.versioned("js/pages/base_ui_activity.js")),format.raw/*393.93*/(""""></script>


</body>
</html>
"""))
      }
    }
  }

  def render(userService:UserService,title:String,nav:String,content:Html,lang:Lang,request:AuthenticatedRequest[Any],messagesApi:MessagesApi,webJarAssets:WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(userService,title,nav)(content)(lang,request,messagesApi,webJarAssets)

  def f:((UserService,String,String) => (Html) => (Lang,AuthenticatedRequest[Any],MessagesApi,WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (userService,title,nav) => (content) => (lang,request,messagesApi,webJarAssets) => apply(userService,title,nav)(content)(lang,request,messagesApi,webJarAssets)

  def ref: this.type = this

}


}
}

/**/
object main extends main_Scope0.main_Scope1.main
              /*
                  -- GENERATED --
                  DATE: Fri Jun 02 10:36:59 IST 2017
                  SOURCE: /home/msr/withBalaji/play-authenticate-usage-scala-master-version4/app/views/main.scala.html
                  HASH: 4cc4965cc779557f7e9750b622c48c6845c11f36
                  MATRIX: 798->174|1132->365|1161->416|1189->417|1245->446|1258->450|1284->455|1333->477|1359->482|1706->802|1721->808|1800->866|1864->903|1879->909|1962->970|2026->1007|2041->1013|2129->1079|2207->1130|2222->1136|2277->1170|2343->1209|2358->1215|2443->1278|2507->1315|2522->1321|2612->1389|2686->1436|2701->1442|2777->1496|2857->1549|2872->1555|2951->1612|3031->1665|3046->1671|3132->1735|3214->1790|3229->1796|3304->1849|3384->1902|3399->1908|3474->1961|3554->2014|3569->2020|3639->2069|3719->2122|3734->2128|3805->2178|3885->2231|3900->2237|3976->2291|4056->2344|4071->2350|4137->2395|4217->2448|4232->2454|4283->2484|4367->2541|4382->2547|4424->2568|4494->2612|4521->2630|4561->2632|4589->2634|4683->2719|4738->2735|4770->2741|4789->2751|4802->2755|4851->2766|4887->2775|10320->8180|10368->8206|10456->8266|10472->8272|10514->8292|11964->9714|12024->9752|12105->9805|12121->9811|12159->9827|12644->10284|12702->10320|12897->10487|12952->10520|13983->11523|13997->11527|14029->11536|14091->11569|14430->11880|14446->11886|14490->11908|15007->12397|15020->12400|15104->12461|17878->15207|17895->15214|17945->15254|18002->15272|18056->15297|18405->15618|18439->15630|18532->15691|18582->15712|18666->15768|18683->15775|18735->15817|18787->15830|18841->15855|19192->16178|19221->16185|19362->16294|19413->16316|19759->16634|19788->16641|19834->16658|22898->19691|22935->19697|22956->19699|22995->19700|23029->19703|23059->19706|23088->19725|23129->19727|23166->19736|23234->19776|23251->19783|23301->19823|23358->19841|23400->19854|23824->20250|23858->20262|24023->20395|24066->20410|24083->20417|24135->20459|24187->20472|24229->20485|24648->20876|24677->20883|24841->21015|24883->21029|24912->21036|24955->21050|25030->21094|25059->21095|25146->21154|25162->21160|25237->21213|25315->21263|25331->21269|25426->21341|25503->21390|25519->21396|25609->21463|25686->21512|25702->21518|25787->21580|25866->21631|25882->21637|25953->21686
                  LINES: 28->8|33->8|35->11|36->12|37->13|37->13|37->13|39->15|39->15|46->22|46->22|46->22|47->23|47->23|47->23|48->24|48->24|48->24|49->25|49->25|49->25|52->28|52->28|52->28|53->29|53->29|53->29|57->33|57->33|57->33|58->34|58->34|58->34|59->35|59->35|59->35|62->38|62->38|62->38|63->39|63->39|63->39|64->40|64->40|64->40|65->41|65->41|65->41|66->42|66->42|66->42|67->43|67->43|67->43|68->44|68->44|68->44|73->49|73->49|73->49|78->54|78->54|78->54|79->55|79->55|79->55|80->56|80->56|80->56|80->56|81->57|162->138|162->138|163->139|163->139|163->139|185->161|185->161|186->162|186->162|186->162|193->169|193->169|196->172|196->172|218->194|218->194|218->194|219->195|224->200|224->200|224->200|232->208|232->208|232->208|277->253|277->253|277->253|277->253|278->254|282->258|282->258|284->260|285->261|287->263|287->263|287->263|287->263|288->264|292->268|292->268|295->271|297->273|307->283|307->283|308->284|366->342|367->343|368->344|368->344|370->346|372->348|372->348|372->348|373->349|374->350|374->350|374->350|374->350|375->351|381->357|381->357|386->362|388->364|388->364|388->364|388->364|389->365|395->371|395->371|401->377|402->378|402->378|404->380|408->384|409->385|410->386|410->386|410->386|412->388|412->388|412->388|413->389|413->389|413->389|414->390|414->390|414->390|417->393|417->393|417->393
                  -- GENERATED --
              */
          