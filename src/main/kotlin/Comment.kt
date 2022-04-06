import Post.Donut

data class Comment(
    val postId: Int = 0,
    val fromId: Int = 0,
    val date: Int = 0,
    val donut: Donut = Donut(),
    val text: String = "",
    val replyToUser: Int = 0,
    val attachments: Array<Attachment>? = emptyArray(),
    val parentsStack: Array<Int> = emptyArray(),
    val thread: Thread = Thread()
)

data class Thread(
    val count: Int = 0,
    val canPost: Boolean = false,
    val showReplyBoolean: Boolean = false,
    val groupsCanPost: Boolean = false
)