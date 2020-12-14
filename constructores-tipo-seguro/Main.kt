import java.time.LocalTime

fun main() {
    val horario1 = Horario(Pair<LocalTime, LocalTime>(LocalTime.of(12, 30), LocalTime.of(15,45)))

    val coordenadas1 = Coordenadas(41.3980, 2.1651)

    val direccion1 = Direccion("Barcelona", "Avenida Diagonal", 400, coordenadas1)

    val restaurante1 = Restaurante("Café de Roma", direccion1, horario1)
}
