package hello.springmvc.basic;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController //Controller 는 view 이름을 반환하는 반면에
//RestController는 문자열 그자체를 반환한다.
public class LogTestController {
    // private final Logger log = LoggerFactory.getLogger(getClass());
    // @Slf4j

    @GetMapping("/log-test")
    public String logTest(){

        String name = "spring";
        // trage log = {} , name 이 방식으로 로그를 반드시 찍어야 한다
        // 자바 연산때문에 문자열이 무조건 출력되기 떄문이다.
        log.trace("trace log ={}", name);
        log.debug("trace log ={}", name);
        log.info("trace log ={}", name);
        log.warn("trace log ={}", name);
        log.error("info log={}", name);


        return "ok";

}
    }
