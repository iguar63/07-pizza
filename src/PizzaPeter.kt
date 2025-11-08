class PizzaPeter(
    neopolitanPizzaPrice: Double, romanPizzaPrice: Double,
    sicilianPizzaPrice: Double, tyroleanPizzaPrice: Double,
) : PizzaCity(
    neopolitanPizzaPrice, romanPizzaPrice,
    sicilianPizzaPrice, tyroleanPizzaPrice,
), Drink {
    override fun drinkStatistic() {
        println("Колличество проданных напитков: $drinkCount")
        println("Всего заработано денег: ${drinkCount * 200}")
    }

    override fun drinkSale() {
        println("Вы будете кофе?")
        println("1. Да \n2. Нет \n0. Cтатистика")
        when (readln()) {
            "1" -> {
                println("с вас 200 рублей")
                drinkCount++
            }

            "2" -> notdrinkCount++
            "0" -> {
                drinkStatistic()
            }
        }
    }


    override fun neapolitanPizzaSale() {
        neapolitanPizzaCount++
        println("Спасибо за покупку неаполитанской пиццы в Санкт-Петербурге")
    }

    override fun romanPizzaSale() {
        romanPizzaCount++
        println("Спасибо за покупку римской пиццы в Санкт-Петербурге")
    }

    override fun sicilianPizzaSale() {
        sicilianPizzaCount++
        println("Спасибо за покупку сицилийской пиццы в Санкт-Петербурге")
    }

    override fun tyrolcanPizzaSale() {
        tyrolcanPizzaCount++
        println("Спасибо за покупку тирольской пиццы в Санкт-Петербурге")
    }

}