object Persona(primerNombre: String, segundoNombre: Option[String], apellido: String){
    val persona = new Persona("Pepito", Some("Arnulfo"), "Pérez")
    persona.nombreCompleto //Retorna "Pepito Arnulfo Pérez"

    val otraPersona = new Persona("Juan", None, "Gutiérrez")
    otraPersona.nombreCompleto //Retorna "Pepito Arnulfo Pérez"

    def nombreCompleto = {
        segundoNombre match {
            case Some(i) => println(primerNombre+" "+i+" "+apellido)
            case None => println(primerNombre+" "+apellido)
        }
    }
}