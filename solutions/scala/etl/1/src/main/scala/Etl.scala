object Etl {
  def transform(scoreMap: Map[Int, Seq[String]]): Map[String, Int] = {

    // empty maps have to be intitialized with braces "()" at the end
    
    var newMap = Map[String, Int]()

    
    for( score <- scoreMap.keys){
      for (letter <- scoreMap(score)){
        newMap = newMap + (letter.toLowerCase -> score)
      }
    }
    newMap
  }
}
