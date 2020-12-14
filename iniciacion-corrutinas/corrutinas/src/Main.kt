import kotlinx.coroutines.*

fun main() {
    GlobalScope.launch {
        delay(1000L)
        println("Mundo!")
    }
    println("¡Hola, ")
    Thread.sleep(2000L)
}