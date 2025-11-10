import kotlin.system.exitProcess
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val pizzaKazan = PizzaKazan(
        175.0, 241.5,
        167.5, 215.0
    )
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
        println("1. Москва\n2. Санкт-Петербург\n3. Казань\n0. Выход из программы")

        currentPizzaCity = when (readln()) {
            "1" -> pizzaMoscow
            "2" -> pizzaPeter
            "3" -> pizzaKazan
                "0" -> break
            else -> {
                println("Ты ошибся пиши цифры и от нуля до трех, да они еще должны быть целыми, ну всмыслу цифры")
                continue
            }
        }

        println("Выберите пиццу:")
        println("1. Неополитанская пицца \n2. Рмиская пицца \n3. Сицилийская пицца \n4. Тирольская пицца \n0. Показать статистику")
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
                continue
            }
        }
        when (currentPizzaCity) {
            is Suase -> {
                pizzaKazan.suaseSale()
                pizzaKazan.drinkSale()
                pizzaKazan.showChekPhoto()
            }
            is ChekPhoto -> pizzaMoscow.showChekPhoto()
            else -> pizzaPeter.drinkSale()
        }
    }
}
fun selectAddService(currentPizzaCity: PizzaCity) {
    when (currentPizzaCity) {
        is Suase -> currentPizzaCity.suaseSale()
        is Drink -> currentPizzaCity.drinkSale()
        is ChekPhoto -> currentPizzaCity.showChekPhoto()
    }
}

