fun main() {
  val obj = A()
  obj.giveObjectsValue(14, 9)
  obj.objectsValueProduct()
}
class A {
    var obj1:Int = 1
    var obj2:Int = 2  
    fun giveObjectsValue(obj1val:Int, obj2val:Int){
        obj1 = obj1val
        obj2 = obj2val
    }
    fun objectsValueProduct(){
        println(obj1 * obj2)
    }
}