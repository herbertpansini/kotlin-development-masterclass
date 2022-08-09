import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {

        val myHandle = CoroutineExceptionHandler {coroutineContext, throwable ->
            println("Exception handled: ${throwable.localizedMessage}")
        }

        val job = GlobalScope.launch(myHandle) {
            println("Throwing exception from job")
            throw java.lang.IndexOutOfBoundsException()
        }
        job.join()

        val deferred = GlobalScope.async {
            println("Throwing exception from async")
            throw ArithmeticException("Exception from async")
        }
        try {
            deferred.await()
        } catch (e: ArithmeticException){
            println("Caught ArithmeticException ${e.localizedMessage}")
        }
    }
}