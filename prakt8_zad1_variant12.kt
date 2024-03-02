class Kinoteatr(var name: String, var seans: String, var stoimost: Double, var zal: String, var kolvoZrit: Int) {
    fun getinfo() {
        println("Фильм: $name")
        println("Сеанс: $seans")
        println("Стоимость билета: $stoimost")
        println("Зал: $zal")
        println("Количество зрителей: $kolvoZrit")
    }
    fun sellBilet(kolvoBilet: Int) {
        val sum = kolvoBilet * stoimost
        println("$kolvoBilet билетов продано на общую сумму $sum")
    }
}
fun main() {
    val kinoteatr1 = Kinoteatr("Вызов", "18:00", 104.0, "7", 100)
   kinoteatr1.getinfo()
    kinoteatr1.sellBilet(100)
}