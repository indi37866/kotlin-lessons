package lambda12

fun main() {
    val operation: (Int, Int, Operation) -> Int
    operation = {firstNum: Int, secondNum: Int, oper: Operation -> when (oper) {
        Operation.MINUS -> firstNum - secondNum
        Operation.PLUS -> firstNum + secondNum
        Operation.MULTIPLY -> firstNum * secondNum
        }
    }
    val result = operation(12, 23, Operation.MULTIPLY)
    println(result)
}