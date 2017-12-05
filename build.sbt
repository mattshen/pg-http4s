organization := "io.github.mattshen"
name := "pg-http4s"
version := "0.0.1-SNAPSHOT"
scalaVersion := "2.12.3"


val Http4sVersion = "0.18.0-M5"
val Specs2Version = "4.0.0"
val LogbackVersion = "1.2.3"
val doobieVersion = "0.5.0-M9"

libraryDependencies ++= Seq(
  "org.http4s"     %% "http4s-blaze-server"  % Http4sVersion,
  "org.http4s"     %% "http4s-circe"         % Http4sVersion,
  "org.http4s"     %% "http4s-dsl"           % Http4sVersion,
  "org.specs2"     %% "specs2-core"          % Specs2Version % "test",
  "ch.qos.logback" %  "logback-classic"      % LogbackVersion,

  // Start with this one
  "org.tpolecat" %% "doobie-core"         % doobieVersion,

  // And add any of these as needed
  "org.tpolecat" %% "doobie-h2"           % doobieVersion, // H2 driver 1.4.196 + type mappings.
  "org.tpolecat" %% "doobie-hikari"       % doobieVersion, // HikariCP transactor.
  "mysql"        % "mysql-connector-java" % "5.1.45",
  "org.tpolecat" %% "doobie-specs2"       % doobieVersion, // Specs2 support for typechecking statements.
  "org.tpolecat" %% "doobie-scalatest"    % doobieVersion  // ScalaTest support for typechecking statements.

)

