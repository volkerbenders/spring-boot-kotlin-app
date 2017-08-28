package hello

import org.springframework.stereotype.Service
import org.springframework.data.repository.*;
@Service
class BookmarkService (val bookmarkRepository: BookmarkRepository, val categoryRepository : CategoryRepository) {
    //val devs = listOf("Benedikt", "Herve", "Eddi", "Ishita", "Florian", "Volker")

    //fun getHello() = "Hello service!"

    //fun getDevelopers() = "Benedikt, Volker, Herve, Eddi, Florian"
    fun getDevelopers() {
        Developer(1, "Volker", "Benders")
    }

    fun twoBookmarks(): List<Bookmark> {
        var bookmarks = listOf(Bookmark(title = "first Bookmark", url = "bookmark 1st"), Bookmark(url = "second bookmark", title = "second Bookmark"))
        return bookmarks
    }

    fun all() = bookmarkRepository.findAll()
    /*
    //fun addBookmark(bookmark: Bookmark) : List<Bookmark>{
    fun addBookmark(bookmark: Bookmark) : Iterable<Bookmark>{
        //bookmarkRepository.save(bookmark)
        //var b = listOf(Bookmark("title", "url"), Bookmark("url", "title"), bookmark)
        bookmarkRepository.save(bookmark)
        return bookmarkRepository.findAll()
        //return bookmarkRepository.findAll()
        // return b
    }
*/
    fun addBookmark(bookmark: Bookmark): Iterable<Bookmark> {
        bookmarkRepository.save(bookmark)
        return bookmarkRepository.findAll()
    }

    fun addBookmarkWithCategory(bookmark: Bookmark): Iterable<Bookmark> {
        var category = Category(name="Volkers Category", id=999)
        category = categoryRepository.save(category)
        bookmarkRepository.save(bookmark)
        return bookmarkRepository.findAll()
    }

    fun findBookmarksByTitle(title: String): MutableIterable<Bookmark>? {
        return bookmarkRepository.findByTitle(title)
    }
}

