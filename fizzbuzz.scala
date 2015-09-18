println ("Fizzbuzz");
println ("Ingrese un número: ");
val num = readInt();
println (num);
for (i<-1 to num){
   println (" " + i + " ");
   if (i%3 == 0) {
      println (" fizz ");
   }
   if (i%5 == 0) {
      println (" buzz ");
   }
   if (i%3 == 0 && i%5 == 0){
      println (" fizzbuzz ");
   }
}
