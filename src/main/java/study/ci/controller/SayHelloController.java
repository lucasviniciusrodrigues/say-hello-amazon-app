package study.ci.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("say")
public class SayHelloController {

    @GetMapping(value="hello")
    public ResponseEntity<String> getClient(
            @RequestParam(value = "name") String name)
    {
        return new ResponseEntity<String>("{ \"hello\": \"" + name + "\"}", HttpStatus.OK);
    }
}
