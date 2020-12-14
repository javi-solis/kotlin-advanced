import java.time.LocalTime

class Restaurante(val nombre: String, val direccion: Direccion, val horario: Horario)

class Direccion(val localidad: String, val calle: String, val numero: Int, val coordenadas: Coordenadas)

class Horario(val franja: Pair<LocalTime, LocalTime>)

class Coordenadas(val longitud: Double, val latitud: Double)

