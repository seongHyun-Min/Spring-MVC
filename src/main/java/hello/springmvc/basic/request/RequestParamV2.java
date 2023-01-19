package hello.springmvc.basic.request;


import hello.springmvc.basic.HelloData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Slf4j
@Controller
public class RequestParamV2 {

    @ResponseBody // RestController와 같은 효과 뷰 조회를 이용 하지 않고 바로 HTTP 바디에 메세지를 넣어서 전달한다.
    @RequestMapping("/request-param-v2")
    public String requestParamV2(
            @RequestParam("username") String memberName,
            @RequestParam("age") int memberAge) {
        log.info("username = {}, age = {}", memberName, memberAge);
        return "ok";
    }

    @ResponseBody
    @RequestMapping("/request-param-required")
    public String requestParamRequired(
            @RequestParam(required = true) String username,
            @RequestParam(required = false) Integer age) {
        log.info("username = {}, age = {}", username, age);
        return "ok";
    }

    @ResponseBody
    @RequestMapping("/model-attribute-v1")
    public String Model(@ModelAttribute HelloData helloData) {
        log.info("username ={}, age = {}", helloData.getUsername(), helloData.getAge());
        return "ok";

    }

    @ResponseBody
    @RequestMapping("/model-attribute-v2")
    public String Model2(HelloData helloData) {
        log.info("username ={}, age = {}", helloData.getUsername(), helloData.getAge());
        return "ok";

    }
}


