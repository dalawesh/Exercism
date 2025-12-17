/*object Bob {
  def response(statement: String): String = statement match{

    // Konvention ist in Pattern-matching immer statt dem originalen Variablen Namen
    // den Name des Cases weiterzuverwenden

    case s if s.trim.isEmpty => "Fine. Be that way!"

    // Fehler war, dass Leerzeichen und Fragezeichen nicht für isUpper abgefragt werden können.
    case cq if cq.nonEmpty && cq.last == '?' && cq.forall(_.isUpper) => "Calm down, I know what I'm doing!"
    
    case q if (q.trim.nonEmpty && q.last == '?') => "Sure." 

    //case c if c.nonEmpty && c.isLetter && c.forall(_.isUpper) || => "Whoa, chill out!"
    case c if c.exists(_.isLetter) && c.forall(ch => !ch.isLetter || ch.isUpper) => "Whoa, chill out!"

    
    
    
    
    case _ => "Whatever."
  }
}
*/

// Chatty konnte die letzten 2 fehlenden Tests passen
object Bob {
  def response(statement: String): String = statement match {

    case s if s.trim.isEmpty =>
      "Fine. Be that way!"

    case cq if cq.trim.nonEmpty &&
               cq.trim.last == '?' &&
               cq.exists(_.isLetter) &&
               cq.forall(ch => !ch.isLetter || ch.isUpper) =>
      "Calm down, I know what I'm doing!"

    case c if c.exists(_.isLetter) &&
              c.forall(ch => !ch.isLetter || ch.isUpper) =>
      "Whoa, chill out!"

    case q if q.trim.nonEmpty && q.trim.last == '?' =>
      "Sure."

    case _ =>
      "Whatever."
  }
}
