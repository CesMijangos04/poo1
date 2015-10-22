def Salario () = {
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
}

def Fabrica () = {
println ("Fábrica.")
println ("Ingresar los datos que se piden por favor.")
println ("   ")

println ("¿Cuántas piezas se va a comprar? ")
	val pie = readInt ()
println ("¿Cuál es el costo de las piezas? ")
	val cos = readFloat ()

	val costotal = cos * pie
println ("   ")
println ("El total a pagar es de: " +costotal)

if ( costotal > 500000) {
   val inv = costotal * .55
	 println ("La fábrica invierte el 55%: " +inv)
   val pre = costotal * .3
   println ("El banco prestará el 30%: " +pre)
   val cre = costotal * .15
   val intcre = (costotal * .3) * .2
   val tocre = cre + intcre
   println ("La fábrica pedirá a crédito el 15%: " +tocre)
   val cosfinal = inv + pre + tocre
	 println ("   ")
   println ("El monto final es de: " +cosfinal)
   }
   else
   {
      val inv = costotal * .7
  	  println ("La fábrica invierte el 70%: " +inv)
   	  val cre = costotal * .3
      val intcre = (costotal * .3) * .2
      val tocre = cre + intcre
      println ("La fábrica pedirá a crédito el 30%: " +tocre)
      val cosfinal = inv + tocre
			println ("   ")
      println ("El monto final es de: " +cosfinal)
   }
}

println ("¿Cuál ejercicio desea ejecutar? ")
println ("1) Salario semanal de un obrero. ")
println ("2) Fábrica de refacciones. ")
val option = readInt ()
println ("   ")

option match {

case 1 => Salario ()
case 2 => Fabrica ()
case default => println ("Opción incorrecta")

}
