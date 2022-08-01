import kotlin.random.Random

fun main(args: Array<String>) {
    val articles = arrayListOf<Article>()
    articles.add(getArticle())
    articles.add(getArticle())

    val newArticles = arrayListOf<Article>()

    articles.forEach{
        newArticles.add(it)
        newArticles.add(it.copy(title = "${it.title} for my blog"))
    }

    newArticles.forEach{
        println(it)
    }
}

fun getArticle(): Article {
    val randomTitle = "Title ${Random.nextInt(100)}"
    val numberOfReaders = Random.nextInt(100)
    return Article(randomTitle, "Some content", numberOfReaders)
}

data class Article(
    val title: String,
    val content: String,
    val numberOfReaders: Int
)