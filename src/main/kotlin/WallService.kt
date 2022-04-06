class WallService {
    private var postsArray = emptyArray<Post>()
    private var comments = emptyArray<Comment>()
    private var nextId = 1

    fun add(post: Post): Post {
        postsArray += post.copy(id = nextId)
        nextId++
        postsArray += post
        return post
    }

    fun update(post: Post): Boolean {
        for (i in postsArray.indices)
            if (postsArray[i].id == post.id) {
                postsArray[i] = post.copy(id = postsArray[i].id, date = postsArray[i].date)
                return true
            }
        return false
    }

    fun createComment(comment: Comment): Boolean {
        for (i in postsArray.indices) {
            if (postsArray[i].id == comment.postId) {
                comments += comment
                return true
            }
        }
        throw PostNotFoundException()
    }
}