object PascalTriangle {
  def findPascalTriangle(n: Int) {
  val t = 
    for (row <- 0 to n) yield {
      for (col <- 0 to row) yield findRow(col, row)
    }
    t.foreach(r => println(r + " "))
  }

  def findRow(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else findRow(c - 1, r - 1) + findRow(c, r - 1)
  }
} 
