import java.time.LocalTime

class Restaurante(val nombre: String? = null, val direccion: Direccion? = null, val horario: Horario? = null)

class Direccion(val localidad: String? = null, val calle: String? = null, val numero: Int? = null, val coordenadas: Coordenadas? = null)

class Horario(val franja: Pair<LocalTime, LocalTime>? = null)

class Coordenadas(val longitud: Double? = null, val latitud: Double? = null)

class RestauranteBuilder {
    var nombre: String? = null
    var direccion: Direccion? = null
    var horario: Horario? = null

    fun build(): Restaurante = Restaurante(nombre, direccion, horario)
}

class DireccionBuilder {
    var localidad: String? = null
    var calle: String? = null
    var numero: Int? = null
    var coordenadas: Coordenadas? = null

    fun build(): Direccion = Direccion(localidad, calle, numero, coordenadas)
}

class HorarioBuilder {
    var franja: Pair<LocalTime, LocalTime>? = null

    fun build(): Horario = Horario(franja)
}

class CoordenadasBuilder {
    var longitud: Double? = null
    var latitud: Double? = null

    fun build(): Coordenadas = Coordenadas(longitud, latitud)
}


fun restaurante(bloque: RestauranteBuilder.() -> Unit) = RestauranteBuilder().apply(bloque).build()

fun RestauranteBuilder.direccion(bloque: DireccionBuilder.() -> Unit) {
    direccion = DireccionBuilder().apply(bloque).build()
}

fun RestauranteBuilder.horario(bloque: HorarioBuilder.() -> Unit) {
    horario = HorarioBuilder().apply(bloque).build()
}
fun DireccionBuilder.coordenadas(bloque: CoordenadasBuilder.() -> Unit) {
    coordenadas = CoordenadasBuilder().apply(bloque).build()
}
