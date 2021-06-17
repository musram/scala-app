
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/msr/withBalaji/play-authenticate-usage-scala-master-version4/conf/routes
// @DATE:Fri Jun 02 06:28:18 IST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:15
package com.feth.play.module.pa.controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:15
  class ReverseAuthenticate(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.feth.play.module.pa.controllers.Authenticate.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:16
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "com.feth.play.module.pa.controllers.Authenticate.authenticate",
      """
        function(provider0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider0))})
        }
      """
    )
  
  }


}
