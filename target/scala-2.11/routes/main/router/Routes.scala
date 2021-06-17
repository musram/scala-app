
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/msr/withBalaji/play-authenticate-usage-scala-master-version4/conf/routes
// @DATE:Fri Jun 02 06:28:18 IST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_6: controllers.Application,
  // @LINE:15
  Authenticate_7: com.feth.play.module.pa.controllers.Authenticate,
  // @LINE:21
  Signup_1: controllers.Signup,
  // @LINE:30
  Account_2: controllers.Account,
  // @LINE:47
  Dashboard_3: controllers.Dashboard,
  // @LINE:49
  Upload_0: controllers.Upload,
  // @LINE:54
  Assets_4: controllers.Assets,
  // @LINE:55
  WebJarAssets_5: controllers.WebJarAssets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_6: controllers.Application,
    // @LINE:15
    Authenticate_7: com.feth.play.module.pa.controllers.Authenticate,
    // @LINE:21
    Signup_1: controllers.Signup,
    // @LINE:30
    Account_2: controllers.Account,
    // @LINE:47
    Dashboard_3: controllers.Dashboard,
    // @LINE:49
    Upload_0: controllers.Upload,
    // @LINE:54
    Assets_4: controllers.Assets,
    // @LINE:55
    WebJarAssets_5: controllers.WebJarAssets
  ) = this(errorHandler, Application_6, Authenticate_7, Signup_1, Account_2, Dashboard_3, Upload_0, Assets_4, WebJarAssets_5, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_6, Authenticate_7, Signup_1, Account_2, Dashboard_3, Upload_0, Assets_4, WebJarAssets_5, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restricted""", """controllers.Application.restricted"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/javascript/routes.js""", """controllers.Application.jsRoutes"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.Application.profile"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Application.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Application.doLogin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """com.feth.play.module.pa.controllers.Authenticate.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authenticate/""" + "$" + """provider<[^/]+>""", """com.feth.play.module.pa.controllers.Authenticate.authenticate(provider:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.Application.signup"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.Application.doSignup"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accounts/unverified""", """controllers.Signup.unverified"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authenticate/""" + "$" + """provider<[^/]+>/denied""", """controllers.Signup.oAuthDenied(provider:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accounts/verify/""" + "$" + """token<[^/]+>""", """controllers.Signup.verify(token:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accounts/exists""", """controllers.Signup.exists"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accounts/password/reset/""" + "$" + """token<[^/]+>""", """controllers.Signup.resetPassword(token:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accounts/password/reset""", """controllers.Signup.doResetPassword"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accounts/password/change""", """controllers.Account.changePassword"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accounts/password/change""", """controllers.Account.doChangePassword"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accounts/verify""", """controllers.Account.verifyEmail"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accounts/add""", """controllers.Account.link"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accounts/link""", """controllers.Account.askLink"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accounts/link""", """controllers.Account.doLink"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accounts/merge""", """controllers.Account.askMerge"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accounts/merge""", """controllers.Account.doMerge"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login/password/forgot""", """controllers.Signup.forgotPassword(email:String ?= "")"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login/password/forgot""", """controllers.Signup.doForgotPassword"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard""", """controllers.Dashboard.dashboard"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customerdata""", """controllers.Upload.upload"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customerdata""", """controllers.Upload.doUpload"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """webjars/""" + "$" + """file<.+>""", """controllers.WebJarAssets.at(file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_6.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Application_restricted1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restricted")))
  )
  private[this] lazy val controllers_Application_restricted1_invoker = createInvoker(
    Application_6.restricted,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "restricted",
      Nil,
      "GET",
      """""",
      this.prefix + """restricted"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_jsRoutes2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/javascript/routes.js")))
  )
  private[this] lazy val controllers_Application_jsRoutes2_invoker = createInvoker(
    Application_6.jsRoutes,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "jsRoutes",
      Nil,
      "GET",
      """""",
      this.prefix + """assets/javascript/routes.js"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_profile3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_Application_profile3_invoker = createInvoker(
    Application_6.profile,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "profile",
      Nil,
      "GET",
      """""",
      this.prefix + """profile"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Application_login4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_login4_invoker = createInvoker(
    Application_6.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Application_doLogin5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_doLogin5_invoker = createInvoker(
    Application_6.doLogin,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "doLogin",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:15
  private[this] lazy val com_feth_play_module_pa_controllers_Authenticate_logout6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val com_feth_play_module_pa_controllers_Authenticate_logout6_invoker = createInvoker(
    Authenticate_7.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.feth.play.module.pa.controllers.Authenticate",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:16
  private[this] lazy val com_feth_play_module_pa_controllers_Authenticate_authenticate7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authenticate/"), DynamicPart("provider", """[^/]+""",true)))
  )
  private[this] lazy val com_feth_play_module_pa_controllers_Authenticate_authenticate7_invoker = createInvoker(
    Authenticate_7.authenticate(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.feth.play.module.pa.controllers.Authenticate",
      "authenticate",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """authenticate/""" + "$" + """provider<[^/]+>"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Application_signup8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_Application_signup8_invoker = createInvoker(
    Application_6.signup,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "signup",
      Nil,
      "GET",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Application_doSignup9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_Application_doSignup9_invoker = createInvoker(
    Application_6.doSignup,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "doSignup",
      Nil,
      "POST",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Signup_unverified10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/unverified")))
  )
  private[this] lazy val controllers_Signup_unverified10_invoker = createInvoker(
    Signup_1.unverified,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Signup",
      "unverified",
      Nil,
      "GET",
      """""",
      this.prefix + """accounts/unverified"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Signup_oAuthDenied11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authenticate/"), DynamicPart("provider", """[^/]+""",true), StaticPart("/denied")))
  )
  private[this] lazy val controllers_Signup_oAuthDenied11_invoker = createInvoker(
    Signup_1.oAuthDenied(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Signup",
      "oAuthDenied",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """authenticate/""" + "$" + """provider<[^/]+>/denied"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Signup_verify12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/verify/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Signup_verify12_invoker = createInvoker(
    Signup_1.verify(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Signup",
      "verify",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """accounts/verify/""" + "$" + """token<[^/]+>"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Signup_exists13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/exists")))
  )
  private[this] lazy val controllers_Signup_exists13_invoker = createInvoker(
    Signup_1.exists,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Signup",
      "exists",
      Nil,
      "GET",
      """""",
      this.prefix + """accounts/exists"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Signup_resetPassword14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/password/reset/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Signup_resetPassword14_invoker = createInvoker(
    Signup_1.resetPassword(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Signup",
      "resetPassword",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """accounts/password/reset/""" + "$" + """token<[^/]+>"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Signup_doResetPassword15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/password/reset")))
  )
  private[this] lazy val controllers_Signup_doResetPassword15_invoker = createInvoker(
    Signup_1.doResetPassword,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Signup",
      "doResetPassword",
      Nil,
      "POST",
      """""",
      this.prefix + """accounts/password/reset"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Account_changePassword16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/password/change")))
  )
  private[this] lazy val controllers_Account_changePassword16_invoker = createInvoker(
    Account_2.changePassword,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "changePassword",
      Nil,
      "GET",
      """""",
      this.prefix + """accounts/password/change"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Account_doChangePassword17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/password/change")))
  )
  private[this] lazy val controllers_Account_doChangePassword17_invoker = createInvoker(
    Account_2.doChangePassword,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "doChangePassword",
      Nil,
      "POST",
      """""",
      this.prefix + """accounts/password/change"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_Account_verifyEmail18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/verify")))
  )
  private[this] lazy val controllers_Account_verifyEmail18_invoker = createInvoker(
    Account_2.verifyEmail,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "verifyEmail",
      Nil,
      "GET",
      """""",
      this.prefix + """accounts/verify"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_Account_link19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/add")))
  )
  private[this] lazy val controllers_Account_link19_invoker = createInvoker(
    Account_2.link,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "link",
      Nil,
      "GET",
      """""",
      this.prefix + """accounts/add"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_Account_askLink20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/link")))
  )
  private[this] lazy val controllers_Account_askLink20_invoker = createInvoker(
    Account_2.askLink,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "askLink",
      Nil,
      "GET",
      """""",
      this.prefix + """accounts/link"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_Account_doLink21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/link")))
  )
  private[this] lazy val controllers_Account_doLink21_invoker = createInvoker(
    Account_2.doLink,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "doLink",
      Nil,
      "POST",
      """""",
      this.prefix + """accounts/link"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_Account_askMerge22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/merge")))
  )
  private[this] lazy val controllers_Account_askMerge22_invoker = createInvoker(
    Account_2.askMerge,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "askMerge",
      Nil,
      "GET",
      """""",
      this.prefix + """accounts/merge"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_Account_doMerge23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/merge")))
  )
  private[this] lazy val controllers_Account_doMerge23_invoker = createInvoker(
    Account_2.doMerge,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "doMerge",
      Nil,
      "POST",
      """""",
      this.prefix + """accounts/merge"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_Signup_forgotPassword24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login/password/forgot")))
  )
  private[this] lazy val controllers_Signup_forgotPassword24_invoker = createInvoker(
    Signup_1.forgotPassword(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Signup",
      "forgotPassword",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """login/password/forgot"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_Signup_doForgotPassword25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login/password/forgot")))
  )
  private[this] lazy val controllers_Signup_doForgotPassword25_invoker = createInvoker(
    Signup_1.doForgotPassword,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Signup",
      "doForgotPassword",
      Nil,
      "POST",
      """""",
      this.prefix + """login/password/forgot"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_Dashboard_dashboard26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard")))
  )
  private[this] lazy val controllers_Dashboard_dashboard26_invoker = createInvoker(
    Dashboard_3.dashboard,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Dashboard",
      "dashboard",
      Nil,
      "GET",
      """""",
      this.prefix + """dashboard"""
    )
  )

  // @LINE:49
  private[this] lazy val controllers_Upload_upload27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customerdata")))
  )
  private[this] lazy val controllers_Upload_upload27_invoker = createInvoker(
    Upload_0.upload,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Upload",
      "upload",
      Nil,
      "GET",
      """""",
      this.prefix + """customerdata"""
    )
  )

  // @LINE:50
  private[this] lazy val controllers_Upload_doUpload28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customerdata")))
  )
  private[this] lazy val controllers_Upload_doUpload28_invoker = createInvoker(
    Upload_0.doUpload,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Upload",
      "doUpload",
      Nil,
      "POST",
      """""",
      this.prefix + """customerdata"""
    )
  )

  // @LINE:54
  private[this] lazy val controllers_Assets_versioned29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned29_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:55
  private[this] lazy val controllers_WebJarAssets_at30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("webjars/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_WebJarAssets_at30_invoker = createInvoker(
    WebJarAssets_5.at(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WebJarAssets",
      "at",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """webjars/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_6.index)
      }
  
    // @LINE:7
    case controllers_Application_restricted1_route(params) =>
      call { 
        controllers_Application_restricted1_invoker.call(Application_6.restricted)
      }
  
    // @LINE:8
    case controllers_Application_jsRoutes2_route(params) =>
      call { 
        controllers_Application_jsRoutes2_invoker.call(Application_6.jsRoutes)
      }
  
    // @LINE:10
    case controllers_Application_profile3_route(params) =>
      call { 
        controllers_Application_profile3_invoker.call(Application_6.profile)
      }
  
    // @LINE:12
    case controllers_Application_login4_route(params) =>
      call { 
        controllers_Application_login4_invoker.call(Application_6.login)
      }
  
    // @LINE:13
    case controllers_Application_doLogin5_route(params) =>
      call { 
        controllers_Application_doLogin5_invoker.call(Application_6.doLogin)
      }
  
    // @LINE:15
    case com_feth_play_module_pa_controllers_Authenticate_logout6_route(params) =>
      call { 
        com_feth_play_module_pa_controllers_Authenticate_logout6_invoker.call(Authenticate_7.logout)
      }
  
    // @LINE:16
    case com_feth_play_module_pa_controllers_Authenticate_authenticate7_route(params) =>
      call(params.fromPath[String]("provider", None)) { (provider) =>
        com_feth_play_module_pa_controllers_Authenticate_authenticate7_invoker.call(Authenticate_7.authenticate(provider))
      }
  
    // @LINE:18
    case controllers_Application_signup8_route(params) =>
      call { 
        controllers_Application_signup8_invoker.call(Application_6.signup)
      }
  
    // @LINE:19
    case controllers_Application_doSignup9_route(params) =>
      call { 
        controllers_Application_doSignup9_invoker.call(Application_6.doSignup)
      }
  
    // @LINE:21
    case controllers_Signup_unverified10_route(params) =>
      call { 
        controllers_Signup_unverified10_invoker.call(Signup_1.unverified)
      }
  
    // @LINE:22
    case controllers_Signup_oAuthDenied11_route(params) =>
      call(params.fromPath[String]("provider", None)) { (provider) =>
        controllers_Signup_oAuthDenied11_invoker.call(Signup_1.oAuthDenied(provider))
      }
  
    // @LINE:24
    case controllers_Signup_verify12_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_Signup_verify12_invoker.call(Signup_1.verify(token))
      }
  
    // @LINE:25
    case controllers_Signup_exists13_route(params) =>
      call { 
        controllers_Signup_exists13_invoker.call(Signup_1.exists)
      }
  
    // @LINE:27
    case controllers_Signup_resetPassword14_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_Signup_resetPassword14_invoker.call(Signup_1.resetPassword(token))
      }
  
    // @LINE:28
    case controllers_Signup_doResetPassword15_route(params) =>
      call { 
        controllers_Signup_doResetPassword15_invoker.call(Signup_1.doResetPassword)
      }
  
    // @LINE:30
    case controllers_Account_changePassword16_route(params) =>
      call { 
        controllers_Account_changePassword16_invoker.call(Account_2.changePassword)
      }
  
    // @LINE:31
    case controllers_Account_doChangePassword17_route(params) =>
      call { 
        controllers_Account_doChangePassword17_invoker.call(Account_2.doChangePassword)
      }
  
    // @LINE:33
    case controllers_Account_verifyEmail18_route(params) =>
      call { 
        controllers_Account_verifyEmail18_invoker.call(Account_2.verifyEmail)
      }
  
    // @LINE:35
    case controllers_Account_link19_route(params) =>
      call { 
        controllers_Account_link19_invoker.call(Account_2.link)
      }
  
    // @LINE:37
    case controllers_Account_askLink20_route(params) =>
      call { 
        controllers_Account_askLink20_invoker.call(Account_2.askLink)
      }
  
    // @LINE:38
    case controllers_Account_doLink21_route(params) =>
      call { 
        controllers_Account_doLink21_invoker.call(Account_2.doLink)
      }
  
    // @LINE:40
    case controllers_Account_askMerge22_route(params) =>
      call { 
        controllers_Account_askMerge22_invoker.call(Account_2.askMerge)
      }
  
    // @LINE:41
    case controllers_Account_doMerge23_route(params) =>
      call { 
        controllers_Account_doMerge23_invoker.call(Account_2.doMerge)
      }
  
    // @LINE:43
    case controllers_Signup_forgotPassword24_route(params) =>
      call(params.fromQuery[String]("email", Some(""))) { (email) =>
        controllers_Signup_forgotPassword24_invoker.call(Signup_1.forgotPassword(email))
      }
  
    // @LINE:44
    case controllers_Signup_doForgotPassword25_route(params) =>
      call { 
        controllers_Signup_doForgotPassword25_invoker.call(Signup_1.doForgotPassword)
      }
  
    // @LINE:47
    case controllers_Dashboard_dashboard26_route(params) =>
      call { 
        controllers_Dashboard_dashboard26_invoker.call(Dashboard_3.dashboard)
      }
  
    // @LINE:49
    case controllers_Upload_upload27_route(params) =>
      call { 
        controllers_Upload_upload27_invoker.call(Upload_0.upload)
      }
  
    // @LINE:50
    case controllers_Upload_doUpload28_route(params) =>
      call { 
        controllers_Upload_doUpload28_invoker.call(Upload_0.doUpload)
      }
  
    // @LINE:54
    case controllers_Assets_versioned29_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned29_invoker.call(Assets_4.versioned(path, file))
      }
  
    // @LINE:55
    case controllers_WebJarAssets_at30_route(params) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_WebJarAssets_at30_invoker.call(WebJarAssets_5.at(file))
      }
  }
}
