fun main(){
    val obj = A()
    obj.getObjectsValProduct()
}
class A(var objval1:Int = 4, var objval2:Int = 8) {
    fun getObjectsValProduct(){
        println(objval1 * objval2)
    }
}