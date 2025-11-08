class PizzaKazan(
    neopolitanPizzaPrice: Double, romanPizzaPrice: Double,
    sicilianPizzaPrice: Double, tyroleanPizzaPrice: Double,
) : PizzaCity(
    neopolitanPizzaPrice, romanPizzaPrice,
    sicilianPizzaPrice, tyroleanPizzaPrice,
), Drink, ChekPhoto, Suase {

    var chezzesauseCount = 0
    var sichuansuaseCount = 0


    override fun suaseSale() {
        println("Вы будету соус?")
        println("1. Да \n2. Нет \n0. Cтатистика")
        when (readln()) {
            "1" -> {
                suaseCount++
                println("1. сырный соус \n2. сычуанский соус")
                when (readln()) {
                    "1" -> {
                        chezzesause()
                    }

                    "2" -> {
                        sichuansuase()
                    }
                }
                println("с вас 60 рублей")
            }

            "2" -> notsuaseCount++
            "0" -> {
                suaseStatistic()
            }
        }
    }

    override fun suaseStatistic() {
        println("Колличество проданных соусов: $suaseCount")
        println("Всего заработано денег: ${suaseCount * 60}")
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

    override fun drinkStatistic() {
        println("Колличество проданных напитков: $drinkCount")
        println("Всего заработано денег: ${drinkCount * 200}")
    }

    override fun showChekPhoto() {
        println("У вас есть фотография чека?")
        println("1. Да \n2. Нет \n0. Статистика")
        when (readln()) {
            "1" -> {
                println("Вам будет скидка 50 рублей с покупки")
                photoCount++
            }

            "0" -> {
                notphotoCount
                photoStatistic()
            }
        }

    }

    override fun photoStatistic() {
        println("Колличество проданных напитков: $photoCount")
        println("Всего заработано денег: ${photoCount * 50}")
    }


    override fun chezzesause() {
        chezzesauseCount++
        println("Спасибо за покупку сырного соуса")
    }

    override fun sichuansuase() {
        sichuansuaseCount++
        println("Спасибо за покупку сычуанского соуса")
    }

    override fun neapolitanPizzaSale() {
        neapolitanPizzaCount++
        println("Спасибо за покупку неаполитанской пиццы в Казани")
    }

    override fun romanPizzaSale() {
        romanPizzaCount++
        println("Спасибо за покупку римской пиццы в Казани")
    }

    override fun sicilianPizzaSale() {
        sicilianPizzaCount++
        println("Спасибо за покупку сицилийской пиццы в Казани")
    }

    override fun tyrolcanPizzaSale() {
        tyrolcanPizzaCount++
        println("Спасибо за покупку тирольской пиццы в Казани")
    }

}