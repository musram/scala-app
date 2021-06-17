name := """play-authenticate-usage-scala-master-version4"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"


libraryDependencies ++= Seq(
    "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test,
    "org.webjars" % "angularjs" % "1.6.2",
    "org.webjars" % "bootstrap" % "3.3.7",
    "org.webjars" % "font-awesome" % "4.7.0",
    "org.webjars" % "jquery" % "2.2.3",
    "org.webjars.bower" % "angular-bootstrap" % "2.5.0",
    "mysql" % "mysql-connector-java" % "6.0.6",
    "com.typesafe.slick" %% "slick" % "3.1.1",
    "com.typesafe.slick" %% "slick-codegen" % "3.1.1",
    "com.typesafe.play" %% "play-slick" % "2.0.2",
    "com.typesafe.play" %% "play-slick-evolutions" % "2.0.2",
    "com.zaxxer" % "HikariCP" % "2.6.1",
    "be.objectify" %% "deadbolt-scala" % "2.5.1",
    "com.feth" % "play-authenticate_2.11" % "0.8.3",
    "org.webjars" %% "webjars-play" % "2.5.0",
    "com.chuusai" %% "shapeless" % "2.3.2",
    "com.nappin" %% "play-recaptcha" % "2.1",
    "com.adrianhurt" %% "play-bootstrap" % "1.1.1-P25-B3-SNAPSHOT",
    "org.webjars" % "bootstrap-datepicker" % "1.4.0",
    cache,
    ws,
    filters,
    "org.apache.poi" % "poi" % "3.8",
    "org.apache.poi" % "poi-ooxml" % "3.9",
    specs2 % Test
)


routesGenerator := InjectedRoutesGenerator

//slick <<= slickCodeGenTask

//sourceGenerators in Compile <+= slickCodeGenTask

// code generation task
  lazy val slick = TaskKey[Seq[File]]("gen-tables")
  lazy val slickCodeGenTask = Def.task {
  val dir = sourceManaged.value
  val cp = (dependencyClasspath in Compile).value
  val r = (runner in Compile).value
  val s = streams.value
  //val outputDir = (dir / "slick").getPath // place generated files in sbt's managed sources folder
  val outputDir = ((sourceDirectory in Compile).value).getPath
  //val outputDir = "app"
  //val url = "jdbc:h2:mem:test;INIT=runscript from 'src/main/sql/create.sql'" // connection info for a pre-populated throw-away, in-memory db for this demo, which is freshly initialized on every run
  val url = "jdbc:mysql://localhost/smyd?nullNamePatternMatchesAll=true&autoReconnect=true&useSSL=false"
  val jdbcDriver = "com.mysql.cj.jdbc.Driver"
  val slickDriver = "slick.driver.MySQLDriver"
  val pkg = "dao"
  val username = "root"
  val password = "peeliamma777"
  toError(r.run("slick.codegen.SourceCodeGenerator", cp.files, Array(slickDriver, jdbcDriver, url, outputDir, pkg, username, password ), s.log))
  val fname = outputDir + "/dao/Tables.scala"
  Seq(file(fname))
}

// needed for adrianhurt's play-bootstrap dependency
resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"


resolvers ++= Seq(
  "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases",
  "secured-central" at "https://repo1.maven.org/maven2",
   Resolver.sonatypeRepo("releases"),
   Resolver.sonatypeRepo("snapshots")
)

javaOptions in Test += "-Dconfig.file=conf/application.test.conf"
  

