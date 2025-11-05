import kotlin.system.exitProcess

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val pizzaMoscow = PizzaMoscow(
        175.0, 241.5,
        167.5, 215.0
    )
val pizzaPeter = PizzaPeter(
    175.0, 241.5,
    167.5, 215.0
)
val currentPizzaCity: PizzaCity

    println("Добрый день! Выберите город")
    println("1. Москва\n2. Санкт-Петербург\n")

    currentPizzaCity = when (readln()){
        "1" -> pizzaMoscow
        "2" -> pizzaPeter
        else -> {
            println("ERROR")
            exitProcess(1)
        }
    }
    when(readln()){
        "1" ->currentPizzaCity.neapolitanPizzaSale()
            "2" ->currentPizzaCity.romanPizzaSale()
        "3" -> currentPizzaCity.sicilianPizzaSale()
        "4" ->currentPizzaCity.tyrolcanPizzaSale()
        else -> {
            println("ERROR")
            exitProcess(1)
        }
    }
}