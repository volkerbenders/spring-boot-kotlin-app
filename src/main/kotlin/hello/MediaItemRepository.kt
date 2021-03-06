package hello

import org.springframework.data.repository.CrudRepository

interface MediaItemRepository : CrudRepository<MediaItem, Long> {
    fun findByTitle(tite: String): MutableIterable<MediaItem>?
    fun findById(id: Long) :MediaItem
    fun findByIsbn(isbn: String): MediaItem?
    fun save(mediaItem: MediaItem) : MediaItem
}