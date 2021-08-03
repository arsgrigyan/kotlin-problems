fun main() {
  var mass = arrayOf(8, 6, 3, 4, 1, 9, -5, -2) 
  for(element in mass.indices){
      for (i in mass.indices-element){
          if(mass[element]<mass[i]){
          println(mass[element])
      }
      }
  }
}