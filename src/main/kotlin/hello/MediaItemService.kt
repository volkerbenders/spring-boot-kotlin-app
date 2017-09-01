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
        mediaItemRepository.findByTitle(title)
    }

    fun findById(id: Long): MediaItem {
        return mediaItemRepository.findById(id);
    }
}