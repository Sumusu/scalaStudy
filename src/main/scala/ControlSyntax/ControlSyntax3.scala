package ControlSyntax

object ControlSyntax3 {
  def main(args: Array[String]): Unit = {
    for (a <- 1 to 1000; b <- 1 to 1000; c <- 1 to 1000 if a * a == b * b + c * c) {
      println((a, b, c))
    }
  }
}