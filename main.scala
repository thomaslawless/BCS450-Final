object main {
  def main(args: Array[String]):Unit = {
    //Test code for markHomeworkComplete, feel free to remove
    val a = new Homework("Homework 1", "12/2")
    markHomeworkComplete(a, 1200)
  }
  //Polymorphic function, is used to mark homeworks as complete through a variety of means. Accepts boolean, string, double, or integer. Boolean is for a simple
  //marking of homework as completed. String is for setting the date completed and the homework as completed. Double is for setting the grade and the homework as
  //completed. Integer is for setting the time the homework was completed. Grade is a double to enable differentiation between grade and time, has the added
  // bonus of allowing grades to be decimals.
  def markHomeworkComplete[A](homework: Homework, input: A): Unit = {
    println(input.getClass.getSimpleName)
    if(input.getClass.getSimpleName == "Boolean") {
      homework.completed = true
    }
    else if(input.getClass.getSimpleName == "String"){
      homework.dateCompleted = input.toString
      homework.completed = true
    }
    else if(input.getClass.getSimpleName == "Double"){
      homework.grade = extractDouble(input)
      homework.completed = true
    }
    else if(input.getClass.getSimpleName == "Integer"){
      homework.timeCompleted = extractInt(input)
      homework.completed = true
    }
    else{
      println("Invalid input on function markHomeworkComplete")
    }
    println(homework.name + " is now marked as completed.")
  }
  //Converts an object of type A into double, used in markHomeworkComplete.
  def extractDouble(x: Any): Double = x match {
    case n: java.lang.Number => n.doubleValue()
  }
  //Converts an object of type A into Int, used in markHomeworkComplete.
  def extractInt(x: Any): Int = x match {
    case n: java.lang.Number => n.intValue()
  }


}
