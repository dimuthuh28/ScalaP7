object second extends App{

  val inputs = List(1, 2, 3, 4, 5)

  def calculateSquare(inputs: List[Int]): List[Int] ={
    inputs.map(i => i* i)
  }

  val outputs = calculateSquare(inputs)
  println(outputs)


}