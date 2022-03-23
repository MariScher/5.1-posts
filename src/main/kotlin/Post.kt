enum class PostType {
    Post, Copy, Reply, Postpone, Suggest
}

data class Post(
    var id: Int = 0,
    val ownerId: Int = 0,
    val fromId: Int = 0,
    val createdBy: Int = 0,
    val date: Int = 0,
    val text: String = "",
    val replyOwnerId: Int = 0,
    val replyPostId: Int = 0,
    val friendsOnly: Boolean = false,
    val comments: Comments = Comments(),
    val copyright: String = "",
    val likes: Likes = Likes(),
    val reposts: Reposts = Reposts(),
    val views: Views = Views(),
    val postType: PostType = PostType.Post,
    val signerId: Boolean = false,
    val canPin: Boolean = false,
    val canDelete: Boolean = false,
    val canEdit: Boolean = false,
    val isPinned: Boolean = false,
    val markedAsAds: Boolean =false,
    val isFavorite: Boolean = false,
    val donut: Donut = Donut(),
    val postponedId: Int = 0
) {

    data class Comments(
        val count: Int = 0,
        val canPost: Boolean = false,
        val groupsCanPost: Boolean = false,
        val canClose: Boolean = false,
        val canOpen: Boolean = false
    )

    data class Likes(
        val count: Int = 0,
        val userLikes: Boolean = false,
        val canLike: Boolean = false,
        val canPublish: Boolean = false
    )

    data class Reposts(
        val count: Int = 0,
        val userReposted: Boolean = false
    )

    data class Views(
        val count: Int = 0
    )

    data class Donut(
        val isDonut: Boolean = false,
        val PaidDuration: Int = 0,
        val placeHolder: String = "",
        val canPublishFreeCopy: Boolean = false,
        val editMode: String = ""
    )
}