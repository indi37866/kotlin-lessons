package classes06

fun main() {
    val media = listOf(Podcast("Darknet Diaries"), LiveStream("EGE"))
    for (i in media) {
        if (i is Downloadable) {i.dowbload()}
        i.play() && i.share()
        }
        }
}