package classes06

abstract class MediaFile {
    abstract val title: String
    abstract fun play()
}

class Podcast(override val title: String) : MediaFile(), Downloadable, Shareable {
    override fun share() {
        println("Делимся подкастом с получателем")
    }

    override fun play() {
        println("Подкаст воспроизводится")
    }
}

class LiveStream(override val title: String) : MediaFile(), Shareable {
    override fun share() {
        println("Делимся эфиром с получателем")
    }
    override fun play {
        println("Эфир воспроизводится")
    }
}
