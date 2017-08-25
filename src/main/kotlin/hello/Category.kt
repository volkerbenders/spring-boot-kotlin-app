package hello

import javax.persistence.*

@Entity
class Category(val name : String = "Default Categoryname",
               @Id
               @GeneratedValue(strategy = GenerationType.AUTO)
               val id  : Long = 0
               //,

               //@ManyToOne
               //val bookmark : Bookmark!
                )
