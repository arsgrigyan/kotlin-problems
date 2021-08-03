fun main() {
  var zangvats = arrayOf(
      arrayOf(3, 4, 6, 4, 1),
      arrayOf(7, 3, 9, 7, 8),
      arrayOf(4, 11, 7, 4, 32),
      arrayOf(7, 3, 9, 1, 2),
      arrayOf(4, 11, 7, 9, 7)
      )
      
      var sum = 0;
      for(i in zangvats.indices) {
          sum += zangvats[i][i]
          sum += zangvats[i][(zangvats[i].size-1) - i]
      }
      println(sum)
      
}