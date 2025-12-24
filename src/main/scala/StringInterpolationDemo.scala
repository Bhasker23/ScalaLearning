object StringInterpolationDemo {

  def main(args: Array[String]): Unit = {
    val name = "Bhasker"
    val age = 26

    // String Interpolation Example
    //1
    println(name + " is " + age + " year old")

    //2) S type Interpolation
    println(s"$name is $age  year old")

    //3) f type Interpolation
    println(f"$name%s is $age%d  year old")

    //4) raw type Interpolation
    println(s"Hello \nworld")
    println(raw"Hello \n World")
  }

}
