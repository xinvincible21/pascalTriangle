object PascalTriangle{

	def currentRow(previousRow:IndexedSeq[Int]) = {
	    for (index <- 0 to previousRow.length) yield {
		if(index == 0 || index == previousRow.length){
		    1
		}else{
		    previousRow(index - 1) + previousRow(index)
		}

	    }
	}

	def pascalTriangle(n:Int) = {
	    var rows = IndexedSeq(IndexedSeq(1), IndexedSeq(1, 1))
	    for (index <- 1 to n) yield {
		if (index == 1) {
		    rows(index)
		}
		else {
		    val previousRow = currentRow(previousRow = rows(index - 1))
		    rows = rows ++ IndexedSeq(previousRow)
		}
	    }
	     rows
	}
}
