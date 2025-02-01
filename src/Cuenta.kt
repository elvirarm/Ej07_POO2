class Cuenta(val numCuenta: Int, var saldoDisponible: Double) {



    fun consultarSaldo(){
        println("$saldoDisponible")
    }

    fun recibirAbono(abono: Double): Double{
        saldoDisponible += abono
        return saldoDisponible

    }

    fun realizarPagos(pago: Double): Double{

        saldoDisponible -= pago
        return saldoDisponible
    }

    fun esMorosa(persona: Persona):Boolean{

            if(saldoDisponible < 0){
                return true
            }
            else{
                return false
            }
    }

    fun transferencia(personaA:Persona, personaB:Persona, numCuentaA: Cuenta, numCuentaB: Cuenta, cantidadDinero: Double ): Double{

        if (numCuentaA.saldoDisponible > cantidadDinero){
            numCuentaB.saldoDisponible += cantidadDinero
            numCuentaA.saldoDisponible -= cantidadDinero
        }
        return saldoDisponible


    }

    override fun toString(): String {
        return "Número de cuenta: $numCuenta, Saldo disponible: $saldoDisponible"
    }


}