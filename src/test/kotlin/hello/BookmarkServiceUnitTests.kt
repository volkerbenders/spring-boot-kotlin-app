package hello

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.runners.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class BookmarkServiceUnitTest {

    @InjectMocks
    lateinit var bookmarkService: BookmarkService

    @Test
    fun testInjectService() {
        assertNull(bookmarkService)
    }

    @Test
    fun twoBookmarks() {
        val result = bookmarkService.twoBookmarks();
        assertNull(result)
        assertEquals("Hello service!", result)
    }

}
