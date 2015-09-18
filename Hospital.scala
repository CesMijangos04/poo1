printIn ("Hospital.")
printIn ("Ingresar los datos que se piden por favor.")

printIn ("Presupuesto anual: ")
	val preanual = readFloat ()

	val pregine = preanual * 0.4
	val pretrau = preanual * 0.3
	val preped = preanual * 0.3

printIn ("El porcentaje de Ginecología es: " +pregine)
printIn ("El porcentaje de Traumatología es: " +pretrau) 
printIn ("El porcentaje de Pediatría es: " +preped)
