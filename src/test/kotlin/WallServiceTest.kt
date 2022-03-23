import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        val service = WallService()
        val post = Post(
            id = 1,
            date = 21032022
        )

        service.add(post)

        assertTrue(post.id != 0)
    }

    @Test
    fun update_existId() {
        val service = WallService()
        service.add(Post())
        service.add(Post())
        val update = Post(id = 2)

        val result = service.update(update)

        assertTrue(result)
    }

    @Test
    fun update_notExistId() {
        val service = WallService()
        service.add(Post())
        service.add(Post())
        val update = Post(id = 3)

        val result = !service.update(update)

        assertTrue(result)
    }
}