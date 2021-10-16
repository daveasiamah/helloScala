package part2OOP

import scala.language.postfixOps

/* Novel: name, year of release, author
* Methods:
* - authorAge
* - isWrittenby (author)
* - copy(new year of release) -> new instance of Novel
* */

class Novel(name: String, year: Int, author: Writer) {
  def authorAge: Int = year - author.year

  def isWrittenBy(author: Writer): Boolean = {
    author == this.author
  }

  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}
