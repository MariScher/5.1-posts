class VideoAttachment : Attachment {
    override val type: String = "Video"

    data class Video(
        val id: Int,
        val ownerId: Int,
        val title: String,
        val description: String,
        val duration: Int,
        val url: String,
        val addingDate: Int,
        val views: Int,
        val comments: Int,
        val player: String
    )
}