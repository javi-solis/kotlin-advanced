import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val miJob = launch {
        repeat (20) {
            println("Corrutina1 $it/19")
            delay(100L)

        }
    }
    miJob.join()
}







