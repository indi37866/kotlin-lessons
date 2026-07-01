package classes06

fun main() {
    val media = listOf(Podcast("Darknet Diaries"), LiveStream("EGE"))
    for (i in media) {
        if (i is Downloadable) {i.download()}
        i.play()
        i.share()
        }
}
