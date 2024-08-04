object three extends App {
  val inputs = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  def filterPrime(inputs: List[Int]): List[Int] = {
    inputs.filter(number => isPrime(number))
  }

  def isPrime(number: Int): Boolean = {
    if (number <= 1) false
    else if (number == 2) true
    else if (number % 2 == 0) false
    else {
      val sqrt = math.sqrt(number).toInt
      !((3 to sqrt by 2) exists (i => number % i == 0)) 
    }
  }

  val output = filterPrime(inputs)
  println(output)  
}
