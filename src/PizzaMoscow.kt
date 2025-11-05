class PizzaMoscow(
    neopolitanPizzaPrice: Double, romanPizzaPrice: Double,
    sicilianPizzaPrice: Double, tyroleanPizzaPrice: Double
): PizzaCity(
    neopolitanPizzaPrice, romanPizzaPrice,
    sicilianPizzaPrice, tyroleanPizzaPrice
) {
    override fun neapolitanPizzaSale(){neapolitanPizzaCount++
        println("Спасибо за покупку неаполитанской пиццы в Москве")
    }

    override fun romanPizzaSale(){romanPizzaCount++
        println("Спасибо за покупку римской пиццы в Москве")}

    override fun sicilianPizzaSale(){sicilianPizzaCount++
        println("Спасибо за покупку сицилийской пиццы в Москве")}

    override fun tyrolcanPizzaSale(){tyrolcanPizzaCount++
        println("Спасибо за покупку тирольской пиццы в Москве")}

}