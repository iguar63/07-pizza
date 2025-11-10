class PizzaMoscow(
    neopolitanPizzaPrice: Double, romanPizzaPrice: Double,
    sicilianPizzaPrice: Double, tyroleanPizzaPrice: Double
) : PizzaCity(
    neopolitanPizzaPrice, romanPizzaPrice,
    sicilianPizzaPrice, tyroleanPizzaPrice,
), ChekPhoto {
    override fun photoStatistic() {
        println("Колличество проданных напитков: $photoCount")
        println("Всего заработано денег: ${photoCount*50}")
    }

    override fun showChekPhoto() {
        println("У вас есть фотография чека?")
        println("1. Да \n2. Нет \n0. Статистика")
        when (readln()) {
            "1" -> {photoCount++
                println("Вам будет скидка 50 рублей с покупки")
                photoCount++
            }
            "2" -> notphotoCount++
            "0" -> {
                photoStatistic()
            }
        }

    }

    override fun neapolitanPizzaSale() {
        neapolitanPizzaCount++
        println("Спасибо за покупку неаполитанской пиццы в Москве")
    }

    override fun romanPizzaSale() {
        romanPizzaCount++
        println("Спасибо за покупку римской пиццы в Москве")
    }

    override fun sicilianPizzaSale() {
        sicilianPizzaCount++
        println("Спасибо за покупку сицилийской пиццы в Москве")
    }

    override fun tyrolcanPizzaSale() {
        tyrolcanPizzaCount++
        println("Спасибо за покупку тирольской пиццы в Москве")
    }

}