package hello

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class MediaItem(val title : String = "Title"
                , val title2 : String = "Title2"
                , val type: String = "Type"
                , val isbn: String = "ISBN13"
                , val pages:Int = 0,
               @Id
               @GeneratedValue(strategy = GenerationType.AUTO)
               val id  : Long = 0)