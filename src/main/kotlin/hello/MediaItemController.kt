package hello

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

    @GetMapping("/byTitle/{title}")
    fun findByTitle(@PathVariable("title") title : String) {
        println("MediaItemController:findByTitle: $title")
        return mediaItemService.findByTitle(title)
    }

    @GetMapping("/byId/{id}")
    fun findById(@PathVariable("id") id : Long): MediaItem {
        return mediaItemService.findById(id)
    }

    @GetMapping("/byIsbn/{isbn}")
    fun findByIsbn(@PathVariable("isbn") isbn: String): MediaItem? {
        return mediaItemService.findByIsbn(isbn)
    }
}