class Homework(var inputname: String, var inputDueDate: String)
{
  //private member variables
  private var _name = inputname
  private var _dueDate=""
  private var _timeCompleted=0
  private var _dateCompleted=""
  private var _grade=0.0:Double
  private var _completed = false

  //Name Getter and Setter
  def name: String = _name
  def name_= (newValue:String):Unit = {
    _name = newValue
  }

  //due date getter and setter
  def dueDate: String = _dueDate
  def dueDate_= (newValue:String):Unit = {
    _dueDate = newValue
  }

  //Time completed getter and setter
  def timeCompleted: Int = _timeCompleted
  def timeCompleted_= (newValue:Int):Unit={
    _timeCompleted = newValue
  }

  //date completed getter and setter
  def dateCompleted: String = _dateCompleted
  def dateCompleted_= (newValue:String):Unit={
    _dateCompleted = newValue
  }

  //Grade getter and setter
  def grade: Double = _grade
  def grade_= (newValue:Double):Unit={
    _grade = newValue
  }

  //completed getter and setter
  def completed: Boolean = _completed
  def completed_= (newValue: Boolean):Unit={
    _completed = newValue
  }
  //Returns weighted grade - Pure function
  def calculateGrade(curve:Double): Double = double * _grade;
    


}
