package hello.springmvc.basic.requestmapping;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class MappingController {

    @RequestMapping(value = "/hello-basic", method = RequestMethod.GET)
    public String helloBaisc(){
        log.info("hellobasic");
        return "ok";
    }

    @GetMapping(value = "/mapping-get-v2")
    public String mappingGetV2(){
        log.info("mapping-get-v2");
        return "get ok";
    }
    @GetMapping("/mapping/users/{userId}/orders/{orderId}")
    public String mappingPath(
            @PathVariable String userId, @PathVariable Long orderId){
        log.info("MappingPath user id = {}, order id = {}", userId, orderId);
        return "ok";
    }

    @GetMapping(value = "/mapping-param", params = "mode=debug")
    public String mappingParam(){
        log.info("mappingParam");
        return "ok";
    }


}
