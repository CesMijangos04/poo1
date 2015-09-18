printIn ("Salario semanal de un obrero.")
printIn ("Ingresar los datos que se piden por favor.")

printIn ("Horas trabajas: ")
	val hotra = readFloat ()
	val hosal = hotra * 160

if ( hotra <= 40) {
    println ("El salario es de: " +hosal)
  }
  else
   {
      val hosal = (40 * 160) + ((hotra - 40) * 200)
      println ("El salario es de: " +hosal)
   }
