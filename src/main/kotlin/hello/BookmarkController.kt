package hello

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("bookmarks")
class BookmarkController (val bookmarkService: BookmarkService){

    @GetMapping("/one")
    //fun oneBookmark() = "Me is da Bookmark"
    fun oneBookmark() = Bookmark()

    @GetMapping("/two")
    fun twoBookmarks() : List<Bookmark>{
        val bookmarks = bookmarkService.twoBookmarks() //listOf(Bookmark(), Bookmark())
        return bookmarks
    }

    @PostMapping("/add")
    fun addBookmark() : List<Bookmark>{
        val bookmark = Bookmark()
        return bookmarkService.addBookmark(bookmark)

    }

    @GetMapping("/add2/{title}/{url}")
    fun addBookmarkGet(@PathVariable title: String, @PathVariable url:String) : List<Bookmark>{
        val bookmark = Bookmark(title=title, url=url)
        return bookmarkService.addBookmark(bookmark)

    }

    @PostMapping("/addBookmarkPost")
    fun addBookmarkPost(@RequestBody bookmark : Bookmark) : List<Bookmark>{
        return bookmarkService.addBookmark(bookmark)

    }

}
