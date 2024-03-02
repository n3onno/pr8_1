class Poezdka(val numPoezd: Int, val punktNazn: String, val dayS: String, var timeP: Int, var timeS: Int)
{
    fun getinfo() {
        println("Поезд №$numPoezd")
        println("Пункт назначения: $punktNazn")
        println("Дни следования: $dayS")
        println("Время прибытия: ${timeformat(timeP)}")
        println("Время стоянки: ${timeformat(timeS)}")
    }
    private fun timeformat(time:Int): String{
        val hour = time /60
        val min=time%60
        return String.format("$hour:$min")
    }
}
fun main() {
    val poezdka = Poezdka(
        numPoezd = 12,
        punktNazn = "Москва",
        dayS = "Пн, Вт, Ср",
        timeP = 18*60+30,
        timeS = 20
    )
    poezdka.getinfo()
    poezdka.timeP=(19*60)
    println("Измененное время прибытия:")
    poezdka.getinfo()
}