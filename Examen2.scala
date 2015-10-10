def CentroAutomoviles () {
var menor = 20.0
var mayor = 0.0
var punconta = 0.0
var suma = 0.0
var promedio = 0.0

for (i <- 1 to 25) {
  println ("Ingresa el punto contaminante " +i+ " : ")
  punconta = readFloat()

  if (punconta < menor) {
    menor = punconta
  }

  if (punconta > mayor) {
    mayor = punconta
  }

  suma += punconta
  promedio = suma/25
}
println ("   ")
println ("El promedio de los puntos contaminantes es: " +promedio)
println ("El punto contaminante menor es: " +menor)
println ("El punto contaminante mayor es: " +mayor)
}

def Gobierno () {
var porpino = 0.0
var poroyamel = 0.0
var porcedro = 0.0
var numpino = 0.0
var numoyamel = 0.0
var numcedro = 0.0
println ("Medida de la superficie del terrero (hectarea = ha): ")
val medida = readFloat ()
if (medida > 100) {
  porpino = medida * .7
  poroyamel = medida * .2
  porcedro = medida * .1

  println ("   ")
  println ("Medida que se sembrará pino: " +porpino+ " ha")
  println ("Medida que se sembrará oyamel: " +poroyamel+ " ha")
  println ("Medida que se sembrará cedro: " +porcedro+ " ha")

  numpino = (porpino / 0.001) * 8
  numoyamel = (poroyamel / 0.0015) * 15
  numcedro = (porcedro / 0.0018) * 10

  println ("   ")
  println ("Número de pinos sembrados: " +numpino)
  println ("Número de oyameles sembrados: " +numoyamel)
  println ("Número de cedros sembrados: " +numcedro)
}
  if (medida <= 100) {
    porpino = medida * .5
    poroyamel = medida * .3
    porcedro = medida * .2

    println ("   ")
    println ("Medida que se sembrará pino: " +porpino+ " ha")
    println ("Medida que se sembrará oyamel: " +poroyamel+ " ha")
    println ("Medida que se sembrará cedro: " +porcedro+ " ha")

    numpino = (porpino / 0.001) * 8
    numoyamel = (poroyamel / 0.0015) * 15
    numcedro = (porcedro / 0.0018) * 10

    println ("   ")
    println ("Número de pinos sembrados: " +numpino)
    println ("Número de oyameles sembrados: " +numoyamel)
    println ("Número de cedros sembrados: " +numcedro)
    }
}

println ("¿Cuál ejercicio desea ejecutar? ")
println ("1) Centro de verificación de automóviles. ")
println ("2) Reforestación del bosque. ")
val option = readInt ()
println ("   ")

option match {

case 1 => CentroAutomoviles ()
case 2 => Gobierno ()
case default => println ("Opción incorrecta")
}
