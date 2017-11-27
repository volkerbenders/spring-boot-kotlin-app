package hello

import org.springframework.stereotype.Service

@Service
class MediaItemService(val mediaItemRepository: MediaItemRepository) {

    fun all() = mediaItemRepository.findAll()

    fun addMediaItem(mediaItem: MediaItem)  : MutableIterable<MediaItem>? {
        mediaItemRepository.save(mediaItem)
        return all()
    }

    fun findByTitle(title: String) {
        println("findByTitle: " + title)
        mediaItemRepository.findByTitle(title)
    }

    fun findById(id: Long): MediaItem {
        return mediaItemRepository.findById(id)
    }
    fun findByIsbn(isbn: String): MediaItem? {
        return mediaItemRepository.findByIsbn(isbn)
    }
}