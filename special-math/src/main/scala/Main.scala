object Main extends App {
  private val argument = if (args.length != 0) args(0).toInt else 0
  println(new Math().specialMath(argument))
}
