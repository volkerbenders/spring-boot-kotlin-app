package hello


/**
 * Created by vbe on 08.08.17.
 */
//@Entity
class Bookmark(val title : String = "Title", val url: String = "URL",
  //                  @Id
   //                 @GeneratedValue(strategy = GenerationType.AUTO)
                    val id  : Long = 0)