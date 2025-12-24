object ForLoopExample {

  def main(args: Array[String]): Unit = {

    println(" Below are the example of For loop Statement")
    for( i<- 1 to 5){
      println("printing i using to method : " + i)
    }

    println()
    println("Another example of writing range")
    println()

    for(i <- 1.to(5)){
      println("Printing i using - dot to (.to)  method : " +i)
    }

    println()

    for(i <- 1 until 6){
      println("Printing i using until method : " + i)
    }

    println()
    println(" For loop with multiple Range -- Like Nested loop")

    for(i <- 1 to 5; j <- 1 to 3){
      println("printing multiple range value : " + i + "  " + j)
    }

    println(" As we know Scala also provide expression - so below is the example of for lop " +
      "expressions")

    for{ i <- 1 to 6} yield { println("printing i using expression : " + i)}

    val list = List( 1,2, 36, 6, 8, 10)

    for { i <- list if i <= 10} yield { println(" filtering i with condition in loop : " + i)}
  }
}
