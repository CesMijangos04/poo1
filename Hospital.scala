println ("Hospital.")
println ("Ingresar los datos que se piden por favor.")
println ("   ")

println ("Presupuesto anual: ")
	val preanual = readFloat ()

	val pregine = preanual * 0.4
	val pretrau = preanual * 0.3
	val preped = preanual * 0.3

println ("   ")
println ("El porcentaje de Ginecología es: " +pregine+ " %")
println ("El porcentaje de Traumatología es: " +pretrau+ " %")
println ("El porcentaje de Pediatría es: " +preped+ " %")
