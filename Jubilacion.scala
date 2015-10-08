println ("IMSS.")
println ("Ingresar los datos que se piden por favor.")
println ("   ")

println ("¿Cuál es tu edad?")
	val ed = readInt ()

println ("¿Qué antigüedad tienes en tu empleo?")
	val anti = readInt ()
println ("   ")

if ( ed >= 60 && anti < 25 ) {
  println ("El tipo de jubilación es por: Edad.")
  }
  if ( ed < 60 && anti >= 25 ) {
  	println ("El tipo de jubilación es por: Antigüedad joven.")
	  }
	  if( ed >= 60 && anti >= 25 ) {
  		println ("Tu tipo de jubilación es por: Antigüedad adulta.")
		  }
		  else {
		    println ("Gracias.")
		}
