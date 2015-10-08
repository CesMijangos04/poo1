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
