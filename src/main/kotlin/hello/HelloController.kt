package hello

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("hello")
class HelloController (val bookmarkService: BookmarkService){

    @Autowired
    lateinit var helloService: HelloService

//    @GetMapping("/string")
    fun helloString() = "Hello string! (HelloController)"

//    @GetMapping("/service")
    fun helloService() = helloService.getHello() +  "(HelloController)"

//    @GetMapping("/data")
    fun helloData() = Hello("Hello data! (HelloController)")


    //@GetMapping("/developers")
    //fun helloDeveloper() = Developer(0, "Volker", "Benders")

//    @GetMapping("/developers")
    fun helloDeveloper() {
        val list = ArrayList<Developer>(1)
        list.add(Developer(0, "bla", "fasel"))
        list.add(Developer(1, "volker", "benders"))
        list.add(Developer(2, "benedikt", "eger"))
    }



}
