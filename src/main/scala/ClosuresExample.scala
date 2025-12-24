object ClosuresExample {

  /* A Closure is a function which takes/uses one or more variables declared outside this
  function
  * */

  var number = 10

  def add(x : Int) : Int = {
   number =  x + number
    number
  }

  def main(args: Array[String]): Unit = {
    println(add(5))
    number = 15
    println(add(5))
    println(number)
  }
}
