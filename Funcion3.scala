def Tienda () = {
println ("Tienda.")
println ("Ingresar los datos que se piden por favor.")
println ("   ")

println ("Total de compra: ")
	val tocom = readFloat ()
println ("Color de bolita que sacó (descuento): ")
	val color = readLine ()
println ("   ")

if (color == "blanca" || color == "blanco") {
	println("Total a pagar: " +tocom)
	}

if (color == "verde") {
	val desverde = (tocom - (tocom * .1))
	println("Total a pagar: " +desverde)
	}

if (color == "amarilla" || color == "amarillo") {
	val desamarillo = (tocom - (tocom * .25))
	println("Total a pagar: " +desamarillo)
  	}

if (color == "azul") {
	val desazul = (tocom - (tocom * .5))
	println("Total a pagar: " +desazul)
 	}

if (color == "roja" || color == "rojo") {
	val desroja = (tocom - (tocom * 1))
	println("Total a pagar: " +desroja)
	}
}

def Jubilacion () = {
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
}

println ("¿Cuál ejercicio desea ejecutar? ")
println ("1) Tienda de descuento. ")
println ("2) Clasificación de personas jubiladas en el IMSS. ")
val option = readInt ()
println ("   ")

option match {

case 1 => Tienda ()
case 2 => Jubilacion ()
case default => println ("Opción incorrecta")

}
