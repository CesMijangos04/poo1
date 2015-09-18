printIn ("Calificación de algoritmos.")
printIn ("Ingresar los datos que se piden por favor.")

printIn ("Primer parcial: ")
	val cal1 = readFloat ()
printIn ("Segundo parcial: ")
	val cal2 = readFloat ()
printIn ("Tercer parcial: ")
	val cal3 = readFloat ()
	val promedio = (cal1 + cal2 + cal3)/3
	val porpromedio = promedio * 5.5
printIn ("El porcentaje del promedio es: " +porpromedio)

printIn ("Calificación del examen final: ")
	val calfin = readFloat ()
	val porcalfin = calfin * 3
printIn ("El porcentaje del examen final es: " +porcalfin)

printIn ("Calificación del trabajo final: ")
	val caltra = readFloat ()
	val porcaltra = caltra * 1.5
printIn ("El porcentaje del trabajo final es: " +porcaltra)

	val final = porpromedio + porcalfin + porcaltra
printIn ("El porcentaje final es: " +final)
