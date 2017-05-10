val rawblocks = sc.textFile("linkage/block_*.csv")
val head = rawblocks.take(10)

def isHeader(line: String): Boolean = {
  line.contains("id_1")
}

head.filter(isHeader).foreach(println)
