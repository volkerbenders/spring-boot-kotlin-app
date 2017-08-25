package hello

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("categories")
class CategoryController(val categoryService: CategoryService){

    @GetMapping("/all")
    //fun oneBookmark() = "Me is da Bookmark"
    fun all() = categoryService.all()

    @PostMapping("/add")
    fun addCategory(@RequestBody category: Category): Category {
        return categoryService.addCategory(category)
    }

    @PostMapping("/addAndGet")
    fun addAndGetCategory(@RequestBody category: Category): Category {
        return categoryService.addCategory(category)
    }

    @PutMapping("/put")
    fun putCategory(@RequestBody category: Category): Category {
        return categoryService.addCategory(category)
    }

/*

    @PostMapping("/add")
    fun addBookmark() : Iterable<Bookmark>{
        val bookmark = Bookmark()
        return categoryService.addBookmark(bookmark)

    }

    @GetMapping("/add2/{title}/{url}")
    fun addBookmarkGet(@PathVariable title: String, @PathVariable url:String) : Iterable<Bookmark>{
        val bookmark = Bookmark(title=title, url=url)
        return categoryService.addBookmark(bookmark)

    }

    @PostMapping("/addCategoryPost")
    fun addCategorykPost(@RequestBody category : Category) : Iterable<Category>{
        //return bookmarkService.addBookmark(bookmark)
        return categoryService.addBookmarkWithCategory(bookmark)

    }
*/

}
