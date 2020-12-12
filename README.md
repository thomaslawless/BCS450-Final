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

Homework.scala class has been updated and uploaded to main branch. USE THIS ONE!

Added main.scala to main branch because it now contains test code and markHomeworkCompleted (and its supporting functions), which is a polymorphic function.

Are they pure? I have no idea.

-Tyler


Any idea on what to do for the higher-order function? Could be used to update the homework?

-Tom

I uploaded my Homeworkschedule class in here. abdulsbranch is fucked so I just uploaded it in here. I've come up with a good idea for a pure function, I'm going to create a method that returns the average of homeworks with completed grades. If either of you guys have any better ideas let me know. I'm also gonna get started on my one page paper and a uml diagram.
