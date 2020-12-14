class Caja<T>(var objeto: T) {

   fun cambiarObjeto(otroObjeto: T) {
       objeto = otroObjeto
   }

    fun obtenerObjeto() = objeto
}
