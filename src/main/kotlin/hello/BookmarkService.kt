package hello

import org.springframework.stereotype.Service

@Service
class BookmarkService {
    //val devs = listOf("Benedikt", "Herve", "Eddi", "Ishita", "Florian", "Volker")

    //fun getHello() = "Hello service!"

    //fun getDevelopers() = "Benedikt, Volker, Herve, Eddi, Florian"
    fun getDevelopers(){
        Developer(1, "Volker", "Benders")
    }

    fun twoBookmarks() : List<Bookmark>{
        var bookmarks = listOf(Bookmark(title="first Bookmark", url="bookmark 1st"), Bookmark(url="second bookmark", title="second Bookmark"))
        return bookmarks
    }

    fun addBookmark(bookmark: Bookmark) : List<Bookmark>{
        return listOf(bookmark)
    }
}

//interface BookmarkRepository : JpaRepository<Bookmark, Long>