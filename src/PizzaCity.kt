abstract class PizzaCity(
    val neapolitanPizzaPrice: Double, val romanPizzaPrice: Double,
    val sicilianPizzaPrice: Double, val tyrolcanPizzaPrice: Double,
) {
    var neapolitanPizzaCount = 0
    var romanPizzaCount = 0
    var sicilianPizzaCount = 0
    var tyrolcanPizzaCount = 0

    abstract fun neapolitanPizzaSale()
    abstract fun romanPizzaSale()
    abstract fun sicilianPizzaSale()
    abstract fun tyrolcanPizzaSale()

   fun showStatistics() {
        println("Продано сицилийской пиццы: $sicilianPizzaCount")
        println("Продано неаполитанской пиццы: $neapolitanPizzaCount")
        println("Продано римской пиццы: $romanPizzaCount")
        println("Продано тирольской пиццы: $tyrolcanPizzaCount")

        val money = neapolitanPizzaCount * neapolitanPizzaPrice + romanPizzaCount * romanPizzaPrice +
                sicilianPizzaCount * sicilianPizzaPrice + tyrolcanPizzaCount * tyrolcanPizzaPrice

        println("Всего заработано денег: $money")
    }
}