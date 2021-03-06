def calificacion () = {
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
}

def hospital () = {
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
}

def empresa () = {
println ("Empresa.")
println ("Ingresar los datos que se piden por favor.")
println ("   ")

println ("Inversión de la primera persona: ")
	val inv1 = readFloat ()
println ("Inversión de la segunda persona: ")
	val inv2 = readFloat ()
println ("Inversión de la tercera persona: ")
	val inv3 = readFloat ()

	val invtotal = inv1 + inv2 + inv3
println ("   ")
println ("Inversión total: " +invtotal)

	val porinv1 = (inv1 * 100) / invtotal
	val porinv2 = (inv2 * 100) / invtotal
	val porinv3 = (inv3 * 100) / invtotal

println ("   ")
println ("El porcentaje de la primera persona es: " +porinv1+ " %")
println ("El porcentaje de la segunda persona es: " +porinv2+ " %")
println ("El porcentaje de la tercera persona es: " +porinv3+ " %")
}

println ("¿Cuál ejercicio desea ejecutar? ")
println ("1) Calificación. ")
println ("2) Presupuesto de un hospital. ")
println ("3) Inversión de una empresa. ")
val option = readInt ()
println ("   ")

option match {

case 1 => calificacion ()
case 2 => hospital ()
case 3 => empresa ()
case default => println ("Opción incorrecta")

}
