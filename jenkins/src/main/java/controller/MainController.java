package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping
    @ResponseBody
    public String helloWorldFunc(){
        return "Hello, World";
    }

    @GetMapping
    @ResponseBody
    public String mwabukaNtanda(){
        return "Mwabuka, Mwane";
    }

}
