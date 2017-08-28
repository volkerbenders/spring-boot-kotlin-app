package hello

import org.springframework.data.repository.*;

interface BookmarkRepository : CrudRepository<Bookmark, Long> {
    fun findByTitle(title: String): MutableIterable<Bookmark>?
}
