class Persona (val dni: String) {

    companion object{
        val MAX_CUENTAS: Int = 3
    }

    var listaCuentas = arrayOf<Cuenta>()

    fun aniadirCuenta(cuenta:Cuenta): Array<Cuenta>{

        if (listaCuentas.size <= MAX_CUENTAS ){
            listaCuentas += cuenta

        }
        return listaCuentas
    }

    fun mostrarCuentas(listaCuentas:Array<Cuenta>): String{

        var resultado = ""
        for (elemento in listaCuentas){
            resultado = "${elemento.numCuenta}, ${elemento.saldoDisponible}"
        }
        return resultado
    }
    override fun toString(): String {
        return "Dni: $dni"
    }
}
