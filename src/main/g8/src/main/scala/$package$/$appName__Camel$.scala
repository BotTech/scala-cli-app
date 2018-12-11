package $package$

object $appName;format="Camel"$ extends App {

  ArgParser().parse(args, Config()).foreach(run)

  private def run(config: Config): Unit = {
    // TODO
  }
}
