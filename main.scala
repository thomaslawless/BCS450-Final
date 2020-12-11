object main {
  def main(args: Array[String]):Unit = {
    //Test code for markHomeworkComplete, feel free to remove
    val a = new Homework("Homework 1", "12/2")
    markHomeworkComplete(a, 1200)
  }
  def markHomeworkComplete[A](homework: Homework, input: A): Unit = {
    println(input.getClass.getSimpleName)
    if(input.getClass.getSimpleName == "Boolean") {
      homework.completed = true
    }
    if(input.getClass.getSimpleName == "String"){
      homework.dateCompleted = input.toString
      homework.completed = true
    }
    if(input.getClass.getSimpleName == "Double"){
      homework.grade = extractDouble(input)
      homework.completed = true
    }
    if(input.getClass.getSimpleName == "Integer"){
      homework.timeCompleted = extractInt(input)
      homework.completed = true
    }
    println(homework.name + " is now marked as completed.")
  }
  //Converts an object of type A into double, used in markHomeworkComplete.
  def extractDouble(x: Any): Double = x match {
    case n: java.lang.Number => n.doubleValue()
  }
  def extractInt(x: Any): Int = x match {
    case n: java.lang.Number => n.intValue()
  }


}
