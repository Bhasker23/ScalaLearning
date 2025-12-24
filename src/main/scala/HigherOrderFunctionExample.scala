object HigherOrderFunctionExample {

  /* Higher Order functions are those function which accepts method/function as a function
  * parameter. */
  
  
  def math(a : Double,b : Double, f :(Double,Double) => Double) : Double = f(a,b)

  def calculate(a : Double,b: Double, c: Double , p:(Double, Double) => Double) = p(p(a,b), c)

  def main(args: Array[String]): Unit = {
    println(math(50,20, (x, y) => x+y))

    println("_ is wildcard which means anything")
    println(calculate(10, 20, 30, _+_))

    println("Max is : " + calculate(10, 20, 30, _ max _))
    println("Min is : " + calculate(10, 20, 30, _ min _))


  }

}
