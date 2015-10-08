println ("Salario semanal de un obrero.")
println ("Ingresar los datos que se piden por favor.")
println ("   ")

println ("Horas trabajadas: ")
	val hotra = readFloat ()
	val hosal = hotra * 160
println ("   ")

if ( hotra <= 40) {
    println ("El salario es de: " +hosal)
  }
  else
   {
      val hosal = (40 * 160) + ((hotra - 40) * 200)
      println ("El salario es de: " +hosal)
   }
