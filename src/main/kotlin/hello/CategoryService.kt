package hello

import org.springframework.stereotype.Service
import org.springframework.data.repository.*;
@Service
class CategoryService (val categoryRepository: CategoryRepository) {

    fun all() = categoryRepository.findAll()

    fun addCategory(category : Category)  : MutableIterable<Category>? {
        categoryRepository.save(category)
        return all()
    }

    fun findByName(name: String): MutableIterable<Category>? {
        //return Category(name="spring", id=1)
        return categoryRepository.findByName(name)
    }
    /*
    fun getDevelopers() {
        Category("Volkers Category", 1)
    }

    fun twoBookmarks(): List<Bookmark> {
        var bookmarks = listOf(Bookmark(title = "first Bookmark", url = "bookmark 1st"), Bookmark(url = "second bookmark", title = "second Bookmark"))
        return bookmarks
    }

    fun all() = bookmarkRepository.findAll()
    //fun addBookmark(bookmark: Bookmark) : List<Bookmark>{
    fun addBookmark(bookmark: Bookmark) : Iterable<Bookmark>{
        //bookmarkRepository.save(bookmark)
        //var b = listOf(Bookmark("title", "url"), Bookmark("url", "title"), bookmark)
        bookmarkRepository.save(bookmark)
        return bookmarkRepository.findAll()
        //return bookmarkRepository.findAll()
        // return b
    }
    fun addBookmark(bookmark: Bookmark): Iterable<Bookmark> {
        bookmarkRepository.save(bookmark)
        return bookmarkRepository.findAll()
    }
*/
}

