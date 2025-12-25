import sun.jvm.hotspot.debugger.Address

object PracticeVoterApplicable {

  def checkAge(age : Int) : Unit = if(age >= 18) println("You are Applicable to vote") else
    println("You are not Applicable")

  val address = (location: String) => println("Voting Booth At Sector 11, Noida is : " + location)

  def checkAgeAndShareAddress(age : Int , location : String,
                             // checkAge :(Int => Unit),address:(String => Unit)
                             ): Unit =
  {
     checkAge(age)
     address(location)

  }

  def main(args: Array[String]): Unit = {
    var age = 37
    var livingAddress = "Sector 11, Noida"
    val boothAddress = "Witty Internal School."
    checkAge(15)
    checkAge(18)
    address(boothAddress)
    println()
    println("Officer - Hey' I am Booth Office - How may I help you.")
    println()
    println("Voter - Hello Sir, I want to know Voting Both location.")
    println()
    println("Officer - Tell me your age and where are living")
    println()
    println(s"Voter - My age is $age and living at $livingAddress")
    println()
    print("Officer -  ")
    checkAgeAndShareAddress(age, boothAddress)



  }

}
