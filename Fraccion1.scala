Fraccion ()

def Fraccion () {
  var option = 5
  do {
    mostrarMenuPrincipal ()
    option = readInt()
    option match {
      case 1 => Suma ()
      case 2 => Resta ()
      case 3 => Multiplicacion ()
      case 4 => Division ()
      case default => println ("Adios...")
    }
  } while (option != 5)
}

def mostrarMenuPrincipal () {
  println ("      OPERACIONES EN FRACCIONES. ")
  println (" Elegir la operación que desea realizar. ")
  println ("1) Suma. ")
  println ("2) Resta. ")
  println ("3) Multiplicacion. ")
  println ("4) Division. ")
  println ("5) Salir. ")
}

def Suma () {
  var continuar = 'N'
  do {
    class Racional(n: Int, d: Int) {
      val numerador = n
      val denominador = d

      def Suma (b: Racional): Racional = {
        new Racional(
          numerador * b.denominador + denominador * b.numerador,
          denominador * b.denominador
        )
      }
    }
    println ("   ")
    print("Numerador de la primera fraccion: ")
    val n1 = readInt()
    print("Denominador de la primera fraccion: ")
    val d1 = readInt()
    val fraccion1 = new Racional(n1, d1)
    println ("   ")

    print("Numerador de la segunda fraccion: ")
    val n2 = readInt()
    print("Denominador de la segunda fraccion: ")
    val d2 = readInt()
    val fraccion2 = new Racional(n2, d2)

    val suma = fraccion1.Suma(fraccion2)

    println ("   ")
    println("Resultado: " + suma.numerador + "/" + suma.denominador)
    println ("   ")
    print("¿Quieres hacer otra suma (S/N)? ")
    continuar = readChar()
    println ("   ")
  } while (continuar == 'S' || continuar == 's' )
}

def Resta () {
  var continuar = 'N'
  do {
    class Racional(n: Int, d: Int) {
      val numerador = n
      val denominador = d

      def Resta (b: Racional): Racional = {
        new Racional(
          numerador * b.denominador - denominador * b.numerador,
          denominador * b.denominador
        )
      }
    }
    println ("   ")
    print("Numerador de la primera fraccion: ")
    val n1 = readInt()
    print("Denominador de la primera fraccion: ")
    val d1 = readInt()
    val fraccion1 = new Racional(n1, d1)
    println ("   ")

    print("Numerador de la segunda fraccion: ")
    val n2 = readInt()
    print("Denominador de la segunda fraccion: ")
    val d2 = readInt()
    val fraccion2 = new Racional(n2, d2)

    val resta = fraccion1.Resta(fraccion2)

    println ("   ")
    println ("Resultado: " + resta.numerador + "/" + resta.denominador)
    println ("   ")
    print("¿Quieres hacer otra resta (S/N)? ")
    continuar = readChar()
    println ("   ")
  } while (continuar == 'S' || continuar == 's' )
}

def Multiplicacion () = {
  var continuar = 'N'
  do {
    class Racional(n: Int, d: Int) {
      val numerador = n
      val denominador = d

      def Multiplicacion (b: Racional): Racional = {
        new Racional(
          numerador * b.numerador ,
          denominador * b.denominador
        )
      }
    }
    println ("   ")
    print("Numerador de la primera fraccion: ")
    val n1 = readInt()
    print("Denominador de la primera fraccion: ")
    val d1 = readInt()
    val fraccion1 = new Racional(n1, d1)
    println ("   ")

    print("Numerador de la segunda fraccion: ")
    val n2 = readInt()
    print("Denominador de la segunda fraccion: ")
    val d2 = readInt()
    val fraccion2 = new Racional(n2, d2)

    val multiplicacion = fraccion1.Multiplicacion (fraccion2)

    println ("   ")
    println ("Resultado: " + multiplicacion.numerador + "/" + multiplicacion.denominador)
    println ("   ")
    print("¿Quieres hacer otra multiplicacion (S/N)? ")
    continuar = readChar()
    println ("   ")
  } while (continuar == 'S' || continuar == 's' )
}

def Division () = {
  var continuar = 'N'
  do {
    class Racional(n: Int, d: Int) {
      val numerador = n
      val denominador = d

      def Division (b: Racional): Racional = {
        new Racional(
          numerador * b.denominador,
            denominador * b.numerador
        )
      }
    }
    println ("   ")
    print("Numerador de la primera fraccion: ")
    val n1 = readInt()
    print("Denominador de la primera fraccion: ")
    val d1 = readInt()
    val fraccion1 = new Racional(n1, d1)
    println ("   ")

    print("Numerador de la segunda fraccion: ")
    val n2 = readInt()
    print("Denominador de la segunda fraccion: ")
    val d2 = readInt()
    val fraccion2 = new Racional(n2, d2)

    val division = fraccion1.Division(fraccion2)

    println ("   ")
    println ("Resultado: " + division.numerador + "/" + division.denominador)
    println ("   ")
    print("¿Quieres hacer otra division (S/N)? ")
    continuar = readChar()
    println ("   ")
  } while (continuar == 'S' || continuar == 's' )
}
