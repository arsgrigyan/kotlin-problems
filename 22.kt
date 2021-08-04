fun main() {
  val numValue = B(5, 8, 9, 14)
  numValue.printNumbersAndTheirArithmeticMean()
}
open class A(var num1:Int, var num2:Int) {
}
class B(var num3:Int, var num4:Int, num1:Int, num2:Int):A(num1, num2){
    fun printNumbersAndTheirArithmeticMean(){
        println("Value of num: ${num1}, ${num2}, ${num3}, ${num4}")
        println("Their arithmetic mean: ${(num1+num2+num3+num4)/4}")
}
}




   //The same with secondary constructors
/*
fun main() {
  val numValue = B(5, 9, 7, 3)
  numValue.printNumbersAndTheirArithmeticMean()
  
                                            
}
open class A{
    var num1:Int
    var num2:Int
    constructor(num1:Int, num2:Int){
        this.num1 = num1
        this.num2 = num2
    }
}
class B:A{
    var num3:Int
    var num4:Int
    constructor(num3:Int, num4:Int, num1:Int, num2:Int):super(num1, num2) {
        this.num3 = num3
        this.num4 = num4
    }
    fun printNumbersAndTheirArithmeticMean(){
        println("Value of nums: ${num1}, ${num2}, ${num3}, ${num4}")
        println("Their arithmetic mean: ${(num1+num2+num3+num4)/4}")
  }
} */