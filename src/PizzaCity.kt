abstract class PizzaCity(
    val neapolitanPizzaPrice: Double, val romanPizzaPrice: Double,
    val sicilianPizzaPrice: Double, val tyrolcanPizzaPrice: Double,
) {
    var neapolitanPizzaCount = 0
    var romanPizzaCount = 0
    var sicilianPizzaCount = 0
    var tyrolcanPizzaCount = 0
    var drinkCount = 0
    var photoCount = 0
    var notdrinkCount = 0
    var notphotoCount = 0
    var suaseCount = 0
    var notsuaseCount = 0
    abstract fun neapolitanPizzaSale()
    abstract fun romanPizzaSale()
    abstract fun sicilianPizzaSale()
    abstract fun tyrolcanPizzaSale()

   fun showStatistics() {
        println("Продано сицилийской пиццы: $sicilianPizzaCount")
        println("Продано неаполитанской пиццы: $neapolitanPizzaCount")
        println("Продано римской пиццы: $romanPizzaCount")
        println("Продано тирольской пиццы: $tyrolcanPizzaCount")

       var drinkStat = (drinkCount/(drinkCount+(notdrinkCount)+0.01))*100
       var photoStat = (photoCount/(photoCount+(notphotoCount)+0.01))*100
       var suaseStat = (suaseCount/(suaseCount+(notsuaseCount)+0.01))*100

       if(drinkStat>=99.0)drinkStat=100.0
       if(photoStat>=99.0)drinkStat=100.0
       if(suaseStat>=99.0)drinkStat=100.0
        val money = neapolitanPizzaCount * neapolitanPizzaPrice + romanPizzaCount * romanPizzaPrice +
                sicilianPizzaCount * sicilianPizzaPrice + tyrolcanPizzaCount * tyrolcanPizzaPrice + drinkCount*200 - photoCount*50 + suaseCount*60
       println("Процент людей взявших напиток:${drinkStat}")
       println("Процент людей показавших чек:${photoStat}")
       println("Процент людей всявших соус:${suaseStat}")
        println("Всего заработано денег: $money")
    }
}