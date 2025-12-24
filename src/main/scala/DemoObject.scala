object DemoObject {

  def main(args : Array[String]): Unit = {
    println("Hello World")
  }



  var firstName = "Bhaskar" // Mutable variable, can be reassigned.
  val lastName = "Shrimali" // Immutable variable, can not be reassigned
  
  println(firstName + " "+ lastName)

  firstName = "Neha" // Reassigning, Mutable variable.

  println(firstName)

  var result = 8+7 // Here + is function name
  println(result)

  // Now below is simple example of class.
  case class Student(var rollNo : Int, var name : String, var marks : Int)

  // we can even define a default value in the same line.
  case class Teacher(var empId : Int = 1, var subject : String = "English")

  // If provide any value in below constructor it will take those other wise it will use the
  // default.
  var t1 = Teacher();
  println(t1)

  // Overloading constructor.
  val t2 = Teacher(2, "Hindi");
  println(t2)

  case class School(){

    // Function in Scala in Class
    // As in java we use void for no return type in Scala we use Unit
    def printName(): Unit = println("Masai")

    private def printRanking(ranking :Int): Unit =   println(ranking)

    def calculateRanking(noOfStudent : Int , noOfTeacher : Int): Int = {
      val cal: Int = noOfTeacher * noOfTeacher / 100
      printRanking(cal)
      cal
    }


  }

  val school = School()
  val ranking = school.calculateRanking(200, 30)
  println("Ranking of the School class is : " + ranking)

  // Defining List in Scala
  val nums = List(1,2,3,4)

  val revers = nums.reverse
  println(revers)

  val value = nums.drop(2).take(3)
  println("value " + value)
  // Enhance for loop
  for(i <- nums) println(i)


  val arr = List(1,2,true, "Hello")
  println(arr)
  
  
}
