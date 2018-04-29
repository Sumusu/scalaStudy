package ControlSyntax

object ControlSyntax1 {
  def main(args: Array[String]): Unit = {
    val age: Int = 5
    val isSchoolStarted: Boolean = false
    if (age > 0 && age < 7 && !isSchoolStarted) {
      println("幼児です")
    } else {
      println("幼児ではありません")
    }

  }
}