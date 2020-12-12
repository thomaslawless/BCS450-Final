package project450

object StudentSchedule {
  def main(args: Array[String]): Unit = {
    val HomeworkS = new HomeworkSchedule();
    HomeworkS.addHW("Math")("12/12/20");
    HomeworkS.addHW("Science")("12/14/20");
    println(HomeworkS.getHW("Math")("12/12/20"))
  }
}
