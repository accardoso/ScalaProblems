object Main extends App {

  println("Problema 1: Dada uma string, que consiste de caracteres minúsculos de a até z, remova todos os caracteres\nque se repetirem utilizado programação funcional.")
  val str = "xjjyyzzzx"
  println(s"Por exemplo, para a string: $str")
  println(s"O resultado obtido é: ${Problem1.removeDuplicates(str)}")

  println("\n*****************************\n")

  println(List("Problema 2: Dado um número inteiro x, encontre o dígito especial, usando programação funcional, seguindo as regras abaixo:",
    "- Quando a quantidade de caracteres de x for apenas 1 o dígito especial é o próprio valor de x;",
    "- Senão a soma dos dígitos do x deverá ser feito recursivamente até chegar na regra acima.").mkString("\n"))
  val inputNumber = 4256976
  println(s"Por exemplo, para o número de entrada: $inputNumber")
  println(s"O resultado obtido é: ${Problem2.specialDigit(inputNumber)}")

}
