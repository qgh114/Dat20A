package HandMavens.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HandMavenController {

    @GetMapping("/about")
    public String aboutProject() {
        return "about";

    }

    ;
}
