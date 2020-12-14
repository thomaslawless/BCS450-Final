import scala.io.StdIn.readLine

object main {
  def main(args: Array[String]):Unit = {
    //Test code for markHomeworkComplete, feel free to remove, remove before shipping!
    val a = new Homework("Homework 1", "12/2")
    markHomeworkComplete(a, 1200)
  }
  //Polymorphic function, is used to mark homeworks as complete through a variety of means. Accepts boolean, string, double, or integer. Boolean is for a simple
  //marking of homework as completed. String is for setting the date completed and the homework as completed. Double is for setting the grade and the homework as
  //completed. Integer is for setting the time the homework was completed. Grade is a double to enable differentiation between grade and time, has the added
  // bonus of allowing grades to be decimals.
  def markHomeworkComplete[A](homework: Homework, input: A): Unit = {
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
    else if(input.getClass.getSimpleName != "Integer" && input.getClass.getSimpleName != "Double" && input.getClass.getSimpleName != "String" && input.getClass.getSimpleName != "Boolean"){
      println("Invalid input on function markHomeworkComplete")
      sys.exit()
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


  println("Welcome to Homework Manager")
  println("Please select a function:")
  println("1. Add an Assignment" + "2. Retrieve Assignment" + "3. Total Assignemnts" + "4. Quit")
  val input = readLine()
  if (input == 1){
    println("Please enter the A. Name of the Assignment B. DueDate")
    val name = readLine();
    val dueDate = readLine();
  }if (input == 2){
    println("Please enter the A. Name of the Assignment B. DueDate")
    val name = readLine();
    val dueDate = readLine();
  }if (input == 3){
    println("The total amount of assignments is" + getSize())
  }if (input == 4){
    System.exit(0);
  }
  }



}
