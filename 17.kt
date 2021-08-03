fun main() {
  var zangvats = arrayOf(
      arrayOf(3, 4, 6, 4, 1),
      arrayOf(7, 3, 9, 7, 8),
      arrayOf(4, 11, 12, 4, 32),
      arrayOf(7, 3, 9, 1, 2),
      arrayOf(4, 11, 7, 9, 7)
      )
      
      var greatElement = zangvats[0][0]
    for(i in zangvats.indices){
        if(zangvats[i][i]>greatElement) greatElement = zangvats[i][i]
        if (zangvats[i][(zangvats.size-1) - i] > greatElement) greatElement = zangvats[i][(zangvats.size-1) - i]
    }
   
      println(greatElement)
      
}