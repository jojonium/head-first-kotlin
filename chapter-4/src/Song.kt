class Song(val title: String, val artist: String) {
    init {
        println("Created a song.")
    }
    fun play() {
        println("Playing the song $title by $artist")
    }

    fun pause() {
        println("Stopped playing $title")
    }
}

fun main(args: Array<String>) {
    val songOne = Song("The Mesopotamians", "They Might Be Giants")
    val songTwo = Song("Going Underground", "The Jam")
    val songThree = Song("Make Me Smile", "Steve Harley")
    songTwo.play()
    songTwo.pause()
    songThree.play()
}