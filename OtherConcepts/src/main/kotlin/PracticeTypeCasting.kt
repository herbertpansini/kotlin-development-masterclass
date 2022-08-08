import kotlin.random.Random

fun main(args: Array<String>) {
    for(i in 1..10) {
        println("$i.")
        val service = getNetWorkService()
        (service as? FTPService)?.transferFile()
    }
}

open class NetWorkService

class FTPService: NetWorkService() {
    fun transferFile() = println("Transferring a file via FTP")
}

fun getNetWorkService(): NetWorkService {
    return if (Random.nextInt() % 2 == 0)
            NetWorkService()
        else
            FTPService()
}