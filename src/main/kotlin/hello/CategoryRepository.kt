package hello

import org.springframework.data.repository.*;

interface CategoryRepository : CrudRepository<Category, Long> {
    fun findByName(name: String): MutableIterable<Category>?

}