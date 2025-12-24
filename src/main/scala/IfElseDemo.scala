object IfElseDemo {

  def main(args: Array[String]): Unit = {
    
    // If else condition we can write same as Java but Scala also supports If else via expression 
    // also so less boiler plate code.
    
    val x = 20
    val res = if (x == 20) "x == 20" else "x != 20"
    print(res)

    /** apart from this all the conditional part and operator is same as java
     * 
     * Like if(x == 20 || y != 10) 
     * if(x > 20 && y<=10) 
      */
  }

}
