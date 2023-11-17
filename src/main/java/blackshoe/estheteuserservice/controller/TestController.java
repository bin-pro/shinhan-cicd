package blackshoe.estheteuserservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("shinhan")
public class TestController {
    @GetMapping("/cicd")
    String test() {
        return "신한투자증권 ICT 기획운영부 개인과제 제출 시연 - 인턴사원 이수빈";
    }
}
