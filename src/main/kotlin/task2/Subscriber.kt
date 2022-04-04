package task2

class Subscriber(var subName: String) : IEventListener {

    override fun doSomething(message: String) {
        println("$message was sent by $subName")
    }
}