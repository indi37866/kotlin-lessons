package lambda12

fun main() {
    val operation: (Int, Int, Operation) -> Int
    operation = {firstNum: Int, secondNum: Int, oper: Operation -> when (oper) {
        MINUS -> println("{Int - Int}")
        PLUS -> println("{Int + Int}")
        MULTIPLY -> println("{Int * Int}")
    } }
    operation(12, 23, Operation.MULTIPLY)
}