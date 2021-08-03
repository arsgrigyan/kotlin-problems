fun main(){
  var obj1 = A(14, 7)
  var obj2 = A(15, 6)
  var obj3 = obj1 - obj2
  println(obj3.value1)
  println(obj3.value2)  
}

class A(var value1:Int = 1, var value2:Int = 2){
  
  }

operator infix fun A.minus(a:A) : A{
    var newValue = A()
    newValue.value1 = this.value1 - a.value1
    newValue.value2 = this.value2 - a.value2
    return newValue
}
