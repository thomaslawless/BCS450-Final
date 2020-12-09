# BCS450-Final
final project for BCS 450

Abdullah has claimed the curried function.

Tyler has claimed the polymorphic functions.

Here is my idea for an approach, we create two classes. One will be a Course class that will have variables that describe courses

class Course(var name: String, var time: Int,var days: String, var credits: Int){}
Examples: (name = "BCS450", time = 1200, days = "TUTH", credits: 3)

then we have a HomeworkSchedule class that has a variable on lists that holds these courses

class HomeworkSchedule {
  private val courses : List[Course] = List()
}

I'll create a currying function that adds courses to the HomeworkSchedule class

-Abdullah


I have no idea what could be implemented in the form of a polymorphic function.

Maybe the polymorphic function could be the function that marks assignments as completed. One function could simply mark the assignment as completed and another could do the same but with added details such as the date it was completed, the time it was completed, or the grade/feedback.

-Tyler
