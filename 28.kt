fun main(){
  var obj1 = A()
  obj1.Set_XYZ(3.7, 9.0, 7.1)
  var greatNum1 = obj1.Get_XYZ()
  println(greatNum1) 
  var obj2 = A()
  obj2.Set_XYZ(11.4, 6.7, 24.8)
  var greatNum2 = obj2.Get_XYZ()
  println(greatNum2)
  
  
}
class A {
    var x:Double = 1.0
    var y:Double = 2.0
    var z:Double = 3.0
   fun Set_XYZ(x:Double, y:Double, z:Double){
       this.x = x
       this.y = y
       this.z = z
   } 
   fun Get_XYZ() = when{
       x>y && x>z -> x
       y>z -> y
       else -> z
   }

}