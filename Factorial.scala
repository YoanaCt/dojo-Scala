object  Factorial {
    def main (args: Array [String]): Unit = {
        print (factorial(4))
    }
    
    def factorial(i: Int):Int =
    if(i == 0)1 else i*factorial(i-1)
}