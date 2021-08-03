fun main(){
 var varY = C(14, 7, 3)
 varY.printAllVariables()
 varY.getMaxVariable()
}
open class A(var variable1:Int, var variable2:Int) {
 
}
class B(var variableX:Int, variable1:Int, variable2:Int):A(variable1, variable2){
    fun printAllVariables(){
      println("${variableX}, ${variable1}, ${variable2}")
     fun getMaxVariable(){ 
      if(variableX > variable1 && variableX > variable2) println(variableX)
      else if(variable1>variable2) println(variable1)
      else println(variable2)
     }
          
      }
  }

class C(var variableY:Int, variable1:Int, variable2:Int):A(variable1, variable2){
  fun printAllVariables(){
      println("${variableY}, ${variable1}, ${variable2}")
  }
  fun getMaxVariable(){ 
      if(variableY > variable1 && variableY > variable2) println(variableY)
      else if(variable1>variable2) println(variable1)
      else println(variable2)
     }
   
}
