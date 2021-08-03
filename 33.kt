fun main(){
    println(calculateExpressionValue(0))
}
fun calculateExpressionValue(n:Int):Double{
    var count = kotlin.math.sin(1.0)
    for(i in 0..n){
        count += kotlin.math.sin(1.0) * kotlin.math.sin(i+0.0)
    }
    return count
}