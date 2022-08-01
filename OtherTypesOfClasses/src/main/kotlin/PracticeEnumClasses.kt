fun main(args: Array<String>) {
    var currentState = GameState.STARTED
    for(i in 1..30) {
        println("${currentState.ordinal + 1}. $currentState")
        currentState = changeState(currentState)
    }
}

fun changeState(current: GameState): GameState {
    return when(current) {
        GameState.STARTED -> GameState.PLAYING
        GameState.PLAYING -> GameState.GAMEOVER
        GameState.GAMEOVER -> GameState.STARTED
    }
}

enum class GameState {
    STARTED,
    PLAYING,
    GAMEOVER
}