package part2OOP

/* Writer class
fields: first name, surname, year
* - method fullname
*/

class Writer(firstName: String, surname: String, val year: Int) {
  def fullname(): String = {
    firstName + " " + surname
  }
}
