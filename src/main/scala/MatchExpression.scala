object MatchExpression {

  def main(args: Array[String]): Unit = {

    val age = 15

    val ageResult = age match{
      case 20 => age
      case 18 => age
      case 17 => age
      case _ => "default"
    }

    println("Age is : " + ageResult)

    val i = 6

    i match{
      case 1|3|5|7 => println("i is ODD Number.")
      case 2|4|6|8 => println("i is Even Number")
    }
  }
}
