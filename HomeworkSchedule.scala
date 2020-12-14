package com.abdulsproject

import scala.collection.mutable.ListBuffer


class HomeworkSchedule {
  //private var hws : List[Homework] = List()
  private var hws = new ListBuffer[Homework]()
  private var size = 0

  //Add Homework to Schedule with name and due date
  def addHW(name: String)(dueDate: String): Unit = {
    val hw = new Homework(name, dueDate);
    hws += hw;
    size = size + 1
  }

  //Add Homeowkr to Schedule with predefined homework object
  def addHW(h: Homework): Unit = hws += h

  //return number of homeworks in schedule
  def getSize: Int = size

  //Retrieve homework from homework schedule
  def getHW(HWname: String)(HWdueDate: String): Boolean = {
    val hwsList = hws.toList
    var a = 0
    for (a <- 0 to size - 1) {
      var theName = hwsList(a).name
      var theDueDate = hwsList(a).dueDate
      println("theName : " + theName + " theDueDate: " + theDueDate)
      if (HWname == theName && HWdueDate == theDueDate)
        return true
    }
    return false
  }
  //
  def homeworkPerDay(a: Int, f: Int=>AnyVal): Unit {
  println("On Average," + (f/7) + "assignments need to be completed per day."
  }

}
