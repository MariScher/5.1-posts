class LinkAttachment : Attachment {
    override val type: String = "Document"

    data class Link(
        val url: String,
        val title: String,
        val caption: String,
        val description: String
    )
}