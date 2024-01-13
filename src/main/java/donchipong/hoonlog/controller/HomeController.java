package donchipong.hoonlog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class HomeController {
    @GetMapping("/")
    public String hello() {
        log.info("home");
        return "home";
    }

    @GetMapping("/cors-test")
    public List<String> test() {
        return List.of("data1", "data2");
    }
}