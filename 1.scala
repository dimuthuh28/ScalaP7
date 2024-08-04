
object one extends App{

  val inputInt = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  def  filterEvenNumbers(inputInt: List[Int]): List[Int]={
    inputInt.filter(input=>input % 2 == 0)
  }

  val outputInt = filterEvenNumbers(inputInt)
  println(outputInt);
}