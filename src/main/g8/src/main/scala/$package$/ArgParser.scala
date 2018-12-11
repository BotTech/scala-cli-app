package $package$

import scopt.OptionParser

class ArgParser extends OptionParser[Config]("$name$") {
  head("$appName$", "version 1.0")
  help("help")
    .text("prints this usage text.")
  // TODO
}

object ArgParser {

  def apply() = new ArgParser
}
