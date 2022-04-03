class DocumentAttachment : Attachment {
    override val type: String = "Document"

    data class Document(
        val id: Int,
        val ownerId: Int,
        val title: String,
        val size: Int,
        val ext: String,
        val url: String,
        val date: Int
    )
}