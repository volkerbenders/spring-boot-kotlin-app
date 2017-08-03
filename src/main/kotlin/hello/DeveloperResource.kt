package hello

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces

@Component
@Path("/devs")
class DeveloperResource {

    @Autowired
    lateinit var helloService: HelloService
    //@Autowired
    //lateinit var developerService: DeveloperService


    @GET
    @Path("/all")
    fun helloString() = "UuM Developers"

    @GET
    @Path("/service")
    fun helloService() = helloService.getHello()

    @GET
    @Path("/data")
    @Produces("application/json")
    fun helloData() = Hello("Hello data!")

}
