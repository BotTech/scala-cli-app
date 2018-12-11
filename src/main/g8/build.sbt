name := "$name;format="norm"$"
description := """$purpose$"""
organization := "$organization$"
organizationName := "$organizationName$"
homepage := Some(url("https://github.com/$organizationName;format="word"$/$name;format="norm"$"))
licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))

scalaVersion := "$scalaVersion$"

libraryDependencies += "com.github.scopt" %% "scopt" % "$scoptVersion$"
libraryDependencies += "com.lihaoyi" %% "utest" % "$uTestVersion$" % Test
testFrameworks += new TestFramework("utest.runner.Framework")

publishMavenStyle := true

bintrayOrganization := Some("$organizationName;format="lower"$")
bintrayPackageLabels := Seq("scala", "cli")

ghreleaseRepoOrg := organizationName.value

publishLocal / gpgSignArtifacts := false
gpgPassphrase := Option(System.getenv("PGP_PASS"))
gpgKeyFile := file("travis") / "key.asc"
gpgKeyFingerprint := "TODO!"
