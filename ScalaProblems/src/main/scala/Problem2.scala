object Problem2 {
  def specialDigit(inputNumber:Int):Int = {
    if (math.abs(inputNumber) < 10)
      inputNumber
    else
      specialDigit(inputNumber.toString.toList.map(digit => digit.asDigit).sum)
  }
}
