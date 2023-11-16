package blackshoe.estheteuserservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("shinhan")
public class TestController {
    @GetMapping("/cicd")
    String test() {
        return "Welcome to shinhan securities!";
    }
}
