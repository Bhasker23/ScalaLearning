object partiallyAppliedFunctionExample {

  def main(args: Array[String]): Unit = {

    // A simple Anonymous function
    val sum = (a : Int , b: Int, c :Int) => a+b+c
    println(("This is fully applied method, because we are providing all the values for " +
      "function : " + sum(50,20,30)))
    println()
    val sumResult = sum(50,20, _)
    println("This is Partially applied method, because we are providing only wildcard values " +
      "for function : " + sumResult(30))

  }

}
