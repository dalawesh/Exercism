object Hamming {
  def distance(dnaStrandOne: String, dnaStrandTwo: String): Option[Int] = {


    if(dnaStrandOne.length != dnaStrandTwo.length){
      None
    } else {
      
    // Zwei möglichkeiten: Array von Chars oder direkt vergleichen
    //def compare(s1 : String, s2 : String) : Int = {

      
      val s1Char = dnaStrandOne.toCharArray
      val s2Char = dnaStrandTwo.toCharArray
      
      var count = 0

      
      for(i <- s1Char.indices){
        var comp = s1Char(i)
        var comp2 = s2Char(i)

        if(s1Char(i) != s2Char(i)){
          count += 1
        }



        
        /*for(j <- s2Char.indices){
          if (s2Char(j) != comp) {
            count += 1
          }
        }*/
        
      }
      
      Some(count)
    }  
  }
}
