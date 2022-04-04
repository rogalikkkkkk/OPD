package task2

import io.mockk.spyk
import io.mockk.verify
import kotlin.test.Test

class SubscribersTest {

    @Test
    fun subUnsubTest() {
        val sub1: Subscriber = spyk(Subscriber("SUBSCRIBER1"))
        val sub2: Subscriber2 = spyk(Subscriber2("SUBSCRIBER2"))
        val countdown = Countdown()

        countdown.subscribe(sub1)
        countdown.subscribe(sub2)
        countdown.notifySubscribers(400)
        countdown.unsubscribe(sub2)
        countdown.notifySubscribers(50)

        verify(exactly = 2) { sub1.doSomething(any()) }
        verify(exactly = 1) { sub2.doSomething(any()) }
    }
}
