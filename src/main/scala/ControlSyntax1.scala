object ControlSyntax1 {
  def main(args: Array[String]): Unit = {
    var age: Int = 5
    var isSchoolStarted: Boolean = false
    if (age > 0 && age < 7 && !isSchoolStarted) {
      println("幼児です")
    } else {
      println("幼児ではありません")
    }

  }
}