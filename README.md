# sbt-cli-app.g8

[![Build Status]](https://travis-ci.org/BotTech/sbt-cli-app)

A [Giter8][g8] template to create a Scala CLI App.

## Plugins

The generated project uses the following sbt plugins:
* [BotTech/sbt-gpg] - creates signatures of the artifacts with GnuPG.
* [dwijnand/sbt-dynver] - dynamically determines version numbers from git tags.
* [ohnosequences/sbt-github-release] - publishes releases to [GitHub].
* [sbt/sbt-bintray] - publishes releases to [Bintray].
* [scopt/scopt] - provides simple scala command line options parsing.

## Usage

1. [Install sbt 1.0.0 or higher][sbt Setup]
1. On the command line type:
   ```bash
   sbt new BotTech/sbt-cli-app.g8
   ```
1. You will be prompted for a few basic settings for your project.
1. sbt will create a plugin project for you.
1. Follow the instructions in `SETUP.md`.

## Credits

Credit to these Open Source projects:
* [BotTech/sbt-gpg]
* [dwijnand/sbt-dynver]
* [ohnosequences/sbt-github-release]
* [rtimush/sbt-updates]
* [sbt/sbt-bintray]
* [scopt/scopt]

Special thanks to:
* [GitHub] for hosting the git repository.
* [Lightbend] for [Scala] and [sbt].
* [scalacenter] for [Scala].
* [Travis CI] for running the build.
* All the other contributors who made this project possible.

[Bintray]: https://bintray.com
[BotTech/sbt-gpg]: https://github.com/BotTech/sbt-gpg
[Build Status]: https://travis-ci.org/BotTech/sbt-gpg.svg?branch=master
[dwijnand/sbt-dynver]: https://github.com/dwijnand/sbt-dynver
[g8]: http://www.foundweekends.org/giter8
[Github]: https://github.com
[Lightbend]: https://www.lightbend.com
[ohnosequences/sbt-github-release]: https://github.com/ohnosequences/sbt-github-release
[rtimush/sbt-updates]: https://github.com/rtimush/sbt-updates
[sbt]: https://www.scala-sbt.org
[sbt Setup]: http://www.scala-sbt.org/release/docs/Setup.html
[sbt/sbt-bintray]: https://github.com/sbt/sbt-bintray
[scopt/scopt]: https://github.com/scopt/scopt
[Scala]: https://www.scala-lang.org
[scalacenter]: https://scala.epfl.ch
[Travis CI]: https://travis-ci.org
