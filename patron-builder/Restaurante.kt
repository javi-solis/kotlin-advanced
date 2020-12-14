import java.time.LocalTime

class Restaurante(var nombre: String? = null, var direccion: Direccion? = null, var horario: Horario? = null)

class Direccion(var localidad: String? = null, var calle: String? = null, var numero: Int? = null, var coordenadas: Coordenadas? = null)

class Horario(var franja: Pair<LocalTime, LocalTime>? = null)

class Coordenadas(var longitud: Double? = null, var latitud: Double? = null)

fun restaurante(bloque: Restaurante.() -> Unit) = Restaurante().apply(bloque)

fun Restaurante.direccion(bloque: Direccion.() -> Unit) {
    direccion = Direccion().apply(bloque)
}

fun Restaurante.horario(bloque: Horario.() -> Unit) {
    horario = Horario().apply(bloque)
}
fun Direccion.coordenadas(bloque: Coordenadas.() -> Unit) {
    coordenadas = Coordenadas().apply(bloque)
}
