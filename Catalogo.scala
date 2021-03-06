main()

def main() {
  var nombres = new Array[String](50)
  var precios = new Array[Float](50)
  var codigos = new Array[String](50)

  catalogo(nombres, precios, codigos)
}

def catalogo(
  nombres: Array[String],
  precios: Array[Float],
  codigos: Array[String]
) {
  var opcion = 3
  var cantidadProductos = 0
  var productosAgregados = 0
  do {
    mostrarMenuPrincipal()
    opcion = readInt()
    opcion match {
      case 1 => {
        productosAgregados = agregarProductos(
          nombres, precios, codigos, cantidadProductos
        )
        cantidadProductos = productosAgregados
      }
      case 2 => println("Aún no hay que hacerlo...")
      case default => println("Adios...")
    }
  } while (opcion != 3)
}

def mostrarMenuPrincipal() {
  println("1) Agregar productos")
  println("2) Nota")
  println("3) Salir")
}

def agregarProductos(
  nombres: Array[String],
  precios: Array[Float],
  codigos: Array[String],
  cantidadProductos: Int
) : Int = {
  var continuar = 'N'
  var i = cantidadProductos
  do {
    capturarDatosProducto(nombres, precios, codigos, i)
    mostrarCatalogoProductos(nombres, precios, codigos, i)
    i = i + 1
    print("¿Quieres agregar otro producto (S/N)? ")
    continuar = readChar()
  } while (continuar == 'S')
  i
}

def capturarDatosProducto(
  nombres: Array[String],
  precios: Array[Float],
  codigos: Array[String],
  i: Int
) {
  println("Ingresa los datos del producto")
  print("Nombre: ")
  nombres(i) = readLine()
  print("Precio: ")
  precios(i) = readFloat()
  print("Código de barras: ")
  codigos(i) = readLine()
}

def mostrarCatalogoProductos(
  nombres: Array[String],
  precios: Array[Float],
  codigos: Array[String],
  i: Int
) {
  println("Nombre | Precio | Código")
  for (j <- 0 to i) {
    println(nombres(j) + " |" +  precios(j) + " | " + codigos(j))
  }
}
