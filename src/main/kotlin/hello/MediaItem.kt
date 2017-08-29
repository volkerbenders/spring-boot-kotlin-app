package hello

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class MediaItem(val title : String = "Title", val type: String = "Type",
                val isbn13: String = "ISBN13",
               @Id
               @GeneratedValue(strategy = GenerationType.AUTO)
               val id  : Long = 0)