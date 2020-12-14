import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {

}

suspend fun calculoMuyCostoso(): Int {
    repeat(20) {
        println("Un cálculo  $it/19")
        delay(100L)

    }
    return 1
}

suspend fun otroCalculoMuycostoso(): Int {
    repeat (20) {
        println("Otro cálculo $it/19")
        delay(100L)

    }
    return 1
}






