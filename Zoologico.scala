printIn ("Zoológico.")
printIn ("Ingresar los datos que se piden por favor.")

var to1 = 0
var to2 = 0
var to3 = 0
println ("Opciones de animales: elefante, jirafa, chimpance.")
println ("¿Qué animal se desea estudiar? ")
	val ani = readLine ()

if (ani == "elefante") {
  for ( i<-1 to 20 ) {
    println ("¿Cuál es la edad del animal " + i + "? ")
    	val ed = readInt ()
    if (ed >= 0 && ed <= 1) {
      to1 = to1 + 1
    }
    if (ed > 1 && ed < 3) {
      to2 = to2 + 1
    }
    if (ed >= 3){
      to3 = to3 + 1
    }
  }
  	val por1 = (to1 * 100) / 20
  	val por2 = (to2 * 100) / 20
  	val por3 = (to3 * 100) / 20

  println ("Porcentaje de animales que se encuentra en la categoria de 0 a 1 año: " +por1)
  println ("Porcentaje de animales que se encuentra en la categoria mayor de 1 y menor a 3 es: " +por2)
  println ("Porcentaje de animales que se encuentra en la categoria de 3 o mas: " +por3)
}

if (ani == "jirafa") {
  for ( i<-1 to 15 ) {
    println ("¿Cuál es la edad del animal " + i + "? ")
    	val ed = readInt ()
    if (ed >= 0 && ed <= 1) {
      to1 = to1 + 1
    }
    if (ed > 1 && ed < 3) {
      to2 = to2 + 1
    }
    if (ed >= 3) {
      to3 = to3 + 1
    }
  }
  val por1 = (to1 * 100) / 15
  val por2 = (to2 * 100) / 15
  val por3 = (to3 * 100) / 15

  println ("Porcentaje de animales que se encuentra en la categoria de 0 a 1 año: " +por1)
  println ("Porcentaje de animales que se encuentra en la categoria mayor de 1 y menor a 3 es: " +por2)
  println ("Porcentaje de animales que se encuentra en la categoria de 3 o mas: " +por3)
}

if (animal == "chimpance"){
  for (i<-1 to 40) {
    println ("¿Cuál es la edad del animal " + i + "? ")
    	val ed = readInt ()
    if (ed >= 0 && ed <= 1) {
      to1 = to1 + 1
    }
    if (ed > 1 && ed < 3) {
      to2 = to2 + 1
    }
    if (ed >= 3) {
      to3 = to3 + 1
    }
  }
  val por1 = (to1 * 100) / 40
  val por2 = (to2 * 100) / 40
  val por3 = (to3 * 100) / 40

  println ("Porcentaje de animales que se encuentra en la categoria de 0 a 1 año: " +por1)
  println ("Porcentaje de animales que se encuentra en la categoria mayor de 1 y menor a 3 es: " +por2)
  println ("Porcentaje de animales que se encuentra en la categoria de 3 o mas: " +por3)
}
