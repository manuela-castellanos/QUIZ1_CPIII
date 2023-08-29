//MANUELA CASTELLANOS GIL
//ID: 704701

fun main(){

    println("Primer punto")

    println()
    val tarifa = 8500
    var descuento = 0.45


    println("Ingrese cuantos trayectos va a realizar: ")
    var trayectos = readln().toInt()

    var total = tarifa*trayectos

    println("-------------------------------------------------------------------------")

    println("¿Desea obtener un descuento del 45%? (SI/1 para aplicar descuento, cualquier otro valor para NO aplicar descuento): ")
    var opc = readln().toString()

    println("-------------------------------------------------------------------------")

    if(opc == "SI" || opc == "1"){
        println("Cual es su edad: ")
    }else{
        println("Valor total a pagar: $total")
    }

    var edad = readln().toInt()

    if(edad >= 60){
   println("-------------------------------------------------------------------------")
        println("El descuento es realizado")
        var vtotal = total*descuento
        println("Valor total a pagar: $vtotal")
    }else{
        println("La edad NO cumple para realizar el descuento")
        println("Valor total a pagar: $total")
    }

    println()

    println("Segundo punto")

    var calificacciones = arrayListOf<Double>()

    println("Cuantos estdiantes son en total: ")
    var estudiantes = readln().toInt()

    println("-------------------------------------------------------------------------")

    for (i in 1 .. estudiantes){
        println("Ingrese la calificacion del estudiante $i: ")

        var calificacion = readln().toDouble()

        calificacciones.add(calificacion)
    }

    println("-------------------------------------------------------------------------")

    var promedio = calificacciones.average()
    println("El promedio es: $promedio")

    println("-------------------------------------------------------------------------")

    var calmaxima = calificacciones.maxOrNull()
    println("La calificacion mas alta es: $calmaxima")

    println("-------------------------------------------------------------------------")

    var calminima = calificacciones.minOrNull()
    println("La calificacion mas baja es: $calminima")

    println("-------------------------------------------------------------------------")

    var calimenores = calificacciones.filter { it <3.5 }
    var promediomenores = 0
        if (calimenores.isNotEmpty())calimenores.average()

    println("El promedio de las calificaciones menores a 3.5  es: $promediomenores")













}