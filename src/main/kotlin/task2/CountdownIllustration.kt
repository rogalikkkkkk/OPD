package task2

fun main() {
    val countdown = Countdown()
    var delay: Long
    var subscriberNumber = 0

    while (true) {
        println("Какое действие вы хотите совершить")
        println("1 - Оповестить всех подписчиков")
        println("2 - Добавить нового подписчика")
        when(readLine()?.toIntOrNull() ?: 1) {
            1 -> {
                println("Выберите в мс время задержки")
                delay = readLine()?.toLongOrNull() ?: 0
                countdown.notifySubscribers(delay)
            }
            2 -> {
                if (subscriberNumber % 2 == 0) countdown.subscribe(Subscriber2("Sub2 number $subscriberNumber"))
                else countdown.subscribe(Subscriber("Sub number $subscriberNumber"))
                subscriberNumber++
            }
        }
    }
}