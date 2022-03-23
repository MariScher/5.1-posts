import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        WallService.clearPosts()
        val post = Post(
            id = 1,
            date = 21032022
        )

        WallService.add(post)

        assertTrue(post.id != 0)
    }

    @Test
    fun update_existId() {
        WallService.clearPosts()
        WallService.add(Post())
        WallService.add(Post())
        val update = Post(id = 2)

        val isUpdate = WallService.update(update)

        assertTrue(isUpdate)
    }

    @Test
    fun update_notExistId() {
        WallService.clearPosts()
        WallService.add(Post())
        WallService.add(Post())
        val update = Post(id = 4)

        val isNotUpdate = !WallService.update(update)

        assertTrue(isNotUpdate)
    }
}