package task2

class Subscriber2(var subName: String) : IEventListener {

    override fun doSomething(message: String) {
        println("$message was sent by $subName which is Sub2")
    }
}