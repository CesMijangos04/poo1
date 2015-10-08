println ("Calificación de algoritmos.")
println ("Ingresar los datos que se piden por favor.")
println ("   ")

println ("Primer parcial: ")
	val cal1 = readFloat()
println ("Segundo parcial: ")
	val cal2 = readFloat()
println ("Tercer parcial: ")
	val cal3 = readFloat()

	val promedio = (cal1 + cal2 + cal3)/3
	val porpromedio = promedio * 5.5

println ("   ")
println ("El porcentaje del promedio es: " +porpromedio+ " %")

println ("   ")
println ("Calificación del examen final: ")
	val calfin = readFloat()
	val porcalfin = calfin * 3

println ("   ")
println ("El porcentaje del examen final es: " +porcalfin+ " %")

println ("   ")
println ("Calificación del trabajo final: ")
	val caltra = readFloat()
	val porcaltra = caltra * 1.5

println ("   ")
println ("El porcentaje del trabajo final es: " +porcaltra+ " %")

	val fin = (porpromedio + porcalfin + porcaltra)
println ("   ")
println ("El porcentaje final es: " +fin+ " %")
