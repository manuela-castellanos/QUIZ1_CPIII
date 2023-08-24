//MANUELA CASTELLANOS GIL
//ID: 704701

fun main(){

    val tarifa = 8500
    var descuento = 0.45


    println("Ingrese cuantos trayectos va a realizar: ")
    var trayectos = readln().toInt()

    var total = tarifa*trayectos



    println("Desea obtener un descuento del 45%")
    var opc = readln().toString()

    if(opc == "SI"){
        println("Cual es su edad: ")
    }
    var edad = readln().toInt()

    if(edad >= 60){
        println("El descuento es realizado")
        var vtotal = total*descuento
        println("Valor total a pagar: $vtotal")
    }else{
        println("La edad NO cumple para realizar el descuento")
        println("Valor total a pagar: $total")
    }






}