scalacOptions ++= Seq("-unchecked", "-deprecation")

// Scala.js
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.5.1")

// Publishing
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.13")

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.9.7")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "2.0.1")

addSbtPlugin("org.scala-js" % "sbt-jsdependencies" % "1.0.2")

// Code Quality
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0") // scalastyle

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.5.3") // dependencyUpdates

addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.3") // scalariformFormat
