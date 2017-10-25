package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nad on 10/24/17.
 */
@RestController
public class Hello {

    @RequestMapping("/")
    public String ss()
    {
        return "its nadav first web server";
    }
}
