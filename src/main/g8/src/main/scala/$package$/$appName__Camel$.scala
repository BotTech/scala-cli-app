package $package$

import $package$.$appName;format="Camel"$Settings._

object $appName;format="Camel"$ extends App {

  ArgParser().parse(args, Config()).foreach(run)

  private def run(config: Config): Unit = {
    // TODO
  }
}
