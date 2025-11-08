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
    var currentPizzaCity: PizzaCity

    while (true) {
        println("Добрый день! Выберите город")
        println("1. Москва\n2. Санкт-Петербург\n \n0.Выход из программы")

        currentPizzaCity = when (readln()) {
            "1" -> pizzaMoscow
            "2" -> pizzaPeter
            "0" -> break
            else -> {
                println("ERROR")
                continue
            }
        }
        println("Выберите пиццу:")
        println("1. Неополитанская пицца \n2. Рмиская пицца \n3. Сицилийская пицца \n4. Тирольская пицца \n0. Показать статистику")
        vibor(currentPizzaCity)
        when (currentPizzaCity) {
            is ChekPhoto -> pizzaMoscow.showChekPhoto()
            else -> pizzaPeter.drinkSale()
        }

    }
}

private fun vibor(currentPizzaCity: PizzaCity) {
    when (readln()) {
        "1" -> {
            currentPizzaCity.neapolitanPizzaSale()
            selectAddService(currentPizzaCity)
        }

        "2" -> {
            currentPizzaCity.romanPizzaSale()
            selectAddService(currentPizzaCity)
        }

        "3" -> {
            currentPizzaCity.sicilianPizzaSale()
            selectAddService(currentPizzaCity)
        }

        "4" -> {
            currentPizzaCity.tyrolcanPizzaSale()
            selectAddService(currentPizzaCity)
        }

        "0" -> currentPizzaCity.showStatistics()
        else -> {
            println("ERROR")
            exitProcess(1)
        }
    }
}


fun selectAddService(currentPizzaCity: PizzaCity) {
    when (currentPizzaCity) {
        is ChekPhoto -> currentPizzaCity.showChekPhoto()
        is Drink -> currentPizzaCity.drinkSale()
    }
}

