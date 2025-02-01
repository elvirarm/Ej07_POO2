//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val persona1 = Persona("77176762D")
    val cuenta1 = Cuenta(1, 0.0)
    persona1.aniadirCuenta(cuenta1)

    val cuenta2 = Cuenta(2, 700.0)
    persona1.aniadirCuenta(cuenta2)

    cuenta1.recibirAbono(1100.0)
    cuenta2.realizarPagos(750.0)

    println("${cuenta1.esMorosa(persona1)}")

    cuenta2.transferencia(persona1, persona1, cuenta1, cuenta2, 50.0)

    println("$persona1, $cuenta1, $cuenta2")
}