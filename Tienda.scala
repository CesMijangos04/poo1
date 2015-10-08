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
