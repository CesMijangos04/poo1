printIn ("Prueba.")
printIn ("Ingresar los datos que se piden por favor.")

var todia = 0 
var apto = true
for (i<-1 to 10) {
   println ("Tiempo que se tarda en el día " + i + ":   ")
       val tiem = readInt ()

   if (tiem > 16) {
       apto = false
   }
   todia = todia + tiem
}
println ("Total de los 10 días es : " +todia)
	val prom = todia / 10
println("El promedio es: " +prom)

if (prom <= 15 && apto == true) {
   println ("Si eres apto. ")
}
else {
   println ("Debes buscar otra especialidad. ")
}
