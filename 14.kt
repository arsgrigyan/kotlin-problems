fun main() {
  var zangvats = arrayOf(arrayOf(3, 4, 6),arrayOf(7, 3, 9))
  var min = zangvats[0][0]
fun getMinElement(){
      for(element in zangvats){
        for(i in element){
            if (i < min) min = i
        }
    }
    
    println(min)
}
  getMinElement()
}