object FunctionsExample {

  object Math {

    def square(x: Int): Int = {
      x * x
    }

    def add(x: Int, y: Int): Int = {
      x + y
    }

    println("Square from Math Object : " + square(5))
  }


  def subtract(x : Int, y :Int): Int = { x - y }

  def main(args: Array[String]): Unit = {

    val math = Math
    val squareResult = math square 2
    println("Square from Function Object : " + squareResult)


    println(Math.add(10, 5))
  //  println(Math square 5 )
    println( Math add(15 , 10))

    println(
    )
    println("Anonymous Function  ")

    val add = ( x:Int , y :Int) => x+y

    println(add(5,5))



  }


}


