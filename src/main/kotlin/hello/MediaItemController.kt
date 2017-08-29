package hello

import hello.Bookmark
import hello.BookmarkService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("mediaItems")
class MediaItemController(val mediaItemService: MediaItemService){

    @GetMapping("/all")
    //fun oneBookmark() = "Me is da Bookmark"
    fun allMediaItems() = mediaItemService.all()


    @PostMapping("/add")
    fun addMediaItem(@RequestBody mediaItem : MediaItem): MutableIterable<MediaItem>? {
        return mediaItemService.addMediaItem(mediaItem)

    }

    /*
    @GetMapping("findByTitle/{title}")
    fun findBookmarksByTitle(@PathVariable("title") title: String): MutableIterable<Bookmark>? {
        return bookmarkService.findBookmarksByTitle(title)
    }
    */


}