package hello

import javax.persistence.*
/**
 * Created by vbe on 08.08.17.
 */
@Entity
class Bookmark(val title : String = "Title", val url: String = "URL",
                    @Id
                    @GeneratedValue(strategy = GenerationType.AUTO)
                    val id  : Long = 0  //,
               //@OneToOne
               //val category : Category = Category("Volkers Default Category", -1)

               //     ,
               //@OneToMany(          //cascade = arrayOf(CascadeType.ALL),
               //        mappedBy = "post", orphanRemoval = true)
               //val categories : List<Category> = listOf(Category("name", 0))

)