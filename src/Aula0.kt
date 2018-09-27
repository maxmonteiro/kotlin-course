fun main(args: Array<String>) {
    var welcome: String = "Bem-vindo"
    println(welcome)
    println("$welcome Máximo") // interpolação de string

    var price: Int = 100
    price = (90.5).toInt()
    println(price)

    var price2 = 105.50
    price2 = 90.50
    println("Preço: ${price2.toInt()}")
}