package control

class Console {
    companion object {
        fun readInt(msg: String): Int {
            var toReturn: Int? = null

            do {
                print(msg)
                val inf = readLine()

                if (inf != null && inf != "") {
                    toReturn = inf.toIntOrNull()

                    if (toReturn == null || toReturn <= 0) {
                        println("Valor inválido.")
                    }
                } else {
                    println("Valor inválido.")
                }
            } while(toReturn == null || toReturn <= 0)

            return toReturn
        }

        fun readString(msg: String): String {
            var toReturn: String? = null

            do {
                print(msg)
                val inf = readLine()

                if (inf != null && inf != "") {
                    toReturn = inf.lowercase()
                } else {
                    println("Valor inválido.")
                }
            } while(toReturn == null)

            return toReturn
        }
    }
}