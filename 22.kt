fun main() {
  val obj = B(5, 8, 9, 14)
  obj.printObjectsAndTheirArithmeticMean()
}
open class A(var obj1:Int, var obj2:Int) {
}
class B(var obj3:Int, var obj4:Int, obj1:Int, obj2:Int):A(obj1, obj2){
    fun printObjectsAndTheirArithmeticMean(){
        println("Value of objs: ${obj1}, ${obj2}, ${obj3}, ${obj4}")
        println("Their arithmetic mean: ${(obj1+obj2+obj3+obj4)/4}")
}
}




   //The same with secondary constructors
/*
fun main() {
  val obj = B(9, 11, 7, 3)
  obj.printObjectsAndTheirArithmeticMean()
  
                                            
}
open class A(){
    var obj1 = 1
    var obj2 = 2
    constructor( obj1:Int, obj2:Int):this(){
        this.obj1 = obj1
        this.obj2 = obj2
    }
}
class B:A{
    var obj3 = 5
    var obj4 = 3
    constructor(obj3:Int, obj4:Int, obj1:Int, obj2:Int):super(obj1, obj2) {
        this.obj3 = obj3
        this.obj4 = obj4
    }
    fun printObjectsAndTheirArithmeticMean(){
        println("Value of objs: ${obj1}, ${obj2}, ${obj3}, ${obj4}")
        println("Their arithmetic mean: ${(obj1+obj2+obj3+obj4)/4}")
  }
}*/


