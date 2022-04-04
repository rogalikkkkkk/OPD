package task2

class Countdown {

    var subscribersList: MutableList<IEventListener> = mutableListOf()

    fun subscribe(eventListener: IEventListener) {
        subscribersList.add(eventListener)
    }

    fun unsubscribe(eventListener: IEventListener) {
        subscribersList.remove(eventListener)
    }

    fun notifySubscribers(delay: Long) {
        for (subscriber in subscribersList) {
            Thread.sleep(delay)
            subscriber.doSomething("I wait $delay ms")
        }
    }

}