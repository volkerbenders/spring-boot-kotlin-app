package hello

import hello.Bookmark
import org.springframework.data.repository.CrudRepository

interface MediaItemRepository : CrudRepository<MediaItem, Long> {

}