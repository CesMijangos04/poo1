printIn ("Tienda.")
printIn ("Ingresar los datos que se piden por favor.")

printIn ("Total de compra: ")
	val tocom = readFloat ()
printIn ("Color de bolita que sacó (descuento): ")
	val color = readLine ()

if (color == "blanca") {
	println("Total a pagar: " +tocom)
	}

if (color == "verde") {
	val desverde = (tocom - (tocom * .1))
	println("Total a pagar:" *desverde)
	}

if (color == "amarillo") {
	val desamarillo = (tocom - (tocom * .25))
	println("Total a pagar:" *desamarillo)
  	}

if (color == "azul") {
	val desazul = (tocom - (tocom * .5))
	println("Total a pagar:" *desazul)
 	}

if (color == "roja") {
	val desroja = (tocom - (tocom * 1))
	println("Total a pagar:" *desroja)
	}
