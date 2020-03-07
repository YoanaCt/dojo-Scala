object Colecciones {
    def main (args: Array [String]): Unit = {
        
        val numeros = List(4, 8, 15, 16, 23, 42);
        val dobles  = numeros.map{ x => x*2}
        println(dobles)

        
    }
}