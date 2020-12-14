class Receta(val ingredientes: List<String>, val pasos: List<String>)

class RecetaBuilder {
    val ingredientes = mutableListOf<String>()
    val pasos = mutableListOf<String>()

    fun ingrediente(nombre: String) {
        ingredientes.add(nombre)
    }
    fun paso(descripcion: String) {
        pasos.add(descripcion)
    }
    fun build(): Receta {
        return Receta(ingredientes, pasos)
    }
}
