package hello

import org.springframework.data.repository.*;

interface CategoryRepository : CrudRepository<Category, Long> {
}