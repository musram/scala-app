
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/msr/withBalaji/play-authenticate-usage-scala-master-version4/conf/routes
// @DATE:Fri Jun 02 06:28:18 IST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
