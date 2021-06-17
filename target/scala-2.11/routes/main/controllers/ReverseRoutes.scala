
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/msr/withBalaji/play-authenticate-usage-scala-master-version4/conf/routes
// @DATE:Fri Jun 02 06:28:18 IST 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:54
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:54
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:55
  class ReverseWebJarAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:55
    def at(file:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "webjars/" + implicitly[PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:49
  class ReverseUpload(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:49
    def upload(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "customerdata")
    }
  
    // @LINE:50
    def doUpload(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "customerdata")
    }
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def doSignup(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:10
    def profile(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "profile")
    }
  
    // @LINE:8
    def jsRoutes(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "assets/javascript/routes.js")
    }
  
    // @LINE:18
    def signup(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:13
    def doLogin(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:7
    def restricted(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "restricted")
    }
  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:12
    def login(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:21
  class ReverseSignup(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def exists(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "accounts/exists")
    }
  
    // @LINE:24
    def verify(token:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "accounts/verify/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
    }
  
    // @LINE:21
    def unverified(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "accounts/unverified")
    }
  
    // @LINE:22
    def oAuthDenied(provider:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "authenticate/" + implicitly[PathBindable[String]].unbind("provider", dynamicString(provider)) + "/denied")
    }
  
    // @LINE:27
    def resetPassword(token:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "accounts/password/reset/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
    }
  
    // @LINE:28
    def doResetPassword(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "accounts/password/reset")
    }
  
    // @LINE:44
    def doForgotPassword(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login/password/forgot")
    }
  
    // @LINE:43
    def forgotPassword(email:String = ""): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "login/password/forgot" + queryString(List(if(email == "") None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)))))
    }
  
  }

  // @LINE:47
  class ReverseDashboard(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:47
    def dashboard(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "dashboard")
    }
  
  }

  // @LINE:30
  class ReverseAccount(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def askMerge(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "accounts/merge")
    }
  
    // @LINE:41
    def doMerge(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "accounts/merge")
    }
  
    // @LINE:33
    def verifyEmail(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "accounts/verify")
    }
  
    // @LINE:37
    def askLink(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "accounts/link")
    }
  
    // @LINE:38
    def doLink(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "accounts/link")
    }
  
    // @LINE:30
    def changePassword(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "accounts/password/change")
    }
  
    // @LINE:35
    def link(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "accounts/add")
    }
  
    // @LINE:31
    def doChangePassword(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "accounts/password/change")
    }
  
  }


}
