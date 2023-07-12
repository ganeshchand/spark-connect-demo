lazy val sparkApp = (project in file("spark-app"))
  .settings(
    name := "spark-app",
    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-connect-client-jvm" % "3.4.1",
      "org.apache.spark" %% "spark-catalyst" % "3.4.1"
    )
  )

lazy val sparkConnectServer = (project in file("spark-connect-server"))
  .settings(
    name := "spark-connect-server",
    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-sql" % "3.4.1",
      "org.apache.spark" %% "spark-connect" % "3.4.1"
    )
  )

lazy val SparkConnectScalaDemo = (project in file("."))
  .aggregate(sparkApp, sparkConnectServer)
  .settings(
    name         := "spark-connect-scala-demo",
    version      := "0.0.1-SNAPSHOT",
    scalaVersion := "2.12.17"
  )
