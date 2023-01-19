package hello.springmvc.basic.request;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class RequestBodyStringController {

    @PostMapping("/request-body-string-v3")
    public HttpEntity<String> RequestBodyString(HttpEntity<String> httpEntity){
        String messageBody = httpEntity.getBody();
        log.info("messageBody = {}", messageBody);
        return new HttpEntity<>("ok");
    }


    @ResponseBody
    @PostMapping("/request-body-string-v4")
    public String RequestBodyString(@RequestBody String messageBody){
        log.info("messageBody = {}", messageBody);
        return "ok";
    }
}
