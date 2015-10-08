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
