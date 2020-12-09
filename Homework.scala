class Homework(var inputname: String, var inputDueDate: String)
{
  //private member variables
  private var _name = inputname
  private var _dueDate=""
  private var _timeCompleted=0
  private var _dateCompleted=""
  private var _grade=0
  private var _completed = false

  //Name Getter and Setter
  def name = _name
  def name_= (newValue:String):Unit = {
    _name = newValue
  }

  //due date getter and setter
  def dueDate = _dueDate
  def dueDate_= (newValue:String):Unit = {
    _dueDate = newValue
  }

  //Time completed getter and setter
  def timeCompleted = _timeCompleted
  def timeCompleted_= (newValue:Int):Unit={
    _timeCompleted = newValue
  }

  //date completed getter and setter
  def dateCompleted = _dateCompleted
  def dateCompleted_= (newValue:String):Unit={
    _dateCompleted = newValue
  }

  //Grade getter and setter
  def grade = _grade
  def grade_= (newValue:Int):Unit={
    _grade = newValue
  }

  //completed getter and setter
  def completed = _completed
  def completed_= (newValue: Boolean):Unit={
    _completed = newValue
  }


}