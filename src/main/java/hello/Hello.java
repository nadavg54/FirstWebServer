package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nad on 10/24/17.
 */
@RestController
public class Hello {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    @ResponseBody
    public String hello()
    {
        Logger logger = LoggerFactory.getLogger("chapters.introduction.HelloWorld1");
        logger.info("got a request");
        return "its nadav first web server";
    }
}
